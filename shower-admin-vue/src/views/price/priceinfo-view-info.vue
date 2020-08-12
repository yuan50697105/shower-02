<template>
  <el-dialog :visible.sync="visible" title="查看" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form ref="dataForm" :model="dataForm" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
      <el-form-item label="createTime" prop="createTime">
        <el-input v-model="dataForm.createTime" placeholder="createTime" />
      </el-form-item>
      <el-form-item label="updateTime" prop="updateTime">
        <el-input v-model="dataForm.updateTime" placeholder="updateTime" />
      </el-form-item>
      <el-form-item label="createUser" prop="createUser">
        <el-input v-model="dataForm.createUser" placeholder="createUser" />
      </el-form-item>
      <el-form-item label="updateUser" prop="updateUser">
        <el-input v-model="dataForm.updateUser" placeholder="updateUser" />
      </el-form-item>
      <el-form-item label="编号" prop="code">
        <el-input v-model="dataForm.code" placeholder="编号" />
      </el-form-item>
      <el-form-item label="类型" prop="type">
        <el-input v-model="dataForm.type" placeholder="类型" />
      </el-form-item>
      <el-form-item label="地区码" prop="priceCode">
        <el-input v-model="dataForm.priceCode" placeholder="地区码" />
      </el-form-item>
      <el-form-item label="时间定价" prop="timePrice">
        <el-input v-model="dataForm.timePrice" placeholder="时间定价" />
      </el-form-item>
      <el-form-item label="时间计费间隔" prop="timeInterval">
        <el-input v-model="dataForm.timeInterval" placeholder="时间计费间隔" />
      </el-form-item>
      <el-form-item label="时间单位" prop="timeUnit">
        <el-input v-model="dataForm.timeUnit" placeholder="时间单位" />
      </el-form-item>
      <el-form-item label="水定价" prop="waterPrice">
        <el-input v-model="dataForm.waterPrice" placeholder="水定价" />
      </el-form-item>
      <el-form-item label="水计费间隔" prop="waterInterval">
        <el-input v-model="dataForm.waterInterval" placeholder="水计费间隔" />
      </el-form-item>
      <el-form-item label="水计费单位" prop="waterUnit">
        <el-input v-model="dataForm.waterUnit" placeholder="水计费单位" />
      </el-form-item>
      <el-form-item label="有效" prop="enabled">
        <el-input v-model="dataForm.enabled" placeholder="有效" />
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
        code: '',
        type: '',
        priceCode: '',
        timePrice: '',
        timeInterval: '',
        timeUnit: '',
        waterPrice: '',
        waterInterval: '',
        waterUnit: '',
        enabled: ''
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
      this.$http.get(`/order/priceinfo/${this.dataForm.id}`).then(({ data: res }) => {
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
