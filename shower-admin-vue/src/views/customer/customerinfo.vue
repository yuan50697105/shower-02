<template>
  <el-card shadow="never" class="aui-card--fill">
    <div class="mod-customer__customerinfo}">
      <el-form :inline="true" :model="dataForm" @keyup.enter.native="getDataList()">
        <el-form-item>
          <el-input v-model="dataForm.phoneNum" placeholder="电话" clearable />
        </el-form-item>
        <el-form-item>
          <el-button @click="getDataList()">{{ $t('query') }}</el-button>
        </el-form-item>
      </el-form>
      <el-table v-loading="dataListLoading" :data="dataList" border style="width: 100%;" @selection-change="dataListSelectionChangeHandle">
        <el-table-column type="selection" header-align="center" align="center" width="50" />
        <el-table-column type="index" label="序号" header-align="center" align="center" width="50" />
        <el-table-column prop="createDate" label="创建时间" header-align="center" align="center" />
        <el-table-column prop="openId" label="OpenId" header-align="center" align="center" />
        <el-table-column prop="nickName" label="昵称" header-align="center" align="center" />
        <el-table-column prop="gender" label="性别" header-align="center" align="center" />
        <el-table-column prop="phoneNum" label="电话" header-align="center" align="center" />
        <!-- <el-table-column :label="$t('handle')" fixed="right" header-align="center" align="center" width="150">
     <template slot-scope="scope">
     	<el-button type="text" size="small" @click="viewInfoHandle(scope.row.id)">{{ $t('info') }}</el-button>
     </template>
    </el-table-column> -->
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
    </div>
  </el-card>
</template>

<script>
import mixinViewModule from '@/mixins/view-module'
export default {
  components: {
  },
  mixins: [mixinViewModule],
  data() {
    return {
      mixinViewModuleOptions: {
        getDataListURL: '/customer/customerinfo/page',
        getDataListIsPage: true,
        exportURL: '/customer/customerinfo/export',
        deleteURL: '/customer/customerinfo',
        deleteIsBatch: true
      },
      dataForm: {
        phoneNum: ''
      }
    }
  }
}
</script>
