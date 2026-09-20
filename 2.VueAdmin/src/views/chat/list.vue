<template>
	<div>
		<div class="chat-contain">
			<el-table v-loading="listLoading" :data="list" border
				:stripe='true'>
				<el-table-column prop="ask" :resizable='true' :sortable='true' align="left" header-align="center" label="新消息">
					<template #default="scope">
						{{scope.row.ask}}
					</template>
				</el-table-column>
				<el-table-column prop="ask" :resizable='true' :sortable='true' align="left" header-align="center" label="状态">
					<template #default="scope">
						<el-tag v-if="scope.row.isreply==1" type="success">未回复</el-tag>
						<el-tag v-if="scope.row.isreply==0" type="info">已回复</el-tag>
					</template>
				</el-table-column>
				<el-table-column prop="ask" :resizable='true' :sortable='true' align="left" header-align="center" label="操作">
					<template #default="scope">
						<el-button type="primary" @click="replyClick(scope.row)">回复</el-button>
					</template>
				</el-table-column>
			</el-table>
			<el-pagination
				background
				:layout="layouts.join(',')"
				:total="total" 
				:page-size="listQuery.limit"
				prev-text="<"
				next-text=">"
				:hide-on-single-page="true"
				:style='{"padding":"0","margin":"20px 0 0","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","fontWeight":"500"}'
				@size-change="sizeChange"
				@current-change="currentChange" 
				@prev-click="prevClick"
				@next-click="nextClick"  />
			<el-dialog v-model="formVisible" :title="'客服回复'" width="70%" destroy-on-close @close="delTimer">
				<el-form ref="formRef" :model="form" class="chat_view">
					<div class="chat-content">
						<div :key="item.id" v-for="item in chatList">
							<div class="chat_time" v-if="item.showTime">{{item.addtime}}</div>
							<div v-if="item.ask" class="left-content">
								<el-alert v-if="!item.img" class="text-content" :title="item.ask" :closable="false"
									type="success"></el-alert>
								<el-image v-if="item.img" :src="$config.url + item.img"
									class="chat_img" fit="scale-down"
									:preview-src-list="[$config.url + item.img]"></el-image>
							</div>
							<div v-else class="right-content">
								<el-alert v-if="!item.img" class="text-content" :title="item.reply" :closable="false"
									type="warning"></el-alert>
								<el-image v-if="item.img" :src="$config.url + item.img"
									class="chat_img" fit="scale-down"
									:preview-src-list="[$config.url + item.img]"></el-image>
							</div>
							<div class="clear-float"></div>
						</div>
					</div>
					<div class="input_box">
						<el-input class="input" v-model="form.reply" placeholder="请回复" type="textarea" />
						<img src="http://chy2.gdnxeco.com/20230912/f60a0c39a6d34289b50c151949711b67.png" class="inp_add"
							@click="askType=!askType" alt="">
					</div>
					<div class="upload_box" v-if="askType">
						<el-upload class="upload-demo" :action="action" :on-success="uploadSuccess"
							:show-file-list="false">
							<el-button type="primary">上传图片</el-button>
						</el-upload>
					</div>
					<div class="save_box">
						<el-button type="primary" @click="replySave">发送</el-button>
					</div>
				</el-form>
			</el-dialog>
		</div>
	</div>
</template>

<script setup>
	import {
		reactive,
		ref,
		getCurrentInstance,
		nextTick,
		onMounted,
	} from 'vue'
	const context = getCurrentInstance()?.appContext.config.globalProperties;
	const list = ref([])
	const listQuery = ref({
		page: 1,
		limit: 20,
		sort: 'id',
		order: 'desc',
		isreply: 1
	})
	const listLoading = ref(false)
	//获取列表
	const getList = () => {
		let params = listQuery.value
		listLoading.value = true
		context?.$http({
			url: 'chat/page',
			method: 'get',
			params: params
		}).then(res => {
			listLoading.value = false
			list.value = res.data.data.list
			total.value = Number(res.data.data.total)
		})
	}
	//分页
	const total = ref(0)
	const layouts = ref(["total","prev","pager","next","jumper"])
	const sizeChange = (size) => {
		listQuery.value.limit = size
		getList()
	}
	const currentChange = (page) => {
		listQuery.value.page = page
		getList()
	}
	const prevClick = () => {
		listQuery.value.page = listQuery.value.page - 1
		getList()
	}
	const nextClick = () => {
		listQuery.value.page = listQuery.value.page + 1
		getList()
	}
	//分页
	//form
	const formVisible = ref(false)
	const nowId = ref(0)
	const form = ref({
		reply: ''
	})
	//对话列表
	const chatList = ref([])
	//回复按钮
	const replyClick = (row) => {
		nowId.value = row.userid
		getChatList()
		formVisible.value = true
		timer.value = setInterval(() => {
			getChatList()
		}, 3000)
	}
	//定时器
	const timer = ref(null)
	const delTimer = () => {
		clearInterval(timer.value)
	}
	const getChatList = () => {
		context?.$http({
			url: 'chat/page',
			method: 'get',
			params: {
				limit: 1000,
				sort: 'addtime',
				order: 'asc',
				userid: nowId.value
			}
		}).then(res => {
			for (let x in res.data.data.list) {
				if (res.data.data.list[x].ask) {
					if (res.data.data.list[x].ask.split('/').length > 1) {
						if (res.data.data.list[x].ask.split('/')[0] == 'file') {
							res.data.data.list[x].img = res.data.data.list[x].ask
						}
					}
				}
				if (res.data.data.list[x].reply) {
					if (res.data.data.list[x].reply.split('/').length > 1) {
						if (res.data.data.list[x].reply.split('/')[0] == 'file') {
							res.data.data.list[x].img = res.data.data.list[x].reply
						}
					}
				}
				if(x==0){
					res.data.data.list[x].showTime = 1
				}else{
					let jian = new Date(res.data.data.list[x].addtime).getTime() - new Date(res.data.data.list[x-1].addtime).getTime()
					if(jian>18000){
						res.data.data.list[x].showTime = 1
					}else{
						res.data.data.list[x].showTime = 0
					}
				}
			}
			chatList.value = res.data.data.list
			nextTick(() => {
				let div = document.getElementsByClassName('chat-content')[0]
				setTimeout(() => {
					if (div)
						div.scrollTop = div.scrollHeight
				}, 100)
			})
		})
	}
	//发送信息
	const replySave = () => {
		form.value.userid = nowId.value
		if (form.value.reply) {
			context?.$http({
				url: 'chat/save',
				method: 'post',
				data: form.value
			}).then(res => {
				context?.$toolUtil.message('发送成功', 'success', () => {
					getChatList()
					form.value.reply = ''

				})
			})
		}
	}
	//图片
	const action = ref(`${context?.$config.name}/file/upload`)
	const askType = ref(false)
	const uploadSuccess = (e) => {

		let params = {
			reply: 'file/' + e.file,
			userid: nowId.value
		}
		context?.$http({
			url: 'chat/save',
			method: 'post',
			data: params
		}).then(res => {
			context?.$toolUtil.message('发送成功', 'success', () => {
				getChatList()
				form.value.reply = ''

			})
		})
	}
	const init = () => {
		getList()
	}
	init()
</script>

