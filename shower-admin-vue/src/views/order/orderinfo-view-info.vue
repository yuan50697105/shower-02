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
      <el-form-item label="订单编号" prop="orderNo">
        <el-input v-model="dataForm.orderNo" placeholder="订单编号" />
      </el-form-item>
      <el-form-item label="订单类型" prop="type">
        <el-input v-model="dataForm.type" placeholder="订单类型" />
      </el-form-item>
      <el-form-item label="客户ID" prop="customerId">
        <el-input v-model="dataForm.customerId" placeholder="客户ID" />
      </el-form-item>
      <el-form-item label="客户OPENID" prop="customerOpenId">
        <el-input v-model="dataForm.customerOpenId" placeholder="客户OPENID" />
      </el-form-item>
      <el-form-item label="客户UNIONID" prop="customerUnionId">
        <el-input v-model="dataForm.customerUnionId" placeholder="客户UNIONID" />
      </el-form-item>
      <el-form-item label="设备号" prop="deviceCode">
        <el-input v-model="dataForm.deviceCode" placeholder="设备号" />
      </el-form-item>
      <el-form-item label="设备ID" prop="deviceId">
        <el-input v-model="dataForm.deviceId" placeholder="设备ID" />
      </el-form-item>
      <el-form-item label="总价" prop="totalPrice">
        <el-input v-model="dataForm.totalPrice" placeholder="总价" />
      </el-form-item>
      <el-form-item label="订单状态" prop="status">
        <el-input v-model="dataForm.status" placeholder="订单状态" />
      </el-form-item>
      <el-form-item label="使用开始时间" prop="useStartTime">
        <el-input v-model="dataForm.useStartTime" placeholder="使用开始时间" />
      </el-form-item>
      <el-form-item label="使用结束时间" prop="useEndTime">
        <el-input v-model="dataForm.useEndTime" placeholder="使用结束时间" />
      </el-form-item>
      <el-form-item label="微信交易号" prop="transactionId">
        <el-input v-model="dataForm.transactionId" placeholder="微信交易号" />
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
        orderNo: '',
        type: '',
        customerId: '',
        customerOpenId: '',
        customerUnionId: '',
        deviceCode: '',
        deviceId: '',
        totalPrice: '',
        status: '',
        useStartTime: '',
        useEndTime: '',
        transactionId: ''
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
      this.$http.get(`/provider/orderinfo/${this.dataForm.id}`).then(({ data: res }) => {
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
