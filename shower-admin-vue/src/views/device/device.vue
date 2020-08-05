<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input
        v-model="listQuery.code"
        class="filter-item"
        placeholder="请输入设备编号"
        style="width: 200px;"
        @keyup.enter.native="handleFilter"
      />
      <el-input
        v-model="listQuery.deviceName"
        class="filter-item"
        placeholder="请输入设备名称"
        style="width: 200px;"
        @keyup.enter.native="handleFilter"
      />

      <el-button v-waves class="filter-item" icon="el-icon-search" type="primary" @click="handleFilter">
        查询
      </el-button>
      <el-button
        class="filter-item"
        icon="el-icon-edit"
        style="margin-left: 10px;"
        type="primary"
        @click="handleCreate"
      >
        添加
      </el-button>
      <el-button
        v-waves
        :loading="downloadLoading"
        class="filter-item"
        icon="el-icon-download"
        type="primary"
        @click="handleDownload"
      >
        导出
      </el-button>
      <!--      <el-checkbox @change="tableKey=tableKey+1" class="filter-item" style="margin-left:15px;" v-model="showReviewer">-->
      <!--        reviewer-->
      <!--      </el-checkbox>-->
    </div>

    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      fit
      highlight-current-row
      style="width: 100%;"
      @sort-change="sortChange"
    >
      <el-table-column
        align="center"
        label="设备编号"
        prop="code"
        sortable="custom"
      >
        <template slot-scope="{row}">
          <span>{{ row.code }}</span>
        </template>
      </el-table-column>
      <el-table-column
        align="center"
        label="设备名称"
        prop="deviceName"
        sortable="custom"
      >
        <template slot-scope="{row}">
          <span>{{ row.deviceName }}</span>
        </template>
      </el-table-column>
      <el-table-column
        align="center"
        label="设备类型"
        prop="type"
        sortable="custom"
      >
        <template slot-scope="{row}">
          <span>{{ row.type }}</span>
        </template>
      </el-table-column>
      <el-table-column
        align="center"
        label="定价方案编号"
        prop="priceCode"
        sortable="custom"
      >
        <template slot-scope="{row}">
          <span>{{ row.priceCode }}</span>
        </template>
      </el-table-column>
      <el-table-column
        align="center"
        label="区域名称"
        prop="areaName"
        sortable="custom"
      >
        <template slot-scope="{row}">
          <span>{{ row.areaName }}</span>
        </template>
      </el-table-column>
      <el-table-column
        align="center"
        label="楼宇名称"
        prop="buildingName"
        sortable="custom"
      >
        <template slot-scope="{row}">
          <span>{{ row.buildingName }}</span>
        </template>
      </el-table-column>
      <el-table-column
        align="center"
        label="启用状态"
        prop="enabled"
        sortable="custom"
      >
        <template slot-scope="{row}">
          <span>{{ row.enabled | enableFilter }}</span>
        </template>
      </el-table-column>
      <el-table-column
        align="center"
        label="运行状态"
        prop="runStatus"
        sortable="custom"
      >
        <template slot-scope="{row}">
          <span>{{ row.runStatus | runFilter }}</span>
        </template>
      </el-table-column>

      <el-table-column align="center" class-name="small-padding fixed-width" label="操作" width="230">
        <template slot-scope="{row}">
          <el-button size="mini" type="primary" @click="handleUpdate(row)">
            编辑
          </el-button>
          <el-button size="mini" type="danger" @click="handleDelete(row)">
            删除
          </el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :limit.sync="listQuery.limit"
      :page.sync="listQuery.page"
      :total="total"
      @pagination="getList"
    />

    <el-dialog :title="textMap[dialogStatus]" :visible.sync="dialogFormVisible">
      <el-form
        ref="dataForm"
        :model="data"
        :rules="rules"
        label-position="left"
        label-width="70px"
        style="width: 400px; margin-left:50px;"
      >
        <el-form-item v-if="dialogStatus==='create'" label="设备编号" prop="code">
          <el-input v-model="data.code" />
        </el-form-item>
        <el-form-item v-if="dialogStatus==='create'" label="产品编号" prop="productKey">
          <el-input v-model="data.productKey" show-password />
        </el-form-item>
        <el-form-item label="产品名称" prop="deviceName">
          <el-input v-model="data.productKey" show-password />
        </el-form-item>
        <el-form-item label="昵称" prop="name">
          <el-input v-model="data.name" />
        </el-form-item>
        <el-form-item label="角色" prop="roleIds">
          <el-select v-model="data.roleIds" multiple placeholder="请选择">
            <el-option
              v-for="item in roleList"
              :key="item.id"
              :label="item.name"
              :value="item.id"
            />
          </el-select>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">
          Cancel
        </el-button>
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">
          Confirm
        </el-button>
      </div>
    </el-dialog>

    <el-dialog :visible.sync="dialogPvVisible" title="Reading statistics">
      <el-table :data="pvData" border fit highlight-current-row style="width: 100%">
        <el-table-column label="Channel" prop="key" />
        <el-table-column label="Pv" prop="pv" />
      </el-table>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="dialogPvVisible = false">Confirm</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
