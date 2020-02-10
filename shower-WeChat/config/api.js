// 以下是业务服务器API地址
// 本机开发时使用
var WxApiRoot = 'http://yuan50697105.nat300.top/api/wechat/';
module.exports = {
  orderCreat: WxApiRoot + 'order/create',
  orderOver: WxApiRoot + 'order/stop',
  loginUrl: WxApiRoot + 'customer/get_openid'
};