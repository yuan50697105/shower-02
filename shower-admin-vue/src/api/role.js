import request from '@/utils/request'
import router from '../router/index'
import { routeList } from '../router/index'

export function getRoutes() {
  // return request({
  //   url: '/vue-element-admin/routes',
  //   method: 'get'
  // })
  return routeList
}

export function getRoles() {
  return request({
    url: '/admin/role/data',
    method: 'get'
  })
}

export function addRole(data) {
  return request({
    url: '/admin/role/add',
    method: 'post',
    data
  })
}

export function updateRole(id, data) {
  return request({
    url: `/admin/role/update`,
    method: 'put',
    data
  })
}

export function deleteRole(id) {
  return request({
    url: `/admin/role/${id}`,
    method: 'delete'
  })
}