import waves from '@/directive/waves' // waves directive
import Pagination from '@/components/Pagination/index'
import { addDevice, deleteDevice, getDevice, modifyDevice, pageDevice } from '@/api/device'

const calendarTypeOptions = [
  { key: 'CN', display_name: 'China' },
  { key: 'US', display_name: 'USA' },
  { key: 'JP', display_name: 'Japan' },
  { key: 'EU', display_name: 'Eurozone' }
]
const enableStatus = { 0: '未启用', 1: '已启用' }
const runStatus = { 0: '可使用', 1: '使用中', 2: '不可用' }

// arr to obj, such as { CN : "China", US : "USA" }
const calendarTypeKeyValue = calendarTypeOptions.reduce((acc, cur) => {
  acc[cur.key] = cur.display_name
  return acc
}, {})

export default {
  name: 'SysUser',
  components: { Pagination },
  directives: { waves },
  filters: {
    statusFilter(status) {
      const statusMap = {
        published: 'success',
        draft: 'info',
        deleted: 'danger'
      }
      return statusMap[status]
    },
    typeFilter(type) {
      return calendarTypeKeyValue[type]
    },
    enableFilter(status) {
      return enableStatus[status]
    },
    runFilter(status) {
      return runStatus[status]
    }
  },
  data() {
    return {
      roleList: [],
      tableKey: 0,
      list: null,
      total: 0,
      listLoading: true,
      listQuery: {
        page: 1,
        limit: 20,
        importance: undefined,
        code: undefined,
        deviceName: undefined,
        type: undefined,
        sort: '+id'
      },
      importanceOptions: [1, 2, 3],
      calendarTypeOptions,
      sortOptions: [{ label: 'ID Ascending', key: '+id' }, { label: 'ID Descending', key: '-id' }],
      statusOptions: ['published', 'draft', 'deleted'],
      showReviewer: false,
      data: {
        id: undefined,
        code: '',
        productKey: '',
        deviceName: '',
        type: '',
        priceCode: '',
        enabled: '',
        areaId: undefined,
        areaName: '',
        buildingId: undefined,
        buildingName: '',
        runStatus: '',
        picture: ''
      },
      dialogFormVisible: false,
      dialogStatus: '',
      textMap: {
        update: 'Edit',
        create: 'Create'
      },
      dialogPvVisible: false,
      pvData: [],
      rules: {
        // type: [{required: true, message: 'type is required', trigger: 'change'}],
        // timestamp: [{type: 'date', required: true, message: 'timestamp is required', trigger: 'change'}],
        // title: [{required: true, message: 'title is required', trigger: 'blur'}]
      },
      downloadLoading: false
    }
  },
  created() {
    this.getList()
  },
  methods: {
    getList() {
      this.listLoading = true
      pageDevice(this.listQuery).then(response => {
        this.list = response.data.data
        this.total = response.data.totalRows

        // Just to simulate the time of the request
        setTimeout(() => {
          this.listLoading = false
        }, 1.5 * 1000)
      })
    },
    handleFilter() {
      this.listQuery.page = 1
      this.getList()
    },
    handleModifyStatus(row, status) {
      this.$message({
        message: '操作Success',
        type: 'success'
      })
      row.status = status
    },
    sortChange(data) {
      const { prop, order } = data
      if (prop === 'id') {
        this.sortByID(order)
      }
    },
    sortByID(order) {
      if (order === 'ascending') {
        this.listQuery.sort = '+id'
      } else {
        this.listQuery.sort = '-id'
      }
      this.handleFilter()
    },
    resetTemp() {
      this.data = {
        id: undefined,
        importance: 1,
        remark: '',
        timestamp: new Date(),
        code: '',
        status: 'published',
        type: ''
      }
    },
    handleCreate() {
      this.resetTemp()
      this.dialogStatus = 'create'
      this.getRoleList()
      this.dialogFormVisible = true
      this.$nextTick(() => {
        this.$refs['dataForm'].clearValidate()
      })
    },
    createData() {
      this.$refs['dataForm'].validate((valid) => {
        if (valid) {
          this.data.id = parseInt(Math.random() * 100) + 1024 // mock a id
          this.data.author = 'vue-element-admin'
          addDevice(this.data).then(() => {
            // this.list.unshift(this.data)
            this.dialogFormVisible = false
            this.$notify({
              username: 'Success',
              message: 'Created Successfully',
              type: 'success',
              duration: 2000
            })
            this.getList()
          })
        }
      })
    },
    handleUpdate(row) {
      // this.data = Object.assign({}, row) // copy obj
      // this.data.timestamp = new Date(this.data.timestamp)
      this.getRoleList()
      this.dialogStatus = 'update'
      this.dialogFormVisible = true
      getDevice(row.id).then(value => {
        const { data } = value
        console.log(data)
        this.data = value.data
      })
      this.$nextTick(() => {
        this.$refs['dataForm'].clearValidate()
      })
    },
    updateData() {
      this.$refs['dataForm'].validate((valid) => {
        if (valid) {
          // const tempData = Object.assign({}, this.data)
          // tempData.timestamp = +new Date(tempData.timestamp) // change Thu Nov 30 2017 16:41:05 GMT+0800 (CST) to 1512031311464
          modifyDevice(this.data).then(() => {
            this.dialogFormVisible = false
            this.$notify({
              username: 'Success',
              message: 'Update Successfully',
              type: 'success',
              duration: 2000
            })
            this.getList()
          })
        }
      })
    },
    handleDelete(row) {
      this.$confirm('确认删除此角色吗?', 'Warning', {
        confirmButtonText: '确认',
        cancelButtonText: '取消',
        type: 'warning'
      })
        .then(async() => {
          await deleteDevice(row.id)
          this.$message({
            type: 'success',
            message: '删除成功!'
          })
          this.getList()
        })
        .catch(err => {
          console.error(err)
        })
      // this.$notify({
      //   username: 'Success',
      //   message: 'Delete Successfully',
      //   type: 'success',
      //   duration: 2000
      // })
      // this.list.splice(user, 1)
    },
    handleDownload() {
      this.downloadLoading = true
      import('@/vendor/Export2Excel').then(excel => {
        const tHeader = ['timestamp', 'title', 'type', 'importance', 'status']
        const filterVal = ['timestamp', 'title', 'type', 'importance', 'status']
        const data = this.formatJson(filterVal)
        excel.export_json_to_excel({
          header: tHeader,
          data,
          filename: 'table-list'
        })
        this.downloadLoading = false
      })
    },
    getSortClass: function(key) {
      const sort = this.listQuery.sort
      return sort === `+${key}` ? 'ascending' : 'descending'
    }
  }
}
</script>
