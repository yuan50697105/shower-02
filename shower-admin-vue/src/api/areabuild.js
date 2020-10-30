import request from '@/utils/request'

export function getInfo(id) {
  return request({
    url: `/area/areabuilding/${id}`,
    method: 'get'
  })
}

export function save(data) {
  return request({
    url: `/area/areabuilding`,
    method: 'POST',
    data
  })
}

export function update(data) {
    return request({
      url: `/area/areabuilding`,
      method: 'POST',
      data
    })
  }
