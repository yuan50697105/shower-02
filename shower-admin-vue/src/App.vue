<template>
  <div id="app">
    <!--需要缓存组件-->
    <keep-alive>
      <!--router-view组件是一个 functional 组件，渲染路径匹配到的视图组件-->
      <router-view v-if="$route.meta.keepAlive" />
    </keep-alive>
    <!--不需要缓存组件-->
    <!--    <router-view v-if="!$route.meta.keepAlive" />-->
    <moduleFooter />
    <router-view />
  </div>
</template>

<script>
import Cookies from 'js-cookie'
import { messages } from '@/i18n'

export default {
  name: 'App',
  watch: {
    '$i18n.locale': 'i18nHandle'
  },
  created() {
    this.i18nHandle(this.$i18n.locale)
  },
  methods: {
    i18nHandle(val, oldVal) {
      Cookies.set('language', val)
      document.querySelector('html').setAttribute('lang', val)
      document.title = messages[val].brand.lg
      // 非登录页面，切换语言刷新页面
      if (this.$route.name !== 'login' && oldVal) {
        window.location.reload()
      }
    }
  }
}
</script>
