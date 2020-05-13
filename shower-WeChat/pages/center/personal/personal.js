// pages/personal/personal.js
const app = getApp()
Page({

     /**
      * 页面的初始数据
      */
     data: {
       userInfo: {},
       hasLogin: false
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
       //获取用户的登录信息
       if (app.globalData.hasLogin) {
         let userInfo = wx.getStorageSync('userInfo');
         this.setData({
           userInfo: userInfo,
           hasLogin: true
         })
       } else {
         this.goLogin()
       }
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
  goLogin() {
    if (!this.data.hasLogin) {
      wx.navigateTo({
        url: "/pages/auth/login/login"
      });
    }
  },


  aboutUs: function () {
    wx.navigateTo({
      url: '/pages/about/about'
    });
  },

  AllOrder:function(){
    if (this.data.hasLogin) {
      try {
        wx.setStorageSync('tab', 0);
      } catch (e) {

      }
      wx.navigateTo({
        url: "/pages/center/order/order"
      });
    } else {
      wx.navigateTo({
        url: "/pages/auth/login/login"
      });
    }
  },

  WaitPayOrder: function () {
    if (this.data.hasLogin) {
      try {
        wx.setStorageSync('tab', 2);
      } catch (e) {

      }
      wx.navigateTo({
        url: "/pages/center/order/order"
      });
    } else {
      wx.navigateTo({
        url: "/pages/auth/login/login"
      });
    }
  },

  WaitUseOrder: function () {
    if (this.data.hasLogin) {
      try {
        wx.setStorageSync('tab', 3);
      } catch (e) {

      }
      wx.navigateTo({
        url: "/pages/center/order/order"
      });
    } else {
      wx.navigateTo({
        url: "/pages/auth/login/login"
      });
    }
  },

  OverOrder: function () {
    if (this.data.hasLogin) {
      try {
        wx.setStorageSync('tab', 5);
      } catch (e) {

      }
      wx.navigateTo({
        url: "/pages/center/order/order"
      });
    } else {
      wx.navigateTo({
        url: "/pages/auth/login/login"
      });
    }
  },

  opinion:function(){
    if (this.data.hasLogin) {
      wx.navigateTo({
        url: "/pages/center/opinion/opinion"
      });
    } else {
      wx.navigateTo({
        url: "/pages/auth/login/login"
      });
    }
  }
})