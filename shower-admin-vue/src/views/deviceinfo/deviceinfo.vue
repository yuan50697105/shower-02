<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-order__deviceinfo}">
      <el-form :inline="true" :model="dataForm" @keyup.enter.native="getDataList()">
        <el-form-item>
          <el-input v-model="dataForm.id" placeholder="id" clearable />
        </el-form-item>
        <el-form-item>
          <el-button @click="getDataList()">{{ $t('query') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button type="info" @click="exportHandle()">{{ $t('export') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="addOrUpdateHandle()">{{ $t('add') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button type="danger" @click="deleteHandle()">{{ $t('deleteBatch') }}</el-button>
        </el-form-item>
      </el-form>
      <el-table v-loading="dataListLoading" :data="dataList" border style="width: 100%;" @selection-change="dataListSelectionChangeHandle">
        <el-table-column type="selection" header-align="center" align="center" width="50" />
        <el-table-column type="index" label="序号" header-align="center" align="center" width="50" />
        <el-table-column prop="createDate" label="创建时间" header-align="center" align="center" />
        <el-table-column prop="code" label="设备编号" header-align="center" align="center" />
        <el-table-column prop="productKey" label="产品编号" header-align="center" align="center" />
        <el-table-column prop="deviceName" label="设备名称" header-align="center" align="center" />
        <!-- <el-table-column prop="type" label="设备类型" header-align="center" align="center" /> -->
        <el-table-column prop="priceCode" label="定价编号" header-align="center" align="center" />
        <el-table-column prop="enabled" label="启用状态" header-align="center" align="center" />
        <el-table-column prop="longitude" label="经度" header-align="center" align="center" />
        <el-table-column prop="latitude" label="纬度" header-align="center" align="center" />
        <el-table-column prop="areaName" label="区域名称" header-align="center" align="center" />
        <el-table-column prop="buildingName" label="楼宇名称" header-align="center" align="center" />
        <el-table-column prop="picture" label="设备图片" header-align="center" align="center">
          <template slot-scope="scope">
            <img :src="scope.row.pictureUrl" style="width: 50px;height: 50px">
          </template>
        </el-table-column>
        <el-table-column prop="runStatus" label="运行状态" header-align="center" align="center" />
        <el-table-column prop="qrPictureUrl" label="二维码" header-align="center" align="center">
          <template slot-scope="scope">
            <a :href="scope.row.qrPictureUrl">下载二维码</a>
            <!--            <img :src="scope.row.qrPictureUrl" style="width: 50px;height: 50px">-->
          </template>
        </el-table-column>
        <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
          <template slot-scope="scope">
            <!--            <el-button type="text" size="small" @click="viewInfoHandle(scope.row.id)">{{ $t('info') }}</el-button>-->
            <el-button type="text" size="small" @click="addOrUpdateHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button type="text" size="small" @click="deleteHandle(scope.row.id)">{{ $t('delete') }}</el-button>
            <el-button type="text" size="small" @click="QRCode(scope.row)">重新生成二维码</el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        :current-page="page"
        :page-sizes="[10, 20, 50, 100]"
        :page-size="limit"
        :total="total"
        layout="total, sizes, prev, pager, next, jumper"
        @size-change="pageSizeChangeHandle"
        @current-change="pageCurrentChangeHandle"
      />
      <!-- 弹窗, 新增 / 修改 -->
      <add-or-update v-if="addOrUpdateVisible" ref="addOrUpdate" @refreshDataList="getDataList" />
      <!-- 弹窗, 详情-->
      <view-info v-if="viewInfoVisible" ref="viewInfo" @refreshDataList="getDataList" />
    </div>
  </el-card>
</template>

<script>
import mixinViewModule from '@/mixins/view-module'
import AddOrUpdate from './deviceinfo-add-or-update'
import viewInfo from './deviceinfo-view-info'
import { QRCode } from '@/api/device'

export default {
  components: {
    AddOrUpdate, viewInfo
  },
  mixins: [mixinViewModule],
  data() {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/device/info/data',
        getDataListIsPage: true,
        exportURL: 'deviceinfo/export',
        deleteURL: 'device/info',
        deleteIsBatch: true
      },
      dataForm: {
        id: ''
      }
    }
  },
  methods: {
    async QRCode(row) {
      console.log(row)
      const data = {
        id: row.id,
        deviceName: row.deviceName,
        picture: row.picture
      }
      QRCode(data).then(response => {
        if (response.code == 200) {
          this.$message({
            message: '生成成功',
            type: 'success'
          })
        } else {
          this.$message.error('生成失败')
        }
      })
    }
  }
}
</script>
