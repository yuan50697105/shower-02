import store from '@/store'

export default {
  inserted(el, binding, vnode) {
    const { value } = binding
    const roles = store.getters && store.getters.roles
    console.log(roles)
    if (value && value instanceof Array && value.length > 0) {
      const permissionRoles = value

      const hasRoles = roles.some(role => {
        return permissionRoles.includes(role)
      })

      if (!hasRoles) {
        el.parentNode && el.parentNode.removeChild(el)
      }
    } else {
      throw new Error(`need roles! Like v-permission="['admin','editor']"`)
    }
  }
}
