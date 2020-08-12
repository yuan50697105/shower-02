<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-order__priceinfo}">
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
          <el-button v-if="$hasPermission('order:priceinfo:save')" type="primary" @click="addOrUpdateHandle()">{{ $t('add') }}</el-button>
        </el-form-item>
        <el-form-item>
          <el-button v-if="$hasPermission('order:priceinfo:delete')" type="danger" @click="deleteHandle()">{{ $t('deleteBatch') }}</el-button>
        </el-form-item>
      </el-form>
      <el-table v-loading="dataListLoading" :data="dataList" border style="width: 100%;" @selection-change="dataListSelectionChangeHandle">
        <el-table-column type="selection" header-align="center" align="center" width="50" />
        <el-table-column type="index" label="序号" header-align="center" align="center" width="50" />
        <el-table-column prop="id" label="id" header-align="center" align="center" />
        <el-table-column prop="createTime" label="createTime" header-align="center" align="center" />
        <el-table-column prop="updateTime" label="updateTime" header-align="center" align="center" />
        <el-table-column prop="createUser" label="createUser" header-align="center" align="center" />
        <el-table-column prop="updateUser" label="updateUser" header-align="center" align="center" />
        <el-table-column prop="code" label="编号" header-align="center" align="center" />
        <el-table-column prop="type" label="类型" header-align="center" align="center" />
        <el-table-column prop="priceCode" label="地区码" header-align="center" align="center" />
        <el-table-column prop="timePrice" label="时间定价" header-align="center" align="center" />
        <el-table-column prop="timeInterval" label="时间计费间隔" header-align="center" align="center" />
        <el-table-column prop="timeUnit" label="时间单位" header-align="center" align="center" />
        <el-table-column prop="waterPrice" label="水定价" header-align="center" align="center" />
        <el-table-column prop="waterInterval" label="水计费间隔" header-align="center" align="center" />
        <el-table-column prop="waterUnit" label="水计费单位" header-align="center" align="center" />
        <el-table-column prop="enabled" label="有效" header-align="center" align="center" />
        <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
          <template slot-scope="scope">
            <el-button v-if="$hasPermission('order:priceinfo:info')" type="text" size="small" @click="viewInfoHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button v-if="$hasPermission('order:priceinfo:update')" type="text" size="small" @click="addOrUpdateHandle(scope.row.id)">{{ $t('update') }}</el-button>
            <el-button v-if="$hasPermission('order:priceinfo:delete')" type="text" size="small" @click="deleteHandle(scope.row.id)">{{ $t('delete') }}</el-button>
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
import AddOrUpdate from './priceinfo-add-or-update'
import viewInfo from './priceinfo-view-info'
export default {
  components: {
    AddOrUpdate, viewInfo
  },
  mixins: [mixinViewModule],
  data() {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/order/priceinfo/page',
        getDataListIsPage: true,
        exportURL: '/order/priceinfo/export',
        deleteURL: '/order/priceinfo',
        deleteIsBatch: true
      },
      dataForm: {
        id: ''
      }
    }
  }
}
</script>
