import Layout from '@/layout'

const moduleRoute = [
  {
    path: '/user',
    component: Layout,
    // redirect: '/user',
    // alwaysShow: true,
    name: '用户管理',
    meta: { title: '用户', icon: 'zip' },
    children: [
      {
        path: 'index',
        // component: () => import('@/views/user/index'),
        name: '用户管理',
        meta: { title: '用户管理', hidden: false, button: false },
        children: [
          {
            path: 'add',
            component: () => import('@/views/permission/user'),
            name: 'UserAdd',
            meta: { title: '用户添加', hidden: false, button: true }
          },
          {
            path: 'update',
            // component: () => import('@/views/user/index'),
            name: 'UserAdd',
            meta: { title: '用户修改', hidden: false, button: true }
          }

        ]
      }
    ]
  }
]
export default moduleRoute
