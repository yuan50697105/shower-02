// 以下是业务服务器API地址
// var WxApiRoot = 'http://123.56.78.153:8002/wx/';
var WxApiRoot = 'https://yuan50697105s.natapp4.cc/wx/';
module.exports = {
   //微信登录
  AuthLoginByWeixin: WxApiRoot + 'customer/login',
  AreaList: WxApiRoot + 'area/areas',
  DeviceInfoList: WxApiRoot + 'device/deviceInfoList',
  DeviceInfoDetail: WxApiRoot + 'device/send/info',
  AddOrder: WxApiRoot + 'order/add',
  OrderList: WxApiRoot + 'order/data',
  StartOrder: WxApiRoot + 'order/open',
  EndOrder: WxApiRoot + 'order/end',
  OrderDetail: WxApiRoot + 'order/item',
  OrderPay: WxApiRoot + 'order/pay',
};