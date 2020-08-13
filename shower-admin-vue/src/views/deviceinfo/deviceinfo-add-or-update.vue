<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form ref="dataForm" :model="dataForm" :rules="dataRule" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'" @keyup.enter.native="dataFormSubmitHandle()">
      <el-form-item label="设备编号" prop="code">
        <el-input v-model="dataForm.code" placeholder="设备编号" />
      </el-form-item>
      <el-form-item label="产品编号" prop="productKey">
        <el-input v-model="dataForm.productKey" placeholder="产品编号" />
      </el-form-item>
      <el-form-item label="设备名称" prop="deviceName">
        <el-input v-model="dataForm.deviceName" placeholder="设备名称" />
      </el-form-item>
      <el-form-item label="设备类型" prop="type">
        <el-input v-model="dataForm.type" placeholder="设备类型" />
      </el-form-item>
      <el-form-item label="定价编号" prop="priceCode">
        <el-input v-model="dataForm.priceCode" placeholder="定价编号" />
      </el-form-item>
      <el-form-item label="区域名称" prop="areaName">
        <el-input v-model="dataForm.areaName" placeholder="区域名称" />
      </el-form-item>
      <el-form-item label="楼宇名称" prop="buildingName">
        <el-input v-model="dataForm.buildingName" placeholder="楼宇名称" />
      </el-form-item>
      <el-form-item label="设备图片" prop="picture">
        <el-input v-model="dataForm.picture" placeholder="设备图片" />
      </el-form-item>
      <el-form-item label="运行状态" prop="runStatus">
        <el-input v-model="dataForm.runStatus" placeholder="运行状态" />
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
        productKey: '',
        deviceName: '',
        type: '',
        priceCode: '',
        enabled: '',
        longitude: '',
        latitude: '',
        areaId: '',
        areaName: '',
        buildingId: '',
        buildingName: '',
        picture: '',
        runStatus: ''
      }
    }
  },
  computed: {
    dataRule() {
      return {
        createTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        updateTime: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        createUser: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        updateUser: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        code: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        productKey: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        deviceName: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        type: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        priceCode: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        enabled: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        longitude: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        latitude: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        areaId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        areaName: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        buildingId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        buildingName: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        picture: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        runStatus: [
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
      this.$http.get(`/order/deviceinfo/${this.dataForm.id}`).then(({ data: res }) => {
        if (res.code !== 0) {
          return this.$message.error(res.msg)
        }
        this.dataForm = {
          ...this.dataForm,
          ...res.data
        }
      }).catch(() => {})
    },
    // 表单提交
    dataFormSubmitHandle: debounce(function() {
      this.$refs['dataForm'].validate((valid) => {
        if (!valid) {
          return false
        }
        this.$http[!this.dataForm.id ? 'post' : 'put']('/order/deviceinfo/', this.dataForm).then(({ data: res }) => {
          if (res.code !== 0) {
            return this.$message.error(res.msg)
          }
          this.$message({
            message: this.$t('prompt.success'),
            type: 'success',
            duration: 500,
            onClose: () => {
              this.visible = false
              this.$emit('refreshDataList')
            }
          })
        }).catch(() => {})
      })
    }, 1000, { 'leading': true, 'trailing': false })
  }
}
</script>
