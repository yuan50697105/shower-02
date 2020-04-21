//获取应用实例
var app = getApp();
var api = require('../../../config/api.js');
var util = require('../../../utils/util.js');
var user = require('../../../utils/user.js');
var that
Page({
  data: {
    list_remind: '加载中',
    status: false,  //是否显示列表
    itemopen: false,
    feednum: 0, //反馈的次数
    hasFeed: false,
    title: '',
    content: '',
    showTopTips: false,
    TopTips: '',
  },
  onLoad: function () {
    that = this;
    that.setData({//初始化数据
      src: "",
      isSrc: false,
      ishide: "0",
      autoFocus: true,
      isLoading: false,
      loading: true,
      isdisabled: false
    })
    var molist = new Array();
    var jsonA;
    jsonA = {
      "title": '总睡觉啊',
      "content": '卷上：“各路州县接得文字，得知韩王被虏，诸将皆亡，未免具降书投降。”《古今小说·简帖僧巧骗皇甫妻》：“钱大尹看罢，即时教押下一箇所属去处，叫将山前行山定来。当时山定承了这件文字。”',
      "publisherPic": '22',
      "publisherName": '33',
      "pubtime": '金额杀菌灯',
      "feedpic": 'http://seopic.699pic.com/photo/50056/6212.jpg_wh1200.jpg',
      "feedUserId":'22',
      "id": '22',
    }
    molist.push(jsonA);
    that.setData({
      feedList: molist,
      feednum: 1,
      hasFeed: true
    })

  },
  /**
  * 生命周期函数--监听页面初次渲染完成
  */
  onReady: function () {
    wx.hideToast()

  },
  onShow: function () {
    this.getIssue();
  },
  //获取评论信息
  getIssue: function () {
    //或取总的反馈次数

  },

  //上传图片
  uploadPic: function () {
    var that = this;
    wx.showModal({
      title: '提示',
      content: '上传图片需要消耗流量，是否继续？',
      confirmText: '继续',
      success: function (res) {
        if (res.confirm) {
          wx.chooseImage({
            count: 1, // 默认9
            sizeType: ['compressed'], //压缩图
            sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有
            success: function (res) {
              // 返回选定照片的本地文件路径列表，tempFilePath可以作为img标签的src属性显示图片
              var tempFilePaths = res.tempFilePaths
              that.setData({
                isSrc: true,
                src: tempFilePaths
              })
            }
          })
        }
      }
    });
  },

  //删除图片
  clearPic: function () {//删除图片
    that.setData({
      isSrc: false,
      src: ""
    })
  },

  //表单验证
  showTopTips: function () {
    var that = this;
    this.setData({
      showTopTips: true
    });
    setTimeout(function () {
      that.setData({
        showTopTips: false
      });
    }, 3000);
  },
  //提交表单
  submitForm: function (e) {
    console.log(e)
    var title = e.detail.value.title;
    var content = e.detail.value.content;
    //先进行表单非空验证
    if (title == "") {
      this.setData({
        showTopTips: true,
        TopTips: '请输入反馈标题'
      });
    } else if (content == "") {
      this.setData({
        showTopTips: true,
        TopTips: '请输入反馈内容'
      });
    } else {
      that.setData({
        isLoading: true,
        isdisabled: true
      })
      wx.showModal({
        title: '提示',
        content: '是否确认提交反馈',
        success: function (res) {
          if (res.confirm) {
            that.setData({
              showTopTips: false
            });
          }
        }
      })
    }
  },

  openList: function (e) {
    that.setData({
      'status': !that.data.status
    });
  },

  openItem: function (e) {
    var index = e.currentTarget.dataset.index;
    if (index != that.data.itemopen) {
      that.setData({
        'itemopen': index
      });
    }
  },

});