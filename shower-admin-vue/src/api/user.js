import request from '@/utils/request'

// export function login(data) {
//   return request({
//     url: '/vue-element-admin/user/login',
//     method: 'post',
//     data
//   })
// }
export function login(data) {
  return request({
    url: 'admin/login',
    method: 'post',
    data
  })
}

export function getInfo(token) {
  return request({
    url: '/admin/getUserInfo',
    method: 'get',
    params: { token }
  })
}

export function logout() {
  return request({
    url: '/admin/logout',
    method: 'post'
  })
}

export function getData(query) {
  return request({
    url: '/admin/user/data',
    method: 'get',
    params: query
  })
}

export function getRoleList() {
  return request({
    url: 'admin/role/list',
    method: 'get'
    // params: query
  })
}

export function addUser(data) {
  return request({
    url: 'admin/user/add',
    method: 'post',
    data
  })
}

export function getUserById(id) {
  return request({
    url: '/admin/user/get',
    method: 'get',
    params: { id }
  })
}

export function modifyUser(data) {
  return request({
    url: 'admin/user/modify',
    method: 'put',
    data
  })
}

export function deleteUser(id) {
  return request({
    url: `admin/user/delete/${id}`,
    method: 'delete'
  })
}
