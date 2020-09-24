<template>
  <el-dialog :visible.sync="visible" title="查看" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form ref="dataForm" :model="dataForm" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
      <el-form-item label="createTime" prop="createTime">
        <el-input v-model="dataForm.createDate" placeholder="createTime" />
      </el-form-item>
      <el-form-item label="updateTime" prop="updateTime">
        <el-input v-model="dataForm.updateDate" placeholder="updateTime" />
      </el-form-item>
      <el-form-item label="createUser" prop="createUser">
        <el-input v-model="dataForm.creator" placeholder="createUser" />
      </el-form-item>
      <el-form-item label="updateUser" prop="updateUser">
        <el-input v-model="dataForm.updater" placeholder="updateUser" />
      </el-form-item>
      <el-form-item label="区域名称" prop="name">
        <el-input v-model="dataForm.name" placeholder="区域名称" />
      </el-form-item>
      <el-form-item label="区域编号" prop="code">
        <el-input v-model="dataForm.code" placeholder="区域编号" />
      </el-form-item>
    </el-form>
    <template slot="footer">
      <el-button @click="visible = false">{{ $t('cancel') }}</el-button>
    </template>
  </el-dialog>
</template>

<script>
export default {
  data() {
    return {
      visible: false,
      dataForm: {
        id: '',
        createDate: '',
        updateDate: '',
        creator: '',
        updater: '',
        name: '',
        code: ''
      }
    }
  },
  methods: {
    init() {
      this.visible = true
      this.$nextTick(() => {
        this.$refs['dataForm'].resetFields()
        if (this.dataForm.id) {
          this.getInfo()
        }
      })
    },
    // 获取信息
    getInfo() {
      this.$http.get(`/area/info/${this.dataForm.id}`).then(({ data: res }) => {
        if (res.code !== 0) {
          return this.$message.error(res.msg)
        }
        this.dataForm = {
          ...this.dataForm,
          ...res.data
        }
      }).catch(() => {})
    }
  }
}
</script>
