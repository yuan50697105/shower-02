const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    listData: [
      {
        "dateStr":"1号",
        "startstationname":"17号楼后面",
        "arrivalstationname":"山科",
        "price":500,
        "cansellcountamount":30
      }
    ],
    schoolMap: [{
      code: 1,
      text: '山科'
    }, {
      code: 2,
      text: '青职'
    }],
    school: undefined,
    schoolName: undefined,
    statusMap: [{
      code: 1,
      text: '可以使用'
    }, {
      code: 2,
      text: '不可使用'
    }],
    status: undefined,
    statusName: undefined,
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

  //选择学校
  schoolSelectChange: function (e) {
    let that = this;
    let index = e.detail.value;
    let data = this.data.schoolMap[index];
    that.setData({
      school: data.code,
      schoolName: data.text
    })
  },
  //选择机器使用状态
  statusSelectChange: function (e) {
    let that = this;
    let index = e.detail.value;
    let data = this.data.statusMap[index];
    that.setData({
      status: data.code,
      statusName: data.text
    })
  },
})