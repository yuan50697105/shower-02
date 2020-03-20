const app = getApp()
var api = require("../../config/api.js");
var util = require('../../utils/util.js');

Page({
     data: {
       secret: "23dd8b920ec05b5c538ef2f56cd1baa3",
       appid: "wx4f688d98fef66fac"
     },
     formSubmit: function (e) {
      var code=wx.getStorageSync('code'); 
       wx.switchTab({
         url: '/pages/list/list'
       })
      // util.request(api.loginUrl, {
      //   code: code
      // }).then(function (res) {
      //   console.log(res)
      //   if ("ok" == res.code) {
      //     console.log(res.data);
      //     var data = res.data;
      //       wx.setStorageSync('openId', data.openid);
      //       wx.switchTab({
      //         url: '/pages/list/list'
      //       })
      //      }else{
      //        wx.showToast({
      //          title: res.message,
      //          icon: "none",
      //          duration: 1000,
      //          mask: true
      //        })
      //      }  
      // })
     }
     
})