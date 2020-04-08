var api = require("../../../config/api.js");
var util = require('../../../utils/util.js');
var user = require('../../../utils/user.js');

Page({
  data: {
    orderList: [],
    showType: 0,
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
        showType: tab
      });
    } catch (e) {}

  },
  getOrderList() {
    let userInfo = wx.getStorageSync('userInfo');
    let that = this;
    util.request(api.OrderList, {
      openId: userInfo.openId,
      showType: that.data.showType,
      page: that.data.page,
      limit: that.data.limit
    },"POST").then(function(res) {
      if (res.errno === 200) {
        console.log(res.data);
        that.setData({
          orderList: that.data.orderList.concat(res.data.list),
          totalPages: res.data.pages
        });
      }
    });
  },
  onReachBottom() {
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
    let showType = event.currentTarget.dataset.index;
    this.setData({
      orderList: [],
      showType: showType,
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
  lookChargedCode(event) {
    const code = event.currentTarget.dataset.code;
    const brand = event.currentTarget.dataset.brand;
    user.requestCheckSellSuccessIdsMsg().then((value) => {
      console.log(value);
    }).catch(err => {
      console.log(err);
    }).finally(() => {
      wx.navigateTo({
        url: "/pages/ucenter/code/code?code=" + code + "&brand=" + brand
      });
    });
    
  },
  lookDetail(event){
    var id = event.currentTarget.dataset.id;
    wx.navigateTo({
      url: '/pages/ucenter/orderDetail/orderDetail?id='+id,
    });
  },
  goKabaw(){
    wx.navigateTo({
      url: '/pages/ucenter/kabaw/kabaw',
    })
  }
})