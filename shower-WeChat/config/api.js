// 以下是业务服务器API地址
var WxApiRoot = 'http://yuan50697105.nat300.top/api/wechat/';
var WxApiRoot = 'http://localhost:8002/api/wechat/';
module.exports = {
   //微信登录
  AuthLoginByWeixin: WxApiRoot + 'auth/login_by_weixin',
  orderCreat: WxApiRoot + 'order/create',
  orderOver: WxApiRoot + 'order/stop',
  loginUrl: WxApiRoot + 'customer/get_openid'
};