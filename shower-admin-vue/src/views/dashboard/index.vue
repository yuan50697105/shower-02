<template>
  <el-container style="height: 100%; border: 1px solid #eee;">
    <el-header style="width: 100%;height: 250px;">
      <div style="width: 100%;height: 250px;">
        <div class="block provider" @click="toProvider()">
          <span class="provider_text">设备数量</span>
          <span class="num">{{ info.deviceNum }}</span>
        </div>
        <div class="block service_people" @click="toServicePeople()">
          <span class="provider_text">用户数量</span>
          <span class="num">{{ info.peopleNum }}</span>
        </div>
        <div class="block health_people" @click="toHealthPeople()">
          <span class="provider_text">楼宇位置</span>
          <span class="num">{{ info.buildingNum }}</span>
        </div>
        <div class="block order" @click="toOrder()">
          <span class="provider_text">订单信息</span>
          <span class="num">{{ info.orderNum }}</span>
        </div>
      </div>
    </el-header>
    <el-main>
      <div class="eCharts">
        <div class="myChart">
          <div id="myChart" />
        </div>
        <div class="myChart">
          <div id="myChart2" />
        </div>
      </div>
    </el-main>
  </el-container>
</template>
<script>
import { getInfo, monthOrderData, deviceOrderData } from '@/api/dashboard'
export default {
  name: '',
  components: {
  },
  data() {
    return {
      info: {}
    }
  },
  mounted() {
    this.getInfo()
    this.drawLine()
    this.drawLine2()
  },
  created() {

  },
  methods: {
    getInfo() {
      getInfo().then(response => {
        if (response.code === 0) {
          this.info = response.data
        }
      })
    },
    drawLine() {
      const x_data = []
      const y_data = []
      const y_ratio_data = []
      let sum = 0
      monthOrderData().then(response => {
        if (response.code === 0) {
          const list = response.data
          for (let index = 0; index < list.length; index++) {
            const element = list[index]
            x_data.push(element.mon)
            y_data.push(element.num)
            sum += Number(element.num)
          }
          for (let index = 0; index < list.length; index++) {
            const element = list[index]
            y_ratio_data.push(Math.ceil((element.num / sum) * 100))
          }
          // 基于准备好的dom，初始化echarts实例
          const myChart = this.$echarts.init(document.getElementById('myChart'))
          // 绘制图表
          var option = {
            title: {
              text: '2020月订单统计'
            },
            tooltip: {
              trigger: 'axis',
              axisPointer: {
                type: 'cross',
                crossStyle: {
                  color: '#999'
                }
              }
            },
            toolbox: {
              feature: {
                dataView: { show: true, readOnly: false },
                magicType: { show: true, type: ['line', 'bar'] },
                restore: { show: true },
                saveAsImage: { show: true }
              }
            },
            legend: {
              data: ['订单数量', '订单比例']
            },
            xAxis: [
              {
                type: 'category',
                data: x_data,
                axisPointer: {
                  type: 'shadow'
                }
              }
            ],
            yAxis: [
              {
                type: 'value',
                name: '数量',
                min: 0,
                axisLabel: {
                  formatter: '{value} 个'
                }
              },
              {
                type: 'value',
                name: '比例',
                min: 0,
                max: 100,
                axisLabel: {
                  formatter: '{value} %'
                }
              }
            ],
            series: [
              {
                name: '订单数量',
                type: 'bar',
                data: y_data,
                itemStyle: {
                  normal: {
                    color: '#04b6e4'
                  }
                }
              },
              {
                name: '订单比例',
                type: 'line',
                yAxisIndex: 1,
                data: y_ratio_data,
                itemStyle: {
                  normal: {
                    color: '#e86368'
                  }
                }
              }
            ]
          }

          myChart.setOption(option)
        }
      })
    },
    drawLine2() {
      const x_data = []
      const y_data = []
      const y_ratio_data = []
      let sum = 0
      deviceOrderData().then(response => {
        if (response.code === 0) {
          const list = response.data
          for (let index = 0; index < list.length; index++) {
            const element = list[index]
            x_data.push(element.name)
            y_data.push(element.num)
            sum += Number(element.num)
          }
          for (let index = 0; index < list.length; index++) {
            const element = list[index]
            y_ratio_data.push(Math.ceil((element.num / sum) * 100))
          }
          // 基于准备好的dom，初始化echarts实例
          const myChart = this.$echarts.init(document.getElementById('myChart2'))
          // 绘制图表
          var option = {
            title: {
              text: '设备服务订单比例'
            },
            tooltip: {
              trigger: 'axis',
              axisPointer: {
                type: 'cross',
                crossStyle: {
                  color: '#999'
                }
              }
            },
            toolbox: {
              feature: {
                dataView: { show: true, readOnly: false },
                magicType: { show: true, type: ['line', 'bar'] },
                restore: { show: true },
                saveAsImage: { show: true }
              }
            },
            legend: {
              data: ['订单数量', '订单比例']
            },
            xAxis: [
              {
                type: 'category',
                data: x_data,
                axisPointer: {
                  type: 'shadow'
                }
              }
            ],
            yAxis: [
              {
                type: 'value',
                name: '数量',
                min: 0,
                axisLabel: {
                  formatter: '{value} 个'
                }
              },
              {
                type: 'value',
                name: '比例',
                min: 0,
                max: 100,
                axisLabel: {
                  formatter: '{value} %'
                }
              }
            ],
            series: [
              {
                name: '订单数量',
                type: 'bar',
                data: y_data,
                itemStyle: {
                  normal: {
                    color: '#04b6e4'
                  }
                }
              },
              {
                name: '订单比例',
                type: 'line',
                yAxisIndex: 1,
                data: y_ratio_data,
                itemStyle: {
                  normal: {
                    color: '#e86368'
                  }
                }
              }
            ]
          }

          myChart.setOption(option)
        }
      })
    }
    // 点击服务商块
    // toProvider() {
    //   this.$router.push({
    //     name: 'provider-serviceprovider'
    //   })
    // },
    // // 点击服务人员块
    // toServicePeople() {
    //   this.$router.push({
    //     name: 'subsidyRules-servicepeople'
    //   })
    // },
    // // 点击客户档案块
    // toHealthPeople() {
    //   this.$router.push({
    //     name: 'healthPeople-healthpeoplecore'
    //   })
    // },
    // // 点击订单块
    // toOrder() {
    //   this.$router.push({
    //     name: 'order-order'
    //   })
    // }
  }

}
</script>
<style>
  .el-container.is-vertical{
    background-color: #fff;
  }
  .block{
    width: 20%;
    height: 80%;
    float: left;
    margin-left: 4%;
    margin-top: 2%;
    border-radius: 45px;
  }
  .block:hover{
    cursor:pointer
  }
  .provider_text{
    color: #fff;
    position: relative;
    left: 50%;
    top: 5vh;
    font-size: 1.7vw;
  }
  .num{
    color: #fff;
    position: relative;
    left: 27%;
    top: 13vh;
    font-size: 1.4vw;
  }
  .provider{
    background-image:url('../../assets/img/device.png')
  }
  .service_people{
    background-image:url('../../assets/img/service.png')
  }
  .health_people{
    background-image:url('../../assets/img/people.png')
  }
  .order{
    background-image:url('../../assets/img/order.png')
  }
  .eCharts{
    margin-top: 25px;
  }
  .myChart{
   width: 45%;
   float: left;
   margin-left: 3.3%;
  }
  #myChart{
    height: 500px;
    width: 100%;

  }
  #myChart2{
    height: 500px;
    width: 100%;
  }
</style>
