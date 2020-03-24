// 以下是业务服务器API地址
var WxApiRoot = 'http://localhost:8002/wx/';
module.exports = {
   //微信登录
  AuthLoginByWeixin: WxApiRoot + 'customer/login',
  AreaList: WxApiRoot + 'area/areas',
  DeviceInfoList: WxApiRoot + 'device/deviceInfoList',
  loginUrl: WxApiRoot + 'customer/get_openid'
};