import request from '@/utils/request'

export function getInfo(id) {
  return request({
    url: `/order/orderinfo/${id}`,
    method: 'get'
  })
}

export function updateAo(data) {
  return request({
    url: `/order/orderinfo/updateAo`,
    method: 'put',
    data
  })
}
