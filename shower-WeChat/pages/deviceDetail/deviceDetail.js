var api = require('../../config/api.js');
var util = require('../../utils/util.js');
var user = require('../../utils/user.js');
// 引入SDK核心类
var QQMapWX = require('../../lib/qqmap/qqmap-wx-jssdk.js');
import Toast from '../../miniprogram_npm/@vant/weapp/toast/toast';
var qqmapsdk;

const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    item:{},
    img: []
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(options)
    this.getDetail(options.id)
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },
  //监听下滑
  onReachBottom() {
  },
  //获取详情
  getDetail(id){
    let that = this
    util.request(api.DeviceInfoDetail, {
      id: id
    }, 'GET').then(function (res) {
      console.log(res)
      if (res.code === 200) {
        that.setData({
          item: res.data
        })
        that.setData({
          img: [res.data.picture]
        })
        that.initMap(res.data)
      } else {
        util.showErrorToast(res.message)
      }
    });
  },

  //页面下单
  useDevice: function (e) {
    if (!app.globalData.hasLogin) {
      wx.navigateTo({
        url: "/pages/auth/login/login"
      });
      return;
    }
    let userInfo = wx.getStorageSync('userInfo');
  
    var deviceCode = e.target.dataset.code;
    var runStatus = e.target.dataset.runStatus
    if(runStatus != 0){
      Toast("设备正在使用,不可下单。")
      return
    }
    util.request(api.AddOrder, {
      openId: userInfo.openId,
      deviceCode: deviceCode,
      type: 2
    }, 'POST').then(function (res) {
      console.log(res)
      if (res.code === 200) {
        util.showSuccessToast("下单成功")
      } else {
        Toast(res.message)
      }
    });
  },
  //初始化地图
  initMap(item){f
    let that = this;
    // 实例化API核心类
    qqmapsdk = new QQMapWX({
      key: app.globalData.key
    });
    wx.getLocation({
      type: 'gcj02',
      success(res) {
        // 调用sdk接口
        qqmapsdk.reverseGeocoder({
          location: {
            latitude: res.latitude,
            longitude: res.longitude
          },
          success: function (res) {
            var lat = res.result.location.lat;
            var lng = res.result.location.lng;
            var address = res.result.address;
            that.setData({
              latitude: lat,
              longitude: lng,
              address: address,
              markers: [{
                id: "0",
                latitude: item.latitude,
                longitude: item.longitude,
                iconPath: "/static/image/location.png",
                width: 40,
                height: 40,
                callout: {
                  'display': 'BYCLICK', 'fontSize': '30rpx', 'content': item.areaName+item.buildingName,
                  'padding': '8rpx', 'boxShadow': '0 0 5rpx #333', 'borderRadius': '4rpx'
                }
              }],
              includePoints:[{
                id: "0",
                latitude: lat,
                longitude: lng,
                iconPath: "/static/image/location.png",
                width: 40,
                height: 40,
                callout: {
                  'display': 'BYCLICK', 'fontSize': '30rpx', 'content': address,
                  'padding': '8rpx', 'boxShadow': '0 0 5rpx #333', 'borderRadius': '4rpx'
                }
              },{
                  id: "0",
                  latitude: item.latitude,
                  longitude: item.longitude,
                  iconPath: "/static/image/location.png",
                  width: 40,
                  height: 40,
                  callout: {
                    'display': 'BYCLICK', 'fontSize': '30rpx', 'content': item.areaName+item.buildingName,
                    'padding': '8rpx', 'boxShadow': '0 0 5rpx #333', 'borderRadius': '4rpx'
                  }
              }]
            })
            console.log(res)  //获取成功
          }
        })
      }
      })
  },
    //点击标记点对应的气泡时触发
    bindcallouttap:function(e){
      console.log(e)
    },
    //
    bindmarkertap: function(e){
      let plugin = requirePlugin('routePlan');
      let key = app.globalData.key;  //使用在腾讯位置服务申请的key
      let referer = '居家';   //调用插件的app的名称
      let endPoint = JSON.stringify({  //终点
        'name': this.data.item.areaName+this.data.item.buildingName,
        'latitude': this.data.item.latitude,
        'longitude': this.data.item.longitude
      });
      wx.navigateTo({
        url: 'plugin://routePlan/index?key=' + key + '&referer=' + referer + '&endPoint=' + endPoint
      });
      console.log(e)
    },
})