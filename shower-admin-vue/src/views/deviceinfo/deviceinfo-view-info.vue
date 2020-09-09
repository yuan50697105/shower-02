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
      <el-form-item label="启用状态(0:未启用；1已启用)" prop="enabled">
        <el-input v-model="dataForm.enabled" placeholder="启用状态(0:未启用；1已启用)" />
      </el-form-item>
      <el-form-item label="经度" prop="longitude">
        <el-input v-model="dataForm.longitude" placeholder="经度" />
      </el-form-item>
      <el-form-item label="纬度" prop="latitude">
        <el-input v-model="dataForm.latitude" placeholder="纬度" />
      </el-form-item>
      <el-form-item label="区域ID" prop="areaId">
        <el-input v-model="dataForm.areaId" placeholder="区域ID" />
      </el-form-item>
      <el-form-item label="区域名称" prop="areaName">
        <el-input v-model="dataForm.areaName" placeholder="区域名称" />
      </el-form-item>
      <el-form-item label="楼宇ID" prop="buildingId">
        <el-input v-model="dataForm.buildingId" placeholder="楼宇ID" />
      </el-form-item>
      <el-form-item label="楼宇名称" prop="buildingName">
        <el-input v-model="dataForm.buildingName" placeholder="楼宇名称" />
      </el-form-item>
      <el-form-item label="设备图片" prop="picture">
        <el-input v-model="dataForm.picture" placeholder="设备图片" />
      </el-form-item>
      <el-form-item label="运行状态 0 可用 1 使用中 " prop="runStatus">
        <el-input v-model="dataForm.runStatus" placeholder="运行状态 0 可用 1 使用中 " />
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
      this.$http.get(`/device/info/${this.dataForm.id}`).then(res => {
        if (res.code !== 200) {
          return this.$message.error(res.msg)
        }
        this.dataForm = {
          ...this.dataForm,
          ...res.data
        }
      }).catch(() => {
      })
    }
  }
}
</script>
