<template>
  <el-dialog
    :visible.sync="visible"
    :title="!dataForm.id ? $t('add') : $t('update')"
    :close-on-click-modal="false"
    :close-on-press-escape="false"
  >
    <el-form
      ref="dataForm"
      :model="dataForm"
      :rules="dataRule"
      :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'"
      @keyup.enter.native="dataFormSubmitHandle()"
    >
      <el-form-item label="区域名称" prop="name">
        <el-input v-model="dataForm.name" placeholder="区域名称" />
      </el-form-item>
      <el-form-item label="区域编号" prop="code" :disabled="isUpdateShow">
        <el-input v-model="dataForm.code" placeholder="区域编号" />
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
        createDate: '',
        updateDate: '',
        creator: '',
        updater: '',
        name: '',
        code: ''
      }
    }
  },
  computed: {
    dataRule() {
      return {
        name: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ],
        code: [
          { required: true, message: this.$t('validate.required'), trigger: 'blur' }
        ]
      }
    },
    isUpdateShow() {
      if (this.dataForm.id) {
        return true
      } else {
        return false
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
      this.$http.get(`area/info/${this.dataForm.id}`).then((res) => {
        if (res.code !== 200) {
          return this.$message.error(res.msg)
        }
        // this.dataForm = {
        //   ...this.dataForm,
        //   ...res.data.data
        // }
        this.dataForm = res.data
        console.log(res)
      }).catch(() => {
      })
    },
    // 表单提交
    dataFormSubmitHandle: debounce(function() {
      this.$refs['dataForm'].validate((valid) => {
        if (!valid) {
          return false
        }
        this.$http[!this.dataForm.id ? 'post' : 'put']('/area/info/', this.dataForm).then((data) => {
          if (data.code !== 200) {
            return this.$message.error(data.msg)
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
        }).catch(() => {
        })
      })
    }, 1000, { 'leading': true, 'trailing': false })
  }
}
</script>
