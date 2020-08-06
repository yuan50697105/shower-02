<template>
  <div class="app-container">
    <el-form ref="dataForm" :rules="rules" :model="dataForm" status-icon label-width="300px">
      <el-form-item label="直接分享比例" prop="shower_share_direct">
        <el-input-number v-model="dataForm.shower_share_direct" :precision="2" class="input-width" min="1" max="100"/>
        <span class="info">百分比</span>
      </el-form-item>
      <el-form-item label="间接分享比例" prop="shower_share_indirect">
        <el-input-number v-model="dataForm.shower_share_indirect" :precision="2" class="input-width" min="1" max="100"/>
        <span class="info">百分比</span>
      </el-form-item>
      <el-form-item>
        <el-button @click="cancel">取消</el-button>
        <el-button type="primary" @click="update">确定</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import { listShare, updateShare } from '@/api/config'

export default {
  name: 'ConfigOrder',
  data() {
    return {
      dataForm: {}
    }
  },
  created() {
    this.init()
  },
  methods: {
    init: function() {
      listShare().then(response => {
        this.dataForm = response.data.data
      })
    },
    cancel() {
      this.init()
    },
    update() {
      updateShare(this.dataForm)
        .then(response => {
          this.$notify.success({
            title: '成功',
            message: '分享比例参数配置成功'
          })
        })
        .catch(response => {
          this.$notify.error({
            title: '失败',
            message: response.data.errmsg
          })
        })
    }
  }
}
</script>
<style scoped>
  .input-width {
    width: 50%;
  }
  .info {
    margin-left: 15px;
  }
</style>
