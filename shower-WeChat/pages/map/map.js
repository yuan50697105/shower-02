// 引入SDK核心类
var QQMapWX = require('../../lib/qqmap/qqmap-wx-jssdk.js');
var qqmapsdk;
Page({
  data: {
    //中心纬度
    latitude: 36.0031470000,
    //中心经度
    longitude: 120.1222120000
  },
  onLoad: function(e){
    let that = this;
    // 实例化API核心类
    qqmapsdk = new QQMapWX({
      key: 'U7LBZ-YAWW3-RUP35-YGF6T-VGUBO-2UBYG'
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
              markers: [{
                id: "0",
                latitude: 36.0031470000,
                longitude: 120.1222120000,
                iconPath: "/static/image/location.png",
                width: 40,
                height: 40,
                callout: {
                  'display': 'BYCLICK', 'fontSize': '30rpx', 'content': '山东科技大学',
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
                  latitude: 36.0031470000,
                  longitude: 120.1222120000,
                  iconPath: "/static/image/location.png",
                  width: 40,
                  height: 40,
                  callout: {
                    'display': 'BYCLICK', 'fontSize': '30rpx', 'content': '山东科技大学',
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
    let key = 'U7LBZ-YAWW3-RUP35-YGF6T-VGUBO-2UBYG';  //使用在腾讯位置服务申请的key
    let referer = '清沐屋';   //调用插件的app的名称
    let endPoint = JSON.stringify({  //终点
      'name': '山东科技大学',
      'latitude': 36.0031470000,
      'longitude': 120.1222120000
    });
    wx.navigateTo({
      url: 'plugin://routePlan/index?key=' + key + '&referer=' + referer + '&endPoint=' + endPoint
    });
    console.log(e)
  }
})
