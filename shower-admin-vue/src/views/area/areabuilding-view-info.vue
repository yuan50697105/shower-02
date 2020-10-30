<template>
  <el-dialog :visible.sync="visible" title="查看" :close-on-click-modal="false" :close-on-press-escape="false">
    <el-form ref="dataForm" :model="dataForm" :label-width="$i18n.locale === 'en-US' ? '120px' : '80px'">
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
    </template>
  </el-dialog>
</template>

<script>
import { getInfo} from '@/api/areabuild'
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
    // 获取区域信息
    getAreaList() {
      this.$http.get(`/area/info/list`).then(({ data: res }) => {
        this.areaList = res
      }).catch(() => {})
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
