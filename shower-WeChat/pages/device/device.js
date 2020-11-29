var api = require('../../config/api.js');
var util = require('../../utils/util.js');
var user = require('../../utils/user.js');
import Toast from '../../miniprogram_npm/@vant/weapp/toast/toast';
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    dataList: [],
    schoolList: [],
    orderList: [],
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
    if (options.scene) {
      //这个scene的值存在则证明首页的开启来源于朋友圈分享的图,同时可以通过获取到的goodId的值跳转导航到对应的详情页
      var scene = decodeURIComponent(options.scene);
      console.log("scene:" + scene);
      let info_arr = [];
      info_arr = scene.split(',');
      let _type = info_arr[0];
      let id = info_arr[1];

      if (_type == 'device') {
        wx.navigateTo({
          url: "/pages/deviceDetail/deviceDetail?id=" + id
        });
      }
    }
    //获取区域信息
    this.areasList();
    //获取设备列表信息
    this.deviceList();
    //获取订单信息
    this.getOrderList();
  },


  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

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
    this.getOrderList()
    wx.stopPullDownRefresh();
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
      runStatus:that.data.status,
      code: that.data.code,
      page: that.data.page,
      limit: that.data.limit
    }, 'POST').then(function (res) {
      console.log(res)
      if (res.code === 200) {
        if (res.data.list != undefined){
          that.setData({
            dataList: that.data.dataList.concat(res.data.list),
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
    let that = this;
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
  onScrollBottom() {
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
    }else{
      let userInfo = wx.getStorageSync('userInfo');
      var deviceCode = e.target.dataset.code;
      var runStatus = e.target.dataset.runstatus
      console.log(runStatus)
      if(runStatus != 0){
        Toast("设备正在使用,不可下单。")
        return
      }
      
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
    }
    ///刷新
    this.getOrderList()
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
  //跳转进入设备详情页
  deviceDetail: function (event){
    if (!app.globalData.hasLogin) {
      wx.navigateTo({
        url: "/pages/auth/login/login"
      });
      return;
    }else{
      var id = event.currentTarget.dataset.id;
      wx.navigateTo({
        url: "/pages/deviceDetail/deviceDetail?id=" + id
      });
    }
  },
  //获取开始状态的订单
  getOrderList() {
    let userInfo = wx.getStorageSync('userInfo');
    let that = this;
    util.request(api.OrderList, {
      openId: userInfo.openId,
      status: 2,
      page: 1,
      limit: 1
    },"POST").then(function(res) {
      console.log(res.data)
      if (res.code === 200) {
        if (res.data.list != undefined){
          that.setData({
            orderList: that.data.orderList.concat(res.data.list),
          });
        }
      }
    });
  },
  //到使用中的订单页面
  onUseOrder: function () {
    if (app.globalData.hasLogin) {
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
})