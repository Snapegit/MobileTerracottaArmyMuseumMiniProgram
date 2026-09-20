<template>
	<div class="home_view">
		<div class="projectTitle">欢迎使用 {{projectName}}</div>
		<div class="count_list">
			<el-collapse-transition v-if="btnAuth('orders','首页总数')">
				<el-card v-show="countTypeList.closeordersCountType" class="card_view">
					<template #header>
						<div class="index_card_head">
							<div class="card_head_title">
								商品订单
							</div>
							<div class="card_head_right">
								<el-icon @click="countTypeClick('hiddenordersCountType')" class="showIcons"
									:class="countTypeList.hiddenordersCountType?'showIcons1':''">
									<ArrowUpBold />
								</el-icon>
								<el-icon @click="countTypeClick('closeordersCountType')" class="closeIcons">
									<CloseBold />
								</el-icon>
							</div>
							
						</div>
					</template>
					<el-collapse-transition>
						<div class="count_item" v-show="countTypeList.hiddenordersCountType">
							<div class="count_title">商品订单总数</div>
							<div class="count_num">{{ordersCount}}</div>
						</div>
					</el-collapse-transition>
				</el-card>
			</el-collapse-transition>
			<el-collapse-transition v-if="btnAuth('qinyongkeng','首页总数')">
				<el-card v-show="countTypeList.closeqinyongkengCountType" class="card_view">
					<template #header>
						<div class="index_card_head">
							<div class="card_head_title">
								秦俑坑
							</div>
							<div class="card_head_right">
								<el-icon @click="countTypeClick('hiddenqinyongkengCountType')" class="showIcons"
									:class="countTypeList.hiddenqinyongkengCountType?'showIcons1':''">
									<ArrowUpBold />
								</el-icon>
								<el-icon @click="countTypeClick('closeqinyongkengCountType')" class="closeIcons">
									<CloseBold />
								</el-icon>
							</div>
							
						</div>
					</template>
					<el-collapse-transition>
						<div class="count_item" v-show="countTypeList.hiddenqinyongkengCountType">
							<div class="count_title">秦俑坑总数</div>
							<div class="count_num">{{qinyongkengCount}}</div>
						</div>
					</el-collapse-transition>
				</el-card>
			</el-collapse-transition>
			<el-collapse-transition v-if="btnAuth('zangpin','首页总数')">
				<el-card v-show="countTypeList.closezangpinCountType" class="card_view">
					<template #header>
						<div class="index_card_head">
							<div class="card_head_title">
								臧品
							</div>
							<div class="card_head_right">
								<el-icon @click="countTypeClick('hiddenzangpinCountType')" class="showIcons"
									:class="countTypeList.hiddenzangpinCountType?'showIcons1':''">
									<ArrowUpBold />
								</el-icon>
								<el-icon @click="countTypeClick('closezangpinCountType')" class="closeIcons">
									<CloseBold />
								</el-icon>
							</div>
							
						</div>
					</template>
					<el-collapse-transition>
						<div class="count_item" v-show="countTypeList.hiddenzangpinCountType">
							<div class="count_title">臧品总数</div>
							<div class="count_num">{{zangpinCount}}</div>
						</div>
					</el-collapse-transition>
				</el-card>
			</el-collapse-transition>
		</div>
		<div class="card_list">
			<el-collapse-transition v-if="btnAuth('orders','首页统计')">
				<el-card v-show="cardTypeList.closeordersChartType1" class="card_view">
					<template #header>
						<div class="index_card_head">
							<div class="card_head_title">
								商品订单
							</div>
							<div class="card_head_right">
								<el-icon @click="cardTypeClick('hiddenordersChartType1')" class="showIcons"
									:class="cardTypeList.hiddenordersChartType1?'showIcons1':''">
									<ArrowUpBold />
								</el-icon>
								<el-icon @click="cardTypeClick('closeordersChartType1')" class="closeIcons">
									<CloseBold />
								</el-icon>
							</div>
						</div>
					</template>
					<el-collapse-transition>
						<div class="card_item" v-show="cardTypeList.hiddenordersChartType1">
							<div id="ordersbuynumberEchart1" style="width: 100%;height: 400px;"></div>
						</div>
					</el-collapse-transition>
				</el-card>
			</el-collapse-transition>
			<el-collapse-transition v-if="btnAuth('qinyongkeng','首页统计')">
				<el-card v-show="cardTypeList.closeqinyongkengChartType1" class="card_view">
					<template #header>
						<div class="index_card_head">
							<div class="card_head_title">
								秦俑坑
							</div>
							<div class="card_head_right">
								<el-icon @click="cardTypeClick('hiddenqinyongkengChartType1')" class="showIcons"
									:class="cardTypeList.hiddenqinyongkengChartType1?'showIcons1':''">
									<ArrowUpBold />
								</el-icon>
								<el-icon @click="cardTypeClick('closeqinyongkengChartType1')" class="closeIcons">
									<CloseBold />
								</el-icon>
							</div>
						</div>
					</template>
					<el-collapse-transition>
						<div class="card_item" v-show="cardTypeList.hiddenqinyongkengChartType1">
							<div id="qinyongkengwenwushuliangEchart1" style="width: 100%;height: 400px;"></div>
						</div>
					</el-collapse-transition>
				</el-card>
			</el-collapse-transition>
			<el-collapse-transition v-if="btnAuth('zangpin','首页统计')">
				<el-card v-show="cardTypeList.closezangpinChartType1" class="card_view">
					<template #header>
						<div class="index_card_head">
							<div class="card_head_title">
								臧品
							</div>
							<div class="card_head_right">
								<el-icon @click="cardTypeClick('hiddenzangpinChartType1')" class="showIcons"
									:class="cardTypeList.hiddenzangpinChartType1?'showIcons1':''">
									<ArrowUpBold />
								</el-icon>
								<el-icon @click="cardTypeClick('closezangpinChartType1')" class="closeIcons">
									<CloseBold />
								</el-icon>
							</div>
						</div>
					</template>
					<el-collapse-transition>
						<div class="card_item" v-show="cardTypeList.hiddenzangpinChartType1">
							<div id="zangpinzangpinmingchengEchart1" style="width: 100%;height: 400px;"></div>
						</div>
					</el-collapse-transition>
				</el-card>
			</el-collapse-transition>
		</div>
	</div>
</template>

<script setup>
	import {
		inject,
		nextTick,
		ref,
		getCurrentInstance
	} from 'vue';
	const context = getCurrentInstance()?.appContext.config.globalProperties;
	const projectName = context.$project.projectName
	const countTypeList = ref({
	})
	const getCountList=()=>{
		countTypeList.value.closeordersCountType = true
		countTypeList.value.hiddenordersCountType = true
		if(btnAuth('orders','首页总数')){
			getordersCount()
		}
		countTypeList.value.closeqinyongkengCountType = true
		countTypeList.value.hiddenqinyongkengCountType = true
		if(btnAuth('qinyongkeng','首页总数')){
			getqinyongkengCount()
		}
		countTypeList.value.closezangpinCountType = true
		countTypeList.value.hiddenzangpinCountType = true
		if(btnAuth('zangpin','首页总数')){
			getzangpinCount()
		}
	}
	const ordersCount = ref(0)
	const getordersCount = () => {
		context?.$http({
			url:'orders/count',
			method: 'get'
		}).then(res=>{
			ordersCount.value = res.data.data
		})
	}
	const qinyongkengCount = ref(0)
	const getqinyongkengCount = () => {
		context?.$http({
			url:'qinyongkeng/count',
			method: 'get'
		}).then(res=>{
			qinyongkengCount.value = res.data.data
		})
	}
	const zangpinCount = ref(0)
	const getzangpinCount = () => {
		context?.$http({
			url:'zangpin/count',
			method: 'get'
		}).then(res=>{
			zangpinCount.value = res.data.data
		})
	}
	const countTypeClick = (e) => {
		countTypeList.value[e] = !countTypeList.value[e]
	}
	const init=()=>{
		getCountList()
		getCardList()
	}
	//权限验证
	const btnAuth = (e,a)=>{
		return context?.$toolUtil.isAuth(e,a)
	}
	let echarts = inject("echarts")
	const cardTypeClick = (e) =>{
		cardTypeList.value[e] = !cardTypeList.value[e]
		setTimeout(()=>{
			getCardList()
		},1000)
	}
	const cardTypeList = ref({
		closeordersChartType1: true,
		hiddenordersChartType1: true,
		closeqinyongkengChartType1: true,
		hiddenqinyongkengChartType1: true,
		closezangpinChartType1: true,
		hiddenzangpinChartType1: true,
	})
	const getCardList = () => {
		if(btnAuth('orders','首页统计')){
			getordersChart1()
		}
		if(btnAuth('qinyongkeng','首页统计')){
			getqinyongkengChart1()
		}
		if(btnAuth('zangpin','首页统计')){
			getzangpinChart1()
		}
	}
	const getordersChart1 = () => {
		nextTick(()=>{
			var buynumberEchart1 = echarts.init(document.getElementById("ordersbuynumberEchart1"),'macarons');
			context?.$http({
				url: `orders/value/goodname/buynumber`,
				method: "get",
			}).then(obj=>{
				let res = obj.data.data
				let xAxis = [];
				let yAxis = [];
				let pArray = []
				for(let i=0;i<res.length;i++){
				    xAxis.push(res[i].goodname);
				    yAxis.push(parseFloat((res[i].total)));
				    pArray.push({
				        value: parseFloat((res[i].total)),
				        name: res[i].goodname
				    })
				}
				var option = {};
                option = {
                    title: {
                        text: '订单数量统计',
                        left: 'center'
                    },
                    tooltip: {
                      trigger: 'item',
                      formatter: '{b} : {c}'
                    },
                    xAxis: {
                        type: 'category',
                        data: xAxis,
                        axisLabel: {
                            rotate: 40
                        }
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: yAxis,
                        type: 'bar'
                    }]
                };
				buynumberEchart1.clear()
				// 使用刚指定的配置项和数据显示图表。
				buynumberEchart1.setOption(option);
				//根据窗口的大小变动图表
				buynumberEchart1.resize();
			})
		})
	}
	const getqinyongkengChart1 = () => {
		nextTick(()=>{
			var wenwushuliangEchart1 = echarts.init(document.getElementById("qinyongkengwenwushuliangEchart1"),'macarons');
			context?.$http({
				url: `qinyongkeng/value/bowuguanmingcheng/wenwushuliang`,
				method: "get",
			}).then(obj=>{
				let res = obj.data.data
				let xAxis = [];
				let yAxis = [];
				let pArray = []
				for(let i=0;i<res.length;i++){
				    xAxis.push(res[i].bowuguanmingcheng);
				    yAxis.push(parseFloat((res[i].total)));
				    pArray.push({
				        value: parseFloat((res[i].total)),
				        name: res[i].bowuguanmingcheng
				    })
				}
				var option = {};
                option = {
                    title: {
                        text: '文物数量统计',
                        left: 'center'
                    },
                    tooltip: {
                      trigger: 'item',
                      formatter: '{b} : {c}'
                    },
                    xAxis: {
                        type: 'category',
                        data: xAxis,
                        axisLabel: {
                            rotate: 40
                        }
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: yAxis,
                        type: 'bar'
                    }]
                };
				wenwushuliangEchart1.clear()
				// 使用刚指定的配置项和数据显示图表。
				wenwushuliangEchart1.setOption(option);
				//根据窗口的大小变动图表
				wenwushuliangEchart1.resize();
			})
		})
	}
	const getzangpinChart1 = () => {
		nextTick(()=>{
			var zangpinmingchengEchart1 = echarts.init(document.getElementById("zangpinzangpinmingchengEchart1"),'macarons');
			context?.$http({
				url: "zangpin/group/zangpinmingcheng",
				method: "get",
			}).then(obj=>{
				let res = obj.data.data
				let xAxis = [];
				let yAxis = [];
				let pArray = []
				for(let i=0;i<res.length;i++){
				    xAxis.push(res[i].zangpinmingcheng);
				    yAxis.push(parseFloat((res[i].total)));
				    pArray.push({
				        value: parseFloat((res[i].total)),
				        name: res[i].zangpinmingcheng
				    })
				}
				var option = {};
                option = {
                    title: {
                        text: '臧品统计',
                        left: 'center'
                    },
                    tooltip: {
                      trigger: 'item',
                      formatter: '{b} : {c}'
                    },
                    xAxis: {
                        type: 'category',
                        data: xAxis,
                        axisLabel: {
                            rotate: 40
                        }
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: yAxis,
                        type: 'bar'
                    }]
                };
				zangpinmingchengEchart1.clear()
				// 使用刚指定的配置项和数据显示图表。
				zangpinmingchengEchart1.setOption(option);
				//根据窗口的大小变动图表
				zangpinmingchengEchart1.resize();
			})
		})
	}
	init()
</script>
<style lang="scss">
	.projectTitle{
		padding: 20px 0;
		font-weight: bold;
		display: flex;
		width: 100%;
		font-size: 30px;
		justify-content: center;
		align-items: center;
		height: 50%;
	}

	.showIcons {
		transition: transform 0.3s;
		margin-right: 10px;
	}

	.showIcons1 {
		transform: rotate(-180deg);
	}
	
	// 总数盒子
	.count_list{
		padding: 0 0 20px;
		display: flex;
		width: 100%;
		justify-content: center;
		align-items: flex-start;
		flex-wrap: wrap;
		// 总数card
		.card_view {
			border: 0px solid #e4e7ed;
			border-radius: 10px;
			box-shadow: none;
			margin: 0 10px 10px;
			flex: 1;
			background: linear-gradient(90deg, #E3EDF9 0%, #D9E6F7 100%);
			width: 100%;
			position: relative;
			box-sizing: border-box;
			height: auto;
			// card头部
			.el-card__header {
				border: 1px solid #e4e7ed;
				padding: 7px 20px;
				left: 0;
				background: #62B8FF;
				bottom: 0;
				width: 100%;
				border-width: 0;
				position: absolute;
				// 头部盒子
				.index_card_head {
					display: flex;
					width: 100%;
					justify-content: space-between;
					align-items: center;
					// 标题
					.card_head_title {
						color: #868686;
						font-weight: bold;
						font-size: 14px;
					}
					// 按钮盒子
					.card_head_right {
						display: flex;
						align-items: center;
						// 按钮
						.el-icon {
							cursor: pointer;
							color: #868686;
							font-weight: bold;
							font-size: 12px;
						}
					}
				}
			}
			// body
			.el-card__body {
				padding: 0;
				// body盒子
				.count_item{
					padding: 30px 20px 60px;
					flex-direction: column-reverse;
					display: flex;
					// 总数标题
					.count_title{
						color: #3753A2;
						font-weight: bold;
						font-size: 16px;
						line-height: 1;
						order: 1;
					}
					// 总数数字
					.count_num{
						color: #3753A2;
						font-weight: bold;
						font-size: 50px;
						line-height: 1.5;
						order: 2;
					}
				}
			}
		}
	}
	// 首页盒子
	.home_view {
		padding: 20px;
		background: url(http://clfile.zggen.cn/20240203/09a98f4852104a599055d47953ef0a23.png) no-repeat center top / 100% 100% !important;
		width: 100%;
		min-height: 100vh;
		height: auto;
	}
	// 统计图盒子
	.card_list {
		padding: 0 0 20px;
		display: flex;
		width: 100%;
		justify-content: center;
		align-items: flex-start;
		flex-wrap: wrap;
		// 统计图card
		.card_view {
			border: 0px solid #e4e7ed;
			border-radius: 10px;
			box-shadow: none;
			margin: 0 10px 10px;
			flex: 1;
			background: linear-gradient(90deg, #E3EDF9 0%, #D9E6F7 100%);
			width: 100%;
			position: relative;
			box-sizing: border-box;
			height: auto;
			// 头部
			.el-card__header {
				border: 0px solid #e4e7ed;
				padding: 7px 20px;
				left: 0;
				bottom: 0;
				background: #62B8FF;
				width: 100%;
				border-width: 0;
				position: absolute;
				// 头部盒子
				.index_card_head {
					display: flex;
					width: 100%;
					justify-content: space-between;
					align-items: center;
					// 标题
					.card_head_title {
						color: #868686;
						font-weight: bold;
						font-size: 14px;
					}
					// 按钮盒子
					.card_head_right {
						display: flex;
						align-items: center;
						// 按钮
						.el-icon{
							cursor: pointer;
							color: #868686;
							font-weight: bold;
							font-size: 12px;
						}
					}
				}
			}
			// body
			.el-card__body {
				padding: 0;
				// body盒子
				.card_item{
					padding: 30px;
					text-align: center;
				}
			}
		}
	}
</style>
