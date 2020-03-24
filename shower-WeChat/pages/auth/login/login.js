var api = require('../../../config/api.js');
var util = require('../../../utils/util.js');
var user = require('../../../utils/user.js');

var app = getApp();
Page({
  onLoad: function(options) {
    this.data.userInfo = undefined
    user.beforLogin().then((res) => {
      this.data.code = res.code
    })

  },
  onReady: function() {

  },
  onShow: function() {
    // 页面显示
  },
  onHide: function() {
    // 页面隐藏

  },
  onUnload: function() {
    // 页面关闭

  },
  wxLogin: function (e) {
    if (e.detail.encryptedData == undefined) {
      app.globalData.hasLogin = false;
      util.showErrorToast('微信登录失败');
      wx.reLaunch({
        url: '/pages/device/device'
      });
      return
    }
    this.data.encryptedPhone = e.detail
    user.checkSession().then(() => {
      user.loginByWeixin(this.data.code, this.data.userInfo, this.data.encryptedPhone).then(res => {
        app.globalData.hasLogin = true;
        //推送订阅通知
        // user.requestAllMsg();
        wx.navigateBack({
          delta: 1
        })
      }).catch((err) => {
        app.globalData.hasLogin = false;
        util.showErrorToast('微信登录失败');
        wx.reLaunch({
          url: '/pages/device/device'
        });
      });

    });

  },
})