// 以下是业务服务器API地址
var WxApiRoot = 'http://123.56.78.153:8002/wx/';
module.exports = {
   //微信登录
  AuthLoginByWeixin: WxApiRoot + 'customer/login',
  AreaList: WxApiRoot + 'area/areas',
  DeviceInfoList: WxApiRoot + 'device/deviceInfoList',
  AddOrder: WxApiRoot + 'order/add',
  OrderList: WxApiRoot + 'order/data',
};