Page({
  data: {
    //中心纬度
    latitude: 36.0031470000,
    //中心经度
    longitude: 120.1222120000,
    markers: [
          {
               id: 1,
               latitude: 36.0031470000,
               longitude: 120.1222120000,
               name: '山东科技大学青岛校区',
               //     iconPath: '/pages/image/location.png'
          }, {
               id: 1,
               latitude: 35.9653800000,
               longitude: 120.1683000000,
               name: '山东科技大学青岛校区',
               //     iconPath: '/pages/image/location.png'
          }
     ]
  },
  onReady: function (e) {
    this.mapCtx = wx.createMapContext('myMap')
  },
  getCenterLocation: function () {
    this.mapCtx.getCenterLocation({
      success: function(res){
        console.log(res.longitude)
        console.log(res.latitude)
      }
    })
  },
  moveToLocation: function () {
    this.mapCtx.moveToLocation()
  },
  includePoints: function() {
    this.mapCtx.includePoints({
      padding: [10],
      points: [{
           latitude: 35.9653800000,
           longitude: 120.1683000000,
           iconPath: '/static/image/location.png'
      }, {
           latitude: 36.0031470000,
           longitude: 120.1222120000,
           iconPath: '/static/image/location.png'
      }]
    })
  }
})
