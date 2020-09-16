import request from '@/utils/request'

export function getInfo() {
  return request({
    url: `dashboard/informationNumber`,
    method: 'get'
  })
}

export function monthOrderData() {
  return request({
    url: `dashboard/monthOrderData`,
    method: 'get'
  })
}

export function deviceOrderData() {
  return request({
    url: `dashboard/deviceOrderData`,
    method: 'get'
  })
}
