var api = require('../../config/api.js');
var util = require('../../utils/util.js');
var user = require('../../utils/user.js');

const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    dataList: [],
    schoolList: [],
    school: undefined,
    schoolName: undefined,
    statusMap: [{
      code: 2,
      text: '全部'
    }, {
      code: 0,
      text: '可以使用'
    }, {
      code: 1,
      text: '不可使用'
    }],
    status: 2,
    statusName: '全部',
    code: undefined
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    //获取区域信息
    this.areasList();
    //获取设备列表信息
    this.deviceList();
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
    let data = this.data.schoolList[index];
    that.setData({
      school: data.id,
      schoolName: data.name
    })
    //调用查询设备列表方法
    this.deviceList();
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
    //调用查询设备列表方法
    this.deviceList();
  },
  //获取区域信息
  areasList: function () {
    let that = this;
    util.request(api.AreaList).then(function (res) {
      if (res.code === 200) {
        that.setData({
          schoolList: res.data
        });
      }
    });
  },
  //获取设备信息
  deviceList: function () {
    let that = this;
    util.request(api.DeviceInfoList,{
      areaId:that.data.school,
      enabled:that.data.status,
      code: that.data.code
    }, 'POST').then(function (res) {
      if (res.code === 200) {
        that.setData({
          dataList: res.data
        });
      }
    });
  },

  //输入框内容改变
  inputChange: function(e){
    let that = this;
    that.setData({
      code: e.detail.value
    });
  },

  //输入框搜索
  searchByCode:function(e){
    //调用查询设备列表方法
    this.deviceList();
  }
})