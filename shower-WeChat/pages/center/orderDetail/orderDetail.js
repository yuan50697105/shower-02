var util = require('../../../utils/util.js');
var api = require('../../../config/api.js');
var user = require('../../../utils/user.js');

Page({
  data: {
    orderId: 0,
    orderInfo: {},
    orderGoods: [],
    expressInfo: {},
    flag: false,
    handleOption: {},
    showPayPwdInput: false, //是否展示密码输入层
    pwdVal: '', //输入的密码
    payFocus: true, //文本框焦点
    showSetPayPwdInput: false,
    passwordVal: '',
    paySetFocus: true,
    hasCustomer: false,
    customer: {},
    isUseCard: true, //是否能使用余额购买
  },
  onLoad: function (options) {
    // 页面初始化 options为页面跳转所带来的参数
    this.setData({
      orderId: options.id
    });
    this.getOrderDetail();
  },
  onPullDownRefresh() {
    wx.showNavigationBarLoading() //在标题栏中显示加载
    this.getOrderDetail();
    wx.hideNavigationBarLoading() //完成停止加载
    wx.stopPullDownRefresh() //停止下拉刷新
  },
  getOrderDetail: function () {
    wx.showLoading({
      title: '加载中',
    });

    setTimeout(function () {
      wx.hideLoading()
    }, 2000);

    let that = this;
    util.request(api.OrderDetail, {
      orderId: that.data.orderId
    }).then(function (res) {
      console.log(res.data[0])
        that.setData({
          orderInfo: res.data[0]
          
          // orderGoods: res.data.orderGoods,
          // handleOption: res.data.orderInfo.handleOption,
          // expressInfo: res.data.expressInfo,
          // isUseCard: res.data.isUseCard
        });

      wx.hideLoading();
    });
  },
  // “去付款”按钮点击效果
  payOrder: function () {
    let that = this;
    util.request(api.OrderPrepay, {
      orderId: that.data.orderId,
      shareId: user.getStorageDirectShareId(),
      shareType: user.getStorageShareType(),
      memberPageType: user.getStorageMemberPageType()
    }, 'POST').then(function (res) {
      if (res.errno === 0) {
        user.delStorageDirectShareId()
        user.delStorageShareType()
        user.delStorageMemberPageType()
        const payParam = res.data;
        console.log("支付过程开始");
        wx.requestPayment({
          'timeStamp': payParam.timeStamp,
          'nonceStr': payParam.nonceStr,
          'package': payParam.packageValue,
          'signType': payParam.signType,
          'paySign': payParam.paySign,
          'success': function (res) {
            console.log("支付过程成功");
            util.redirect('/pages/ucenter/order/order');
          },
          'fail': function (res) {
            console.log("支付过程失败");
            util.showErrorToast('支付失败');
          },
          'complete': function (res) {
            console.log("支付过程结束")
          }
        });
      }
    });

  },
  // “取消订单”点击效果
  cancelOrder: function () {
    let that = this;
    let orderInfo = that.data.orderInfo;

    wx.showModal({
      title: '',
      content: '确定要取消此订单？',
      success: function (res) {
        if (res.confirm) {
          util.request(api.OrderCancel, {
            orderId: orderInfo.id
          }, 'POST').then(function (res) {
            if (res.errno === 0) {
              wx.showToast({
                title: '取消订单成功'
              });
              util.redirect('/pages/ucenter/order/order');
            } else {
              util.showErrorToast(res.errmsg);
            }
          });
        }
      }
    });
  },
  // “取消订单并退款”点击效果
  refundOrder: function () {
    let that = this;
    let orderInfo = that.data.orderInfo;

    wx.showModal({
      title: '',
      content: '确定要取消此订单？',
      success: function (res) {
        if (res.confirm) {
          util.request(api.OrderRefund, {
            orderId: orderInfo.id
          }, 'POST').then(function (res) {
            if (res.errno === 0) {
              wx.showToast({
                title: '取消订单成功'
              });
              util.redirect('/pages/ucenter/order/order');
            } else {
              util.showErrorToast(res.errmsg);
            }
          });
        }
      }
    });
  },
  // “删除”点击效果
  deleteOrder: function () {
    let that = this;
    let orderInfo = that.data.orderInfo;

    wx.showModal({
      title: '',
      content: '确定要删除此订单？',
      success: function (res) {
        if (res.confirm) {
          util.request(api.OrderDelete, {
            orderId: orderInfo.id
          }, 'POST').then(function (res) {
            if (res.errno === 0) {
              wx.showToast({
                title: '删除订单成功'
              });
              util.redirect('/pages/ucenter/order/order');
            } else {
              util.showErrorToast(res.errmsg);
            }
          });
        }
      }
    });
  },
  // “确认收货”点击效果
  confirmOrder: function () {
    let that = this;
    let orderInfo = that.data.orderInfo;

    wx.showModal({
      title: '',
      content: '确认收货？',
      success: function (res) {
        if (res.confirm) {
          util.request(api.OrderConfirm, {
            orderId: orderInfo.id
          }, 'POST').then(function (res) {
            if (res.errno === 0) {
              wx.showToast({
                title: '确认收货成功！'
              });
              util.redirect('/pages/ucenter/order/order');
            } else {
              util.showErrorToast(res.errmsg);
            }
          });
        }
      }
    });
  },
  showInputLayer: function () {
    // if (!this.data.hasCustomer) {
    //   util.showErrorToast('请完善体检人信息');
    //   return false;
    // }

    var userinfo = wx.getStorageSync('userInfo');
    var payPassword = userinfo.password;
    if (payPassword === undefined || payPassword === null || payPassword === "0" || payPassword === "") {
      this.setData({
        showSetPayPwdInput: true,
        paySetFocus: true
      });
    } else {
      this.setData({
        showPayPwdInput: true,
        payFocus: true
      });
    }

  },

  /**
   * 隐藏支付密码输入层
   */
  hidePayLayer: function () {

    var val = this.data.pwdVal;

    this.setData({
      showPayPwdInput: false,
      payFocus: false,
      pwdVal: ''
    }, function () {
      // wx.showToast({
      //   title: "支付成功",
      // })
    });

  },
  hidePayLayertwo: function () {

    var val = this.data.pwdVal;

    this.setData({
      showPayPwdInput: false,
      payFocus: false,
      pwdVal: ''
    }, function () {
      util.showErrorToast("密码错误");
    });

  },
  hideSetPayLayer: function () {

    var val = this.data.passwordVal;

    this.setData({
      showSetPayPwdInput: false,
      paySetFocus: false,
      passwordVal: ''
    }, function () {
      wx.showToast({
        title: "设置成功",
      })
    });

  },
  hideSetPayLayertwo: function () {

    var val = this.data.passwordVal;

    this.setData({
      showSetPayPwdInput: false,
      paySetFocus: false,
      passwordVal: ''
    }, function () {
      util.showErrorToast("设置失败");
    });

  },
  /**
   * 获取焦点
   */
  getFocus: function () {
    this.setData({
      payFocus: true
    });
  },
  getSetFocus: function () {
    this.setData({
      paySetFocus: true
    });
  },
  /**
   * 输入密码监听
   */
  inputPwd: function (e) {
    this.setData({
      pwdVal: e.detail.value
    });

    if (e.detail.value.length >= 6) {
      var userinfo = wx.getStorageSync('userInfo');
      if (util.sha1(e.detail.value) === userinfo.password) {
        this.submitBalance();
        this.hidePayLayer();
      } else {

        this.hidePayLayertwo();
      }

    }
  },
  inputSetPwd: function (e) {
    let that = this;
    this.setData({
      passwordVal: e.detail.value
    });

    if (e.detail.value.length >= 6) {
      util.request(api.SubmitUserPwd, {
        password: util.sha1(e.detail.value)
      }, 'POST').then(res => {
        if (res.errno === 0) {
          var userinfo = wx.getStorageSync('userInfo');
          userinfo.password = util.sha1(this.data.passwordVal);
          wx.setStorageSync("userInfo", userinfo)
          this.hideSetPayLayer();
        } else {
          this.hideSetPayLayertwo();
        }
      }).catch(() => {
        this.hideSetPayLayertwo();
      });

    }
  },
  submitBalance: function () {

    util.request(api.BalancePayOrderInDetail, {
      orderId: this.data.orderId,
      shareId: user.getStorageDirectShareId(),
      shareType: user.getStorageShareType(),
      memberPageType: user.getStorageMemberPageType()
    }, 'POST').then(res => {

      console.log(res)
      if (res.errno === 0) {
        user.delStorageDirectShareId()
        user.delStorageShareType()
        user.delStorageMemberPageType()
        // 下单成功，重置couponId
        try {
          wx.setStorageSync('couponId', 0);
        } catch (error) {

        }
        wx.showToast({
          title: "支付成功",
        });
        const orderId = res.data.orderId;

        wx.redirectTo({
          url: '/pages/payResult/payResult?status=1&orderId=' + orderId
        });


      } else {
        util.showErrorToast(res.errmsg);
      }
    }).finally(() => {
      user.requestAllMsg().then(value => {
        console.log(value);
      }).catch(value => {
        console.log(value);
      })
    });
  },
  onReady: function () {
    // 页面渲染完成
  },
  onShow: function () {
    // 页面显示
  },
  onHide: function () {
    // 页面隐藏
  },
  onUnload: function () {
    // 页面关闭
  },
})