//index.js
//获取应用实例
const app = getApp()
var api = require("../../config/api.js");
var util = require('../../utils/util.js');

Page({
  data: {
    motto: 'Hello World',
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    orderNo:"",
    createDate:"",
    status:"",
    payResult:false,
    creatHidden: false,
    overHidden:true
  },
  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function () {
    if (app.globalData.userInfo) {
      this.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (this.data.canIUse){
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          this.setData({
            userInfo: res.userInfo,
            hasUserInfo: true
          })
        }
      })
    }
  },
  getUserInfo: function(e) {
    console.log(e)
    app.globalData.userInfo = e.detail.userInfo
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  },



  //点击开始控件
  jumPagesCreat:function(e){
    let that = this;
    var imei="11111";
    var openId = wx.getStorageSync("openId");
      util.request(api.orderCreat, {
        openId: openId,
        imei: imei
      }).then(function (res) {
        console.log(res)
        if (res) {
          if ("ok" == res.code) {
            var data = res.data;
            var state = data.status;
            if ("0" == state) {
              state = "使用中";
            }
            wx.setStorageSync('orderNo', data.orderNo);
            that.setData({
              orderNo: data.orderNo,
              createDate: data.createDate,
              status: state,
              creatHidden:true,
              overHidden:false
            });
            wx.showToast({
              title: "下单成功",
              icon: "success",
              duration: 1000,
              mask: true
            })
          } else {
            wx.showToast({
              title: res.message,
              icon: "none",
              duration: 1000,
              mask: true
            })
          }
        } else {
          wx.showToast({
            title: "操作失败",
            icon: "none",
            duration: 1000,
            mask: true
          })
        }
      })
  },

  //点击结束控件
  jumPagesOver: function(e) {
      let that = this;
      var openId = wx.getStorageSync("openId");
      var orderId = wx.getStorageSync("orderNo");
      console.log(openId + "/" + orderId)
      util.request(api.orderOver, {
          orderId : orderId,
          openId : openId
        }).then(function (res) {
          if (res) {
            console.log(res)
            const payParam = res.data;
            console.log(payParam)
            if ("ok" == res.code){
              wx.requestPayment({
                'timeStamp': payParam.timeStamp,
                'nonceStr': payParam.nonceStr,
                'package': payParam.packageValue,
                'signType': payParam.signType,
                'paySign': payParam.paySign,
                'success': function (res) {
                  console.log("支付过程成功")
                  that.setData({
                    payResult: true
                  });
                },
                'fail': function (res) {
                  console.log("支付过程失败")
                  util.showErrorToast('支付失败');
                },
                'complete': function (res) {
                  console.log("支付过程结束")
                }
              });
            }else{
              wx.showToast({
                title: "操作失败",
                icon: "none",
                duration: 1000,
                mask: true
              })
            }
            
          }
        });
    }

})
