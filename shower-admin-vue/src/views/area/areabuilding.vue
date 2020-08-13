<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-order__areabuilding}">
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
        <el-table-column prop="name" label="楼宇名称" header-align="center" align="center" />
        <el-table-column prop="code" label="楼宇编号" header-align="center" align="center" />
        <el-table-column prop="areaId" label="所属区域ID" header-align="center" align="center" />
        <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
          <template slot-scope="scope">
            <el-button type="text" size="small" @click="viewInfoHandle(scope.row.id)">{{ $t('update') }}</el-button>
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
import AddOrUpdate from './areabuilding-add-or-update'
import viewInfo from './areabuilding-view-info'
export default {
  components: {
    AddOrUpdate, viewInfo
  },
  mixins: [mixinViewModule],
  data() {
    return {
      mixinViewModuleOptions: {
        getDataListURL: 'area/areabuilding/page',
        getDataListIsPage: true,
        exportURL: '/area/areabuilding/export',
        deleteURL: '/area/areabuilding',
        deleteIsBatch: true
      },
      dataForm: {
        id: ''
      }
    }
  }
}
</script>
