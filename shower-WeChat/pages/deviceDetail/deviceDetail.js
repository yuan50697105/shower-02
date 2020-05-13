var api = require('../../config/api.js');
var util = require('../../utils/util.js');
var user = require('../../utils/user.js');

const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
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
    var enabled = e.target.dataset.enabled

    util.request(api.AddOrder, {
      openId: userInfo.openId,
      deviceCode: deviceCode,
      type: 2
    }, 'POST').then(function (res) {
      console.log(res)
      if (res.code === 200) {
        util.showSuccessToast("下单成功")
      } else {
        util.showErrorToast(res.message)
      }
    });
  },
})