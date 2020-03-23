// 以下是业务服务器API地址
var WxApiRoot = 'http://localhost:8002/wx/';
module.exports = {
   //微信登录
  AuthLoginByWeixin: WxApiRoot + 'customer/login',
  orderCreat: WxApiRoot + 'order/create',
  orderOver: WxApiRoot + 'order/stop',
  loginUrl: WxApiRoot + 'customer/get_openid'
};