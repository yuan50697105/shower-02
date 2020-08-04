import store from '@/store'

/**
 * @param {Array} value
 * @returns {Boolean}
 * @example see @/views/permission/directive.vue
 */
export default function checkPermission(value) {
  if (value && value instanceof Array && value.length > 0) {
    const roles = store.getters && store.getters.roles
    const permissions = store.getters && store.getters.permisions
    const permissionRoles = value

    const hasRoles = roles.some(role => {
      return permissionRoles.includes(role)
    })
    const hasPermissions = permissions.some(permission => {
      return permissionRoles.includes(permission)
    })

    if (!hasRoles || !hasPermissions) {
      return false
    }
    return true
  } else {
    console.error(`need roles! Like v-permission="['admin','editor']"`)
    return false
  }
}
