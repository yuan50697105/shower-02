<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form ref="dataForm" :model="dataForm" :rules="dataRule" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'" @keyup.enter.native="dataFormSubmitHandle()">
      <el-form-item label="订单编号" prop="orderNo">
        <el-input v-model="dataForm.orderNo" placeholder="订单编号" :disabled="true" />
      </el-form-item>
      <el-form-item label="订单状态" prop="status">
        <el-select v-model="dataForm.status" clearable placeholder="请选择订单状态">
          <el-option
            v-for="item in statusOptions"
            :key="item.value"
            :label="item.label"
            :value="item.value"
          />
        </el-select>
      </el-form-item>
    </el-form>
    <template slot="footer">
      <el-button @click="visible = false">{{ $t('cancel') }}</el-button>
      <el-button type="primary" @click="dataFormSubmitHandle()">{{ $t('confirm') }}</el-button>
    </template>
  </el-dialog>
</template>

<script>
import debounce from 'lodash/debounce'
import { getInfo, updateAo } from '@/api/order'
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
      },
      // 订单状态
      statusOptions: [{
        value: 1,
        label: '已下单'
      }, {
        value: 2,
        label: '使用中'
      }, {
        value: 3,
        label: '待付款'
      }, {
        value: 4,
        label: '已支付'
      }, {
        value: 5,
        label: '订单完成'
      }, {
        value: 6,
        label: '订单超时'
      }, {
        value: 7,
        label: '订单取消'
      }]
    }
  },
  computed: {
    dataRule() {
      return {
        status: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ]
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
      getInfo(this.dataForm.id).then(respone => {
        this.dataForm = {
          ...this.dataForm,
          ...respone.data
        }
      })
    },
    // 表单提交
    dataFormSubmitHandle: debounce(function() {
      this.$refs['dataForm'].validate((valid) => {
        if (!valid) {
          return false
        }
        updateAo(this.dataForm).then(respone => {
          this.$message({
            message: this.$t('prompt.success'),
            type: 'success',
            duration: 500,
            onClose: () => {
              this.visible = false
              this.$emit('refreshDataList')
            }
          })
        })
      })
    }, 1000, { 'leading': true, 'trailing': false })
  }
}
</script>
<style >
  .el-select {
    width: 85%;
  }
  .el-dialog {
    width: 65%;
  }
  .el-form-item__label {
    width: 15% !important;
  }
  .el-input {
    width: 85% !important;
  }
  .el-select > .el-input{
    width: 100% !important;
  }
</style>
