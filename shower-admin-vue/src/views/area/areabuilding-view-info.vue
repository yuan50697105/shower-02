<template>
  <el-dialog :visible.sync="visible" title="查看" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form ref="dataForm" :model="dataForm" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
      <el-form-item label="创建时间" prop="createTime">
        <el-input v-model="dataForm.createTime" placeholder="创建时间" />
      </el-form-item>
      <el-form-item label="更新时间" prop="updateTime">
        <el-input v-model="dataForm.updateTime" placeholder="更新时间" />
      </el-form-item>
      <el-form-item label="创建人" prop="createUser">
        <el-input v-model="dataForm.createUser" placeholder="创建人" />
      </el-form-item>
      <el-form-item label="修改人" prop="updateUser">
        <el-input v-model="dataForm.updateUser" placeholder="修改人" />
      </el-form-item>
      <el-form-item label="楼宇名称" prop="name">
        <el-input v-model="dataForm.name" placeholder="楼宇名称" />
      </el-form-item>
      <el-form-item label="楼宇编号" prop="code">
        <el-input v-model="dataForm.code" placeholder="楼宇编号" />
      </el-form-item>
      <el-form-item label="所属区域ID" prop="areaId">
        <el-input v-model="dataForm.areaId" placeholder="所属区域ID" />
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
        createTime: '',
        updateTime: '',
        createUser: '',
        updateUser: '',
        name: '',
        code: '',
        areaId: ''
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
      this.$http.get(`/order/areabuilding/${this.dataForm.id}`).then(({ data: res }) => {
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
