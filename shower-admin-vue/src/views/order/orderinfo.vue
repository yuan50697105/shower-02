<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-provider__orderinfo}">
      <el-form :inline="true" :model="dataForm" @keyup.enter.native="getDataList()">
        <el-form-item>
          <el-input v-model="dataForm.id" placeholder="名字" clearable />
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
        <el-table-column prop="orderNo" label="订单编号" header-align="center" align="center" />
        <el-table-column prop="type" label="订单类型" header-align="center" align="center" />
        <el-table-column prop="deviceCode" label="设备号" header-align="center" align="center" />
        <el-table-column prop="totalPrice" label="总价" header-align="center" align="center" />
        <el-table-column prop="status" label="订单状态" header-align="center" align="center" />
        <el-table-column prop="useStartTime" label="使用开始时间" header-align="center" align="center" />
        <el-table-column prop="useEndTime" label="使用结束时间" header-align="center" align="center" />
        <el-table-column prop="transactionId" label="微信交易号" header-align="center" align="center" />
        <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
          <template slot-scope="scope">
            <el-button type="text" size="small" @click="viewInfoHandle(scope.row.id)">{{ $t('info') }}</el-button>
            <el-button type="text" size="small" @click="addOrUpdateHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button type="text" size="small" @click="deleteHandle(scope.row.id)">{{ $t('delete') }}</el-button>
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
import AddOrUpdate from './orderinfo-add-or-update'
import viewInfo from './orderinfo-view-info'
export default {
  components: {
    AddOrUpdate, viewInfo
  },
  mixins: [mixinViewModule],
  data() {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/order/orderinfo/page',
        getDataListIsPage: true,
        exportURL: '/order/orderinfo/export',
        deleteURL: '/order/orderinfo',
        deleteIsBatch: true
      },
      dataForm: {
        id: ''
      }
    }
  }
}
</script>