<style lang="scss" scoped>

	// 表格样式
	.el-table {
		border-radius: 10px;
		padding: 0;
		width: 100%;
		border-color: #eee;
		border-width: 0;
		border-style: solid;
		:deep(.el-table__header-wrapper) {
			thead {
				color: rgba(98, 184, 255, 1);
				background: #fff;
				font-weight: 500;
				width: 100%;
				tr {
					background: #fff;
					th {
						padding: 12px 0;
						border-color: #eee;
						border-width: 0;
						border-style: solid;
						text-align: left;
						.cell {
							padding: 0 10px;
							word-wrap: normal;
							word-break: break-all;
							white-space: normal;
							font-weight: bold;
							display: inline-block;
							vertical-align: middle;
							width: 100%;
							line-height: 24px;
							position: relative;
							text-overflow: ellipsis;
						}
					}
				}
			}
		}
		:deep(.el-table__body-wrapper) {
			tbody {
				width: 100%;
				tr {
					background: #fff;
					td {
						padding: 12px 0;
						color: #999;
						background: #fff;
						border-color: #eee;
						border-width: 0;
						border-style: solid;
						text-align: left;
						.cell {
							padding: 6px 10px;
							overflow: hidden;
							word-break: break-all;
							white-space: normal;
							line-height: 24px;
							text-overflow: ellipsis;
							// 回复
							.el-button--primary {
								border: none;
								border-radius: 4px;
								padding: 0 24px;
								box-shadow: inset 0px 4px 10px 0px rgba(147,147,147,0.302);
								outline: 4px solid #EAF5FF;
								margin: 8px;
								color: #2c2c2c;
								background: #96C6EE;
								width: auto;
								font-size: 14px;
								height: 30px;
							}
							// 回复-悬浮
							.el-button--primary:hover {
								background: rgba(150, 198, 238, 0.5);
							}
						}
					}
				}
				tr.el-table__row--striped {
					td {
						background: rgba(239, 241, 243, 1) !important;
					}
				}
				tr:hover {
					td {
						padding: 12px 0;
						color: #fff;
						background: rgba(98, 184, 255, 1);
						border-color: #eee;
						border-width: 0;
						border-style: solid;
						text-align: left;
					}
				}
			}
		}
	}
	// 分页器
	.el-pagination {
		// 总页码
		:deep(.el-pagination__total) {
			margin: 0 10px 0 0;
			color: #666;
			font-weight: 400;
			display: inline-block;
			vertical-align: top;
			font-size: 13px;
			line-height: 28px;
			height: 28px;
		}
		// 上一页
		:deep(.btn-prev) {
			border: none;
			border-radius: 2px;
			padding: 0;
			margin: 0 5px;
			color: #666;
			background: #f4f4f5;
			display: inline-block;
			vertical-align: top;
			font-size: 13px;
			line-height: 28px;
			min-width: 35px;
			height: 28px;
		}
		// 下一页
		:deep(.btn-next) {
			border: none;
			border-radius: 2px;
			padding: 0;
			margin: 0 5px;
			color: #666;
			background: #f4f4f5;
			display: inline-block;
			vertical-align: top;
			font-size: 13px;
			line-height: 28px;
			min-width: 35px;
			height: 28px;
		}
		// 上一页禁用
		:deep(.btn-prev:disabled) {
			border: none;
			cursor: not-allowed;
			border-radius: 2px;
			padding: 0;
			margin: 0 5px;
			color: #C0C4CC;
			background: #f4f4f5;
			display: inline-block;
			vertical-align: top;
			font-size: 13px;
			line-height: 28px;
			height: 28px;
		}
		// 下一页禁用
		:deep(.btn-next:disabled) {
			border: none;
			cursor: not-allowed;
			border-radius: 2px;
			padding: 0;
			margin: 0 5px;
			color: #C0C4CC;
			background: #f4f4f5;
			display: inline-block;
			vertical-align: top;
			font-size: 13px;
			line-height: 28px;
			height: 28px;
		}
		// 页码
		:deep(.el-pager) {
			padding: 0;
			margin: 0;
			display: inline-block;
			vertical-align: top;
			// 数字
			.number {
				cursor: pointer;
				padding: 0 4px;
				margin: 0 5px;
				color: #666;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				border-radius: 2px;
				background: #f4f4f5;
				text-align: center;
				min-width: 30px;
				height: 28px;
			}
			// 数字悬浮
			.number:hover {
				cursor: pointer;
				padding: 0 4px;
				margin: 0 5px;
				color: #fff;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				border-radius: 2px;
				background: linear-gradient(133deg, #9CC8EB 0%, #61B7FE 100%);
				text-align: center;
				min-width: 30px;
				height: 28px;
			}
			// 选中
			.number.active {
				cursor: default;
				padding: 0 4px;
				margin: 0 5px;
				color: #FFF;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				border-radius: 2px;
				background: linear-gradient(133deg, #9CC8EB 0%, #61B7FE 100%);
				text-align: center;
				min-width: 30px;
				height: 28px;
			}
		}
		// sizes
		:deep(.el-pagination__sizes) {
			display: inline-block;
			vertical-align: top;
			font-size: 13px;
			line-height: 28px;
			height: 28px;
			.el-select {
				border: 1px solid #DCDFE6;
				cursor: pointer;
				padding: 0;
				color: #606266;
				display: inline-block;
				font-size: 13px;
				line-height: 28px;
				border-radius: 3px;
				outline: 0;
				background: #FFF;
				width: 100%;
				text-align: center;
				height: 28px;
			}
		}
		// 跳页
		:deep(.el-pagination__jump) {
			margin: 0 0 0 24px;
			color: #606266;
			display: inline-block;
			vertical-align: top;
			font-size: 13px;
			line-height: 28px;
			height: 28px;
			// 输入框
			.el-input {
				border: 1px solid #DCDFE6;
				cursor: pointer;
				padding: 0 3px;
				color: #606266;
				display: inline-block;
				font-size: 14px;
				line-height: 28px;
				border-radius: 3px;
				outline: 0;
				background: #FFF;
				width: 100%;
				text-align: center;
				height: 28px;
				//去掉默认样式
				.el-input__wrapper{
					border: none;
					box-shadow: none;
					background: none;
					border-radius: 0;
					height: 100%;
					padding: 0;
				}
				.is-focus {
					box-shadow: none !important;
				}
			}
		}
	}
	// 聊天总盒子
	.chat_view {
		flex-direction: column;
		display: flex;
		// 聊天内容盒子
		.chat-content {
			border: 2px solid rgba(98, 184, 255, 1);
			border-radius: 20px;
			padding: 0 0 30px;
			max-height: 300px;
			margin: 0 0 30px 0;
			background: rgba(239, 241, 243, 1);
			overflow-y: scroll;
			height: 300px;
			// 聊天时间
			.chat_time{
				padding: 6px 0;
				color: #999;
				width: 100%;
				font-size: 12px;
				text-align: center;
			}
			// 提问盒子
			.left-content {
				padding: 10px;
				margin: 0 0 10px;
				float: left;
				// 文字样式
				:deep(.el-alert--success){
					border: 2px solid rgba(98, 184, 255, 1);
					background-color: rgba(222, 240, 255, 1);
					border-radius: 10px;
					color: #333;
					.el-alert__title {
						font-size: inherit;
					}
				}
				// 聊天图片
				.chat_img {
					margin: 10px;
					width: 100px;
				}
			}
			// 回复盒子
			.right-content {
				padding: 10px;
				margin: 0 0 10px;
				float: right;
				// 文字样式
				:deep(.el-alert--warning){
					border: 2px solid rgba(222, 240, 255, 1);
					background-color: rgba(98, 184, 255, 1);
					border-radius: 10px;
					color: #333;
					.el-alert__title {
						font-size: inherit;
					}
				}
				// 聊天图片
				.chat_img {
					margin: 10px;
					width: 100px;
				}
			}
		}
		// 输入内容盒子
		.input_box{
			display: flex;
			align-items: center;
			// 输入框
			:deep(.el-textarea__inner) {
				border: 2px solid #5FB7FF;
				border-radius: 20px;
				padding: 12px;
				outline: none;
				color: #333;
				background: #fff;
				width: 100%;
				font-size: 14px;
				min-height: 120px;
			}
			// 操作按钮
			.inp_add {
				cursor: pointer;
				margin: 0 0 0 10px;
				width: 50px;
			}
		}
		// 操作盒子
		.upload_box {
			margin: 20px 0 0;
			display: flex;
			width: 100%;
			justify-content: space-around;
			align-items: center;
			:deep(.upload-demo) {
				// 按钮
				.el-button--primary {
					border: 0;
					cursor: pointer;
					border-radius: 20px;
					padding: 0 40px;
					margin: 0 10px 0 0;
					outline: none;
					color: #fff;
					background: linear-gradient(90deg, #FB843D 0%, #9EC8EA 0%, #5DB6FF 100%);
					width: auto;
					font-size: 16px;
					height: 40px;
				}
				// 按钮悬浮
				.el-button--primary:hover {
					background: linear-gradient(270deg, #FB843D 0%, #9EC8EA 0%, #5DB6FF 100%);
				}
			}
		}
		// 发送盒子
		.save_box {
			margin: 10px 0 0;
			display: flex;
			width: 100%;
			justify-content: flex-end;
			// 按钮
			:deep(.el-button--primary) {
				border: 0;
				cursor: pointer;
				border-radius: 20px;
				padding: 0 40px;
				margin: 0 10px 0 0;
				outline: none;
				color: #fff;
				background: linear-gradient(90deg, #FB843D 0%, #9EC8EA 0%, #5DB6FF 100%);
				width: auto;
				font-size: 16px;
				height: 40px;
			}
			// 按钮悬浮
			:deep(.el-button--primary:hover) {
				background: linear-gradient(270deg, #FB843D 0%, #9EC8EA 0%, #5DB6FF 100%);
			}
		}
		.clear-float {
			clear: both;
		}
	}
</style>