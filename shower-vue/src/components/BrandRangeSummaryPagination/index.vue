<template>
  <div :class="{'hidden':hidden}" class="pagination-container">
    <el-pagination
      :background="background"
      :current-page.sync="currentPage"
      :layout="layout"
      :page-size.sync="pageSize"
      :total="total"
      v-bind="$attrs"
      @current-change="handleCurrentChange"
      @size-change="handleSizeChange"/>
  </div>
</template>

<script>
import { scrollTo } from '@/utils/scrollTo'

export default {
  name: 'BrandRangeSummaryPagination',
  props: {
    total: {
      required: true,
      type: Number
    },
    page: {
      type: Number,
      default: 1
    },
    limit: {
      type: Number,
      default: 20
    },
    pageSizes: {
      type: Array,
      default() {
        return [10, 20, 30, 50]
      }
    },
    layout: {
      type: String,
      default: 'total, sizes, prev, pager, next, jumper'
    },
    background: {
      type: Boolean,
      default: true
    },
    autoScroll: {
      type: Boolean,
      default: true
    },
    hidden: {
      type: Boolean,
      default: false
    },
    startDate: {
      type: String,
      required: true
    },
    endDate: {
      type: String,
      required: true
    },
    detailStartDate: {
      type: String,
      required: true
    },
    detailEndDate: {
      type: String,
      required: true
    },
    sourceBrandId: {
      type: Number,
      required: true
    },
    costBrandId: {
      type: Number,
      required: true
    },
    orderSn: {
      type: String,
      required: true
    }
  },
  computed: {
    currentPage: {
      get() {
        return this.page
      },
      set(val) {
        this.$emit('update:page', val)
      }
    },
    pageSize: {
      get() {
        return this.limit
      },
      set(val) {
        this.$emit('update:limit', val)
      }
    }
  },
  methods: {
    handleSizeChange(val) {
      this.$emit('pagination', {
        page: this.currentPage,
        limit: val,
        startDate: this.startDate,
        endDate: this.endDate,
        sourceBrandId: this.sourceBrandId,
        costBrandId: this.costBrandId,
        orderSn: this.orderSn
      })
      if (this.autoScroll) {
        scrollTo(0, 800)
      }
    },
    handleCurrentChange(val) {
      this.$emit('pagination', {
        page: val,
        limit: this.pageSize,
        startDate: this.startDate,
        endDate: this.endDate,
        sourceBrandId: this.sourceBrandId,
        costBrandId: this.costBrandId,
        orderSn: this.orderSn
      })
      if (this.autoScroll) {
        scrollTo(0, 800)
      }
    }
  }
}
</script>

<style scoped>
  .pagination-container {
    background: #fff;
    padding: 32px 16px;
  }

  .pagination-container.hidden {
    display: none;
  }
</style>
