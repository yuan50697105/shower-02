var util = require('../../../utils/util.js');
var api = require('../../../config/api.js');
var user = require('../../../utils/user.js');

Page({
  data: {
    orderNo: 0,
    orderInfo: {},
    items:[],
    orderGoods: [],
    expressInfo: {},
    flag: false,
    handleOption: {},
    showPayPwdInput: false, //是否展示密码输入层
    pwdVal: '', //输入的密码
    payFocus: true, //文本框焦点
    showSetPayPwdInput: false,
    passwordVal: '',
    paySetFocus: true,
    hasCustomer: false,
    customer: {},
    isUseCard: true, //是否能使用余额购买
  },
  onLoad: function (options) {
    // 页面初始化 options为页面跳转所带来的参数
    this.setData({
      orderNo: options.orderNo
    });
    this.getOrderDetail();
  },
  onPullDownRefresh() {
    wx.showNavigationBarLoading() //在标题栏中显示加载
    this.getOrderDetail();
    wx.hideNavigationBarLoading() //完成停止加载
    wx.stopPullDownRefresh() //停止下拉刷新
  },
  //获取订单详情
  getOrderDetail: function () {
    wx.showLoading({
      title: '加载中',
    });

    setTimeout(function () {
      wx.hideLoading()
    }, 2000);

    let that = this;
    util.request(api.OrderDetail, {
      orderNo: that.data.orderNo
    }).then(function (res) {
      console.log(res)
      if (res.code === 200) {
        
        that.setData({
          orderInfo: res.data.info,
          items: res.data.items
        });
      } else {
        util.showErrorToast(res.message)
      }
      wx.hideLoading();
    });
  },
  // “去付款”按钮点击效果
  payOrder: function () {
    let that = this;
    util.request(api.OrderPay, {
      orderNo: that.data.orderNo,
    }, 'POST').then(function (res) {
      console.log(res)
      if (res.code === 200) {
        const payParam = res.data;
        console.log("支付过程开始");
        wx.requestPayment({
          'timeStamp': payParam.timeStamp,
          'nonceStr': payParam.nonceStr,
          'package': payParam.packageValue,
          'signType': payParam.signType,
          'paySign': payParam.paySign,
          'success': function (res) {
            console.log("支付过程成功");
            wx.redirectTo({
              url: '/pages/payResult/payResult?status=1'
            });
          },
          'fail': function (res) {
            console.log("支付过程失败");
            util.showErrorToast('支付失败');
          },
          'complete': function (res) {
            console.log("支付过程结束")
          }
        });
      }
    });

  },
  // “取消订单”点击效果
  cancelOrder: function () {
    let that = this;
    let orderInfo = that.data.orderInfo;

    wx.showModal({
      title: '',
      content: '确定要取消此订单？',
      success: function (res) {
        if (res.confirm) {
          util.request(api.OrderCancel, {
            orderId: orderInfo.id
          }, 'POST').then(function (res) {
            if (res.errno === 0) {
              wx.showToast({
                title: '取消订单成功'
              });
              util.redirect('/pages/ucenter/order/order');
            } else {
              util.showErrorToast(res.errmsg);
            }
          });
        }
      }
    });
  },
  //订单开始
  startOrder(event) {
    let that = this;
    const orderNo = event.currentTarget.dataset.orderno;
    const device = event.currentTarget.dataset.device;
    let userInfo = wx.getStorageSync('userInfo');
    util.request(api.StartOrder, {
      orderNo: orderNo,
      openId: userInfo.openId,
      deviceCode: device
    }, "POST").then(function (res) {
      if (res.code === 200) {
        that.getOrderList();
        wx.showToast({
          title: '开始成功',
          icon: 'success',
          duration: 2000
        });
      }
    });

  },
  //订单结束
  endOrder(event) {
    let that = this;
    const orderNo = event.currentTarget.dataset.orderno;
    const device = event.currentTarget.dataset.device;
    let userInfo = wx.getStorageSync('userInfo');
    console.log(orderNo)
    util.request(api.EndOrder, {
      orderNo: orderNo,
      openId: userInfo.openId,
      deviceCode: device
    }, "POST").then(function (res) {
      if (res.code === 200) {
        that.getOrderList();
        wx.showToast({
          title: '结束成功',
          icon: 'success',
          duration: 2000
        });
      }
    });

  },

  onReady: function () {
    // 页面渲染完成
  },
  onShow: function () {
    // 页面显示
  },
  onHide: function () {
    // 页面隐藏
  },
  onUnload: function () {
    // 页面关闭
  },
})