	import {
		createRouter,
		createWebHashHistory
	} from 'vue-router'
	import address from '@/views/address/list'
	import zhanlan from '@/views/zhanlan/list'
	import discussqinyongkeng from '@/views/discussqinyongkeng/list'
	import zixunfuwu from '@/views/zixunfuwu/list'
	import bianminfuwu from '@/views/bianminfuwu/list'
	import goupiaoxinxi from '@/views/goupiaoxinxi/list'
	import daolan from '@/views/daolan/list'
	import zangpin from '@/views/zangpin/list'
	import storeup from '@/views/storeup/list'
	import users from '@/views/users/list'
	import cart from '@/views/cart/list'
	import yizhi from '@/views/yizhi/list'
	import wenchuangchanpin from '@/views/wenchuangchanpin/list'
	import zuixintongzhi from '@/views/zuixintongzhi/list'
	import bowufenlei from '@/views/bowufenlei/list'
	import bowuguanyuyue from '@/views/bowuguanyuyue/list'
	import chanpinleixing from '@/views/chanpinleixing/list'
	import yonghu from '@/views/yonghu/list'
	import chat from '@/views/chat/list'
	import qinyongkeng from '@/views/qinyongkeng/list'
	import discusswenchuangchanpin from '@/views/discusswenchuangchanpin/list'
	import orders from '@/views/orders/list'
	import config from '@/views/config/list'

export const routes = [{
		path: '/login',
		name: 'login',
		component: () => import('../views/login.vue')
	},{
		path: '/',
		name: '首页',
		component: () => import('../views/index'),
		children: [{
			path: '/',
			name: '首页Home',
			component: () => import('../views/HomeView.vue'),
			meta: {
				affix: true
			}
		}, {
			path: '/updatepassword',
			name: '修改密码',
			component: () => import('../views/updatepassword.vue')
		}
		
		,{
			path: '/address',
			name: '地址',
			component: address
		}
		,{
			path: '/zhanlan',
			name: '展览',
			component: zhanlan
		}
		,{
			path: '/discussqinyongkeng',
			name: '秦俑坑评论',
			component: discussqinyongkeng
		}
		,{
			path: '/zixunfuwu',
			name: '资讯服务',
			component: zixunfuwu
		}
		,{
			path: '/bianminfuwu',
			name: '便民服务',
			component: bianminfuwu
		}
		,{
			path: '/goupiaoxinxi',
			name: '购票信息',
			component: goupiaoxinxi
		}
		,{
			path: '/daolan',
			name: '导览',
			component: daolan
		}
		,{
			path: '/zangpin',
			name: '臧品',
			component: zangpin
		}
		,{
			path: '/storeup',
			name: '我的收藏',
			component: storeup
		}
		,{
			path: '/users',
			name: '管理员',
			component: users
		}
		,{
			path: '/cart',
			name: '购物车',
			component: cart
		}
		,{
			path: '/yizhi',
			name: '遗址',
			component: yizhi
		}
		,{
			path: '/wenchuangchanpin',
			name: '文创产品',
			component: wenchuangchanpin
		}
		,{
			path: '/zuixintongzhi',
			name: '最新通知',
			component: zuixintongzhi
		}
		,{
			path: '/bowufenlei',
			name: '博物分类',
			component: bowufenlei
		}
		,{
			path: '/bowuguanyuyue',
			name: '博物馆预约',
			component: bowuguanyuyue
		}
		,{
			path: '/chanpinleixing',
			name: '产品类型',
			component: chanpinleixing
		}
		,{
			path: '/yonghu',
			name: '用户',
			component: yonghu
		}
		,{
			path: '/chat',
			name: '客服聊天',
			component: chat
		}
		,{
			path: '/qinyongkeng',
			name: '秦俑坑',
			component: qinyongkeng
		}
		,{
			path: '/discusswenchuangchanpin',
			name: '文创产品评论',
			component: discusswenchuangchanpin
		}
		,{
			path: '/orders',
			name: '订单管理',
			component: orders
		}
		,{
			path: '/config',
			name: '轮播图',
			component: config
		}
		]
	},
]

const router = createRouter({
	history: createWebHashHistory(process.env.BASE_URL),
	routes
})

export default router
