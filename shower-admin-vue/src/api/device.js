import request from '@/utils/request'

export function deleteDevice(id) {
  return request({
    uri: `/device/info/delete/${id}`,
    method: 'delete'
  })
}

export function addDevice(data) {
  return request({
    uri: `/device/info/add`,
    method: 'post',
    data
  })
}

export function modifyDevice(data) {
  return request({
    uri: `/device/info/modify`,
    method: 'put',
    data
  })
}

export function getDevice(id) {
  return request({
    uri: `/device/info/${id}`,
    method: 'get'
  })
}

export function pageDevice(data) {
  return request({
    uri: `/device/info/data`,
    method: 'get',
    params: data
  })
}

export function listDevice(data) {
  return request({
    url: `/device/info/list`,
    method: 'get',
    params: data
  })
}
