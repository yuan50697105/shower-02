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
    code: undefined,
    page: 1,
    limit: 6,
    totalPages: 1
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
    let that = this;
    that.setData({
      //先清空列表及分页信息
      dataList: [],
      page: 1,
      totalPages: 1
    })
    //获取设备列表信息
    this.deviceList();
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
      schoolName: data.name,
      //先清空列表及分页信息
      dataList: [],
      page: 1,
      totalPages: 1
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
      statusName: data.text,
      //先清空列表及分页信息
      dataList: [],
      page: 1,
      totalPages: 1
    })
    //调用查询设备列表方法
    that.deviceList();
  },
  //获取区域信息
  areasList: function () {
    let that = this;
    util.request(api.AreaList).then(function (res) {
      if (res.code === 200) {
        that.setData({
          schoolList: that.data.schoolList.concat(res.data)
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
      code: that.data.code,
      page: that.data.page,
      limit: that.data.limit
    }, 'POST').then(function (res) {
      console.log(res)
      if (res.code === 200) {
        if (res.data.data != undefined){
          that.setData({
            dataList: that.data.dataList.concat(res.data.data),
            totalPages: res.data.totalPages
          });
        }
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
    //先清空列表及分页信息
    that.setData({
      dataList: [],
      totalPages: 1,
      page: 1
    });
    //调用查询设备列表方法
    that.deviceList();
  },

  //监听下滑
  onReachBottom() {
    if (this.data.totalPages > this.data.page) {
      this.setData({
        page: this.data.page + 1
      });
      this.deviceList();
    } else {
      wx.showToast({
        title: '没有更多房间了',
        icon: 'none',
        duration: 2000
      });
      return false;
    }
  },

  //页面下单
  useDevice:function(e){
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
      }else{
        util.showErrorToast(res.message)
      }
    });
  },
  //跳转进入设备详情页
  deviceDetail: function (event){
    var id = event.currentTarget.dataset.id;
    wx.navigateTo({
      url: "/pages/deviceDetail/deviceDetail?id=" + id
    });
  }
})