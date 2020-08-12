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
          <el-button v-if="$hasPermission('order:deviceinfo:save')" type="primary" @click="addOrUpdateHandle()">{{ $t('add') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button v-if="$hasPermission('order:deviceinfo:delete')" type="danger" @click="deleteHandle()">{{ $t('deleteBatch') }}</el-button>
        </el-form-item>
      </el-form>
      <el-table v-loading="dataListLoading" :data="dataList" border style="width: 100%;" @selection-change="dataListSelectionChangeHandle">
        <el-table-column type="selection" header-align="center" align="center" width="50" />
        <el-table-column type="index" label="序号" header-align="center" align="center" width="50" />
        <el-table-column prop="id" label="id" header-align="center" align="center" />
        <el-table-column prop="createTime" label="创建时间" header-align="center" align="center" />
        <el-table-column prop="updateTime" label="更新时间" header-align="center" align="center" />
        <el-table-column prop="createUser" label="创建人" header-align="center" align="center" />
        <el-table-column prop="updateUser" label="修改人" header-align="center" align="center" />
        <el-table-column prop="code" label="设备编号" header-align="center" align="center" />
        <el-table-column prop="productKey" label="产品编号" header-align="center" align="center" />
        <el-table-column prop="deviceName" label="设备名称" header-align="center" align="center" />
        <el-table-column prop="type" label="设备类型" header-align="center" align="center" />
        <el-table-column prop="priceCode" label="定价编号" header-align="center" align="center" />
        <el-table-column prop="enabled" label="启用状态(0:未启用；1已启用)" header-align="center" align="center" />
        <el-table-column prop="longitude" label="经度" header-align="center" align="center" />
        <el-table-column prop="latitude" label="纬度" header-align="center" align="center" />
        <el-table-column prop="areaId" label="区域ID" header-align="center" align="center" />
        <el-table-column prop="areaName" label="区域名称" header-align="center" align="center" />
        <el-table-column prop="buildingId" label="楼宇ID" header-align="center" align="center" />
        <el-table-column prop="buildingName" label="楼宇名称" header-align="center" align="center" />
        <el-table-column prop="picture" label="设备图片" header-align="center" align="center" />
        <el-table-column prop="runStatus" label="运行状态 0 可用 1 使用中 " header-align="center" align="center" />
        <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
          <template slot-scope="scope">
            <el-button v-if="$hasPermission('order:deviceinfo:info')" type="text" size="small" @click="viewInfoHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button v-if="$hasPermission('order:deviceinfo:update')" type="text" size="small" @click="addOrUpdateHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button v-if="$hasPermission('order:deviceinfo:delete')" type="text" size="small" @click="deleteHandle(scope.row.id)">{{ $t('delete') }}</el-button>
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
export default {
  components: {
    AddOrUpdate, viewInfo
  },
  mixins: [mixinViewModule],
  data() {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/order/deviceinfo/page',
        getDataListIsPage: true,
        exportURL: '/order/deviceinfo/export',
        deleteURL: '/order/deviceinfo',
        deleteIsBatch: true
      },
      dataForm: {
        id: ''
      }
    }
  }
}
</script>
