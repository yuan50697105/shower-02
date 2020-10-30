<template>
  <el-dialog :visible.sync="visible" :title="!dataForm.id ? $t('add') : $t('update')" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form ref="dataForm" :model="dataForm" :rules="dataRule" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'" @keyup.enter.native="dataFormSubmitHandle()">
      <el-form-item label="楼宇名称" prop="name">
        <el-input v-model="dataForm.name" placeholder="楼宇名称" />
      </el-form-item>
      <el-form-item label="楼宇编号" prop="code">
        <el-input v-model="dataForm.code" placeholder="楼宇编号" />
      </el-form-item>
      <el-form-item label="所属区域" prop="areaId">
        <template>
          <el-select v-model="dataForm.areaId" placeholder="请选择区域">
            <el-option
              v-for="(item,index) in areaList"
              :key="index"
              :label="item.name"
              :value="item.id">
            </el-option>
          </el-select>
        </template>
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
import { getInfo, update, save } from '@/api/areabuild'
export default {
  data() {
    return {
      visible: false,
      areaList: [],
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
        name: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        code: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        areaId: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    init() {
      this.visible = true
      this.getAreaList()
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
        console.log(respone)
        this.dataForm = {
          ...this.dataForm,
          ...respone.data
        }
      })
    },
    // 获取区域信息
    getAreaList() {
      this.$http.get(`/area/info/list`).then(({ data: res }) => {
        this.areaList = res
      }).catch(() => {})
    },
    // 表单提交
    dataFormSubmitHandle: debounce(function() {
      this.$refs['dataForm'].validate((valid) => {
        if (!valid) {
          return false
        }
        console.log(this.dataForm)
        save(this.dataForm).then(respone => {
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
