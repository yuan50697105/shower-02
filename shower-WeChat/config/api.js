// 以下是业务服务器API地址
var WxApiRoot = 'http://127.0.0.1:8002/wx/';
// var WxApiRoot = 'https://yuan50697105s.natapp4.cc/wx/';
module.exports = {
   //微信登录
  AuthLoginByWeixin: WxApiRoot + 'customer/login',
  //区域列表
  AreaList: WxApiRoot + 'area/areas',
  //设备列表
  DeviceInfoList: WxApiRoot + 'device/deviceInfoList',
  //设备详情
  DeviceInfoDetail: WxApiRoot + 'device/info',
  //添加订单
  AddOrder: WxApiRoot + 'order/add',
  //订单列表
  OrderList: WxApiRoot + 'order/data',
  //开始订单
  StartOrder: WxApiRoot + 'order/open',
  //结束订单
  EndOrder: WxApiRoot + 'order/end',
  //订单详情
  OrderDetail: WxApiRoot + 'order/item',
  //付款
  OrderPay: WxApiRoot + 'order/pay',
};