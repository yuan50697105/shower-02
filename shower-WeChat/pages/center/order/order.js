var api = require("../../../config/api.js");
var util = require('../../../utils/util.js');
var user = require('../../../utils/user.js');

Page({
  data: {
    orderList: [],
    status: 0,
    page: 1,
    limit: 10,
    totalPages: 1
  },
  onLoad: function(options) {
    // 页面初始化 options为页面跳转所带来的参数
    let that = this
    try {
      var tab = wx.getStorageSync('tab');

      this.setData({
        status: tab
      });
    } catch (e) {}

  },
  getOrderList() {
    let userInfo = wx.getStorageSync('userInfo');
    let that = this;
    util.request(api.OrderList, {
      openId: userInfo.openId,
      status: that.data.status,
      page: that.data.page,
      limit: that.data.limit
    },"POST").then(function(res) {
      if (res.code === 200) {
        if (res.data.list != undefined){
          that.setData({
            orderList: that.data.orderList.concat(res.data.list),
            totalPages: res.data.total
          });
        }
      }
    });
  },
  //监听下滑
  onReachBottom() {
    console.log(this.data.totalPages + "." + this.data.page)
    if (this.data.totalPages > this.data.page) {
      this.setData({
        page: this.data.page + 1
      });
      this.getOrderList();
    } else {
      wx.showToast({
        title: '没有更多订单了',
        icon: 'none',
        duration: 2000
      });
      return false;
    }
  },
  switchTab: function(event) {
    let status = event.currentTarget.dataset.index;
    this.setData({
      orderList: [],
      status: status,
      page: 1,
      limit: 10,
      totalPages: 1
    });
    this.getOrderList();
  },
  onReady: function() {
    // 页面渲染完成
  },
  onShow: function() {
    // 页面显示
    this.setData({
      orderList: []
    })
    this.getOrderList();
  },
  onHide: function() {
    // 页面隐藏
  },
  onUnload: function() {
    // 页面关闭
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
  //订单详情
  lookDetail(event) {
    var no = event.currentTarget.dataset.no;
    wx.navigateTo({
      url: '/pages/center/orderDetail/orderDetail?id=' + no,
    });
  },
  //付款
  goPay(event){
    let that = this;
    const orderNo = event.currentTarget.dataset.orderno;
    const price = event.currentTarget.dataset.price;
    util.request(api.OrderPay, {
      orderNo: orderNo,
      totalPrice: price
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
  //下拉监控
  onPullDownRefresh: function () {
    this.getOrderList();
  }
})