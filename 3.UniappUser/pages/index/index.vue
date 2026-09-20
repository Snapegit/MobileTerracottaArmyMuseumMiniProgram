<template>
<view class="content">
	<view :style='{"width":"100%","flexWrap":"wrap","background":"#ff993310","display":"flex","height":"auto"}'>
		<swiper :style='{"width":"100%","margin":"0 0 20rpx 0","background":"#ffffff","height":"360rpx"}' class="swiper" :indicator-dots='true' :autoplay='true' :circular='true' indicator-active-color='#ff9933' indicator-color='#33333330' :duration='500' :interval='5000' :vertical='false'>
			<swiper-item :style='{"width":"100%","background":"#ffffff","height":"100%"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"100%"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"width":"100%","padding":"0 8rpx 0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333333","background":"#ffffff"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>


		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"0px 0px 0px 40rpx","margin":"40rpx 0px 20rpx 0px","borderColor":"#eee","borderRadius":"8rpx","flexWrap":"wrap","background":"none","borderWidth":"0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
            <block v-for="(item,ind) in menuList" v-bind:key="item.roleName">
                <block v-if="ind==0" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
					<view v-if="menu.childs.length" :style='{"padding":"12rpx 0 12rpx 0","margin":"0px 40rpx 20rpx 0","borderColor":"#ff993360","borderRadius":"0px","borderWidth":"0 0 8rpx","width":"calc(25% - 40rpx)","borderStyle":"double","height":"auto"}' class="menu-list" @tap="menuClick(menu,index)">
						<view class="iconarr" :class="menu.fontClass" :style='{"border":"4rpx solid #ff9933","padding":"0 0 0 0","boxShadow":"6rpx 8rpx 8rpx #dddddd","margin":"0 auto 12rpx auto","color":"#ff9933","textAlign":"center","display":"block","borderRadius":"8rpx","background":"#fff","width":"128rpx","lineHeight":"96rpx","fontSize":"60rpx","height":"96rpx"}'></view>
						<view :style='{"padding":"0 0 0 0","margin":"0px auto 0 auto","color":"#333333","textAlign":"center","width":"100%","lineHeight":"2","fontSize":"26rpx"}'>{{menu.menu}}</view>
					</view>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		

		<!-- 商品推荐 -->
		<view class="listBox recommend" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"none","order":"10"}'>
			<view v-if="false && 3 == 1" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"32rpx 0","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"8rpx 60rpx 8rpx 60rpx","color":"#fff","borderRadius":"8rpx","textAlign":"center","background":"none","display":"inline-block","width":"auto","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>展览推荐</view>
			</view>
			
			<view v-if="false && 3 == 2" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			
			
			
			  
			
			
			<!-- 样式7 -->
			<view class="list-box style7" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
				<view class="list-item" :style='{"padding":"0 0 0 0","margin":"0 0 20rpx 0","alignItems":"center","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
					<view v-if="zhanlanlist.length > 0" @tap="onDetailTap('zhanlan',zhanlanlist[0].id)" class="box box1" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
						<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"hidden"}' class="title ">展品名称:{{zhanlanlist[0].zhanpinmingcheng}}</view>
						<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"560rpx"}' class="list-item-image" mode="aspectFill" v-if="zhanlanlist[0].zhanpintupian.substring(0,4)=='http'" :src="zhanlanlist[0].zhanpintupian"></image>
						<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"560rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zhanlanlist[0].zhanpintupian?baseUrl+zhanlanlist[0].zhanpintupian.split(',')[0]:''"></image>
					</view>
					<view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
						<view v-if="zhanlanlist.length > 1" @tap="onDetailTap('zhanlan',zhanlanlist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">展品名称:{{zhanlanlist[1].zhanpinmingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-if="zhanlanlist[1].zhanpintupian.substring(0,4)=='http'" :src="zhanlanlist[1].zhanpintupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zhanlanlist[1].zhanpintupian?baseUrl+zhanlanlist[1].zhanpintupian.split(',')[0]:''"></image>
						</view>
						<view v-if="zhanlanlist.length > 2" @tap="onDetailTap('zhanlan',zhanlanlist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">展品名称:{{zhanlanlist[2].zhanpinmingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-if="zhanlanlist[2].zhanpintupian.substring(0,4)=='http'" :src="zhanlanlist[2].zhanpintupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zhanlanlist[2].zhanpintupian?baseUrl+zhanlanlist[2].zhanpintupian.split(',')[0]:''"></image>
						</view>
					</view>
				</view>
				<view class="list-item" :style='{"padding":"0 0 0 0","margin":"0 0 0 0","alignItems":"center","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
					<view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
						<view v-if="zhanlanlist.length > 3" @tap="onDetailTap('zhanlan',zhanlanlist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">展品名称:{{zhanlanlist[3].zhanpinmingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-if="zhanlanlist[3].zhanpintupian.substring(0,4)=='http'" :src="zhanlanlist[3].zhanpintupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zhanlanlist[3].zhanpintupian?baseUrl+zhanlanlist[3].zhanpintupian.split(',')[0]:''"></image>
						</view>
						<view v-if="zhanlanlist.length > 4" @tap="onDetailTap('zhanlan',zhanlanlist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">展品名称:{{zhanlanlist[4].zhanpinmingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-if="zhanlanlist[4].zhanpintupian.substring(0,4)=='http'" :src="zhanlanlist[4].zhanpintupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zhanlanlist[4].zhanpintupian?baseUrl+zhanlanlist[4].zhanpintupian.split(',')[0]:''"></image>
						</view>
					</view>
					<view v-if="zhanlanlist.length > 5" @tap="onDetailTap('zhanlan',zhanlanlist[5].id)" class="box box6" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
						<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">展品名称:{{zhanlanlist[5].zhanpinmingcheng}}</view>
						<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"560rpx"}' class="list-item-image" mode="aspectFill" v-if="zhanlanlist[5].zhanpintupian.substring(0,4)=='http'" :src="zhanlanlist[5].zhanpintupian"></image>
						<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"560rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zhanlanlist[5].zhanpintupian?baseUrl+zhanlanlist[5].zhanpintupian.split(',')[0]:''"></image>
					</view>
				</view>
			</view>
			  
			
			  
			<view v-if="false && 3 == 3" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
		<view class="listBox recommend" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"none","order":"10"}'>
			<view v-if="false && 3 == 1" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"32rpx 0","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"8rpx 60rpx 8rpx 60rpx","color":"#fff","borderRadius":"8rpx","textAlign":"center","background":"none","display":"inline-block","width":"auto","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>臧品推荐</view>
			</view>
			
			<view v-if="false && 3 == 2" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			
			
			
			  
			
			
			<!-- 样式7 -->
			<view class="list-box style7" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
				<view class="list-item" :style='{"padding":"0 0 0 0","margin":"0 0 20rpx 0","alignItems":"center","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
					<view v-if="zangpinlist.length > 0" @tap="onDetailTap('zangpin',zangpinlist[0].id)" class="box box1" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
						<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"hidden"}' class="title ">臧品名称:{{zangpinlist[0].zangpinmingcheng}}</view>
						<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"hidden"}' class="title ">时代:{{zangpinlist[0].shidai}}</view>
						<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"560rpx"}' class="list-item-image" mode="aspectFill" v-if="zangpinlist[0].tupian.substring(0,4)=='http'" :src="zangpinlist[0].tupian"></image>
						<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"560rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zangpinlist[0].tupian?baseUrl+zangpinlist[0].tupian.split(',')[0]:''"></image>
					</view>
					<view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
						<view v-if="zangpinlist.length > 1" @tap="onDetailTap('zangpin',zangpinlist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">臧品名称:{{zangpinlist[1].zangpinmingcheng}}</view>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">时代:{{zangpinlist[1].shidai}}</view>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-if="zangpinlist[1].tupian.substring(0,4)=='http'" :src="zangpinlist[1].tupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zangpinlist[1].tupian?baseUrl+zangpinlist[1].tupian.split(',')[0]:''"></image>
						</view>
						<view v-if="zangpinlist.length > 2" @tap="onDetailTap('zangpin',zangpinlist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">臧品名称:{{zangpinlist[2].zangpinmingcheng}}</view>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">时代:{{zangpinlist[2].shidai}}</view>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-if="zangpinlist[2].tupian.substring(0,4)=='http'" :src="zangpinlist[2].tupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zangpinlist[2].tupian?baseUrl+zangpinlist[2].tupian.split(',')[0]:''"></image>
						</view>
					</view>
				</view>
				<view class="list-item" :style='{"padding":"0 0 0 0","margin":"0 0 0 0","alignItems":"center","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
					<view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
						<view v-if="zangpinlist.length > 3" @tap="onDetailTap('zangpin',zangpinlist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">臧品名称:{{zangpinlist[3].zangpinmingcheng}}</view>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">时代:{{zangpinlist[3].shidai}}</view>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-if="zangpinlist[3].tupian.substring(0,4)=='http'" :src="zangpinlist[3].tupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zangpinlist[3].tupian?baseUrl+zangpinlist[3].tupian.split(',')[0]:''"></image>
						</view>
						<view v-if="zangpinlist.length > 4" @tap="onDetailTap('zangpin',zangpinlist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">臧品名称:{{zangpinlist[4].zangpinmingcheng}}</view>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">时代:{{zangpinlist[4].shidai}}</view>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-if="zangpinlist[4].tupian.substring(0,4)=='http'" :src="zangpinlist[4].tupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zangpinlist[4].tupian?baseUrl+zangpinlist[4].tupian.split(',')[0]:''"></image>
						</view>
					</view>
					<view v-if="zangpinlist.length > 5" @tap="onDetailTap('zangpin',zangpinlist[5].id)" class="box box6" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
						<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">臧品名称:{{zangpinlist[5].zangpinmingcheng}}</view>
						<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">时代:{{zangpinlist[5].shidai}}</view>
						<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"560rpx"}' class="list-item-image" mode="aspectFill" v-if="zangpinlist[5].tupian.substring(0,4)=='http'" :src="zangpinlist[5].tupian"></image>
						<image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"560rpx"}' class="list-item-image" mode="aspectFill" v-else :src="zangpinlist[5].tupian?baseUrl+zangpinlist[5].tupian.split(',')[0]:''"></image>
					</view>
				</view>
			</view>
			  
			
			  
			<view v-if="false && 3 == 3" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
		<!-- 商品推荐 -->
		
		

		<!-- 商品列表 -->
																																						<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"none","order":"4"}'>
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"32rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"12rpx 60rpx 8rpx 120rpx","color":"#fff","borderRadius":"8rpx","background":"none","display":"inline-block","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>秦俑坑</view>
				<text :style='{"margin":"10rpx 0 0 0","color":"#fcfcfc","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"48rpx","float":"right"}' @tap="onPageTap('qinyongkeng')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  <!-- 样式6 -->
		  <view class="list-box style6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
			<view v-if="homeqinyongkenglist.length > 0" @tap="onDetailTap('qinyongkeng',homeqinyongkenglist[0].id)" class="box box1" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">博物馆名称:{{homeqinyongkenglist[0].bowuguanmingcheng}}</view>
			  			  			                			  			                			  			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">地理位置:{{homeqinyongkenglist[0].diliweizhi}}</view>
			  			  			                			  			                			  			                			  			                			  			                			  			  			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeqinyongkenglist[0].tupian.substring(0,4)=='http'" :src="homeqinyongkenglist[0].tupian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeqinyongkenglist[0].tupian?baseUrl+homeqinyongkenglist[0].tupian.split(',')[0]:''"></image>
			                			  			                			  			</view>
			<view class="list-item" :style='{"width":"100%","margin":"0 0 20rpx 0","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homeqinyongkenglist.length > 1" @tap="onDetailTap('qinyongkeng',homeqinyongkenglist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">博物馆名称:{{homeqinyongkenglist[1].bowuguanmingcheng}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">地理位置:{{homeqinyongkenglist[1].diliweizhi}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				                    				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeqinyongkenglist[1].tupian.substring(0,4)=='http'" :src="homeqinyongkenglist[1].tupian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeqinyongkenglist[1].tupian?baseUrl+homeqinyongkenglist[1].tupian.split(',')[0]:''"></image>
				                    				  				                    				  				</view>
				<view v-if="homeqinyongkenglist.length > 2" @tap="onDetailTap('qinyongkeng',homeqinyongkenglist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">博物馆名称:{{homeqinyongkenglist[2].bowuguanmingcheng}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">地理位置:{{homeqinyongkenglist[2].diliweizhi}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				                    				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homeqinyongkenglist[2].tupian.substring(0,4)=='http'" :src="homeqinyongkenglist[2].tupian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeqinyongkenglist[2].tupian?baseUrl+homeqinyongkenglist[2].tupian.split(',')[0]:''"></image>
				                    				  				                    				  				</view>
			  </view>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homeqinyongkenglist.length > 3" @tap="onDetailTap('qinyongkeng',homeqinyongkenglist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">博物馆名称:{{homeqinyongkenglist[3].bowuguanmingcheng}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">地理位置:{{homeqinyongkenglist[3].diliweizhi}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				                    				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homeqinyongkenglist[3].tupian.substring(0,4)=='http'" :src="homeqinyongkenglist[3].tupian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeqinyongkenglist[3].tupian?baseUrl+homeqinyongkenglist[3].tupian.split(',')[0]:''"></image>
				                    				  				                    				  				</view>
				<view v-if="homeqinyongkenglist.length > 4" @tap="onDetailTap('qinyongkeng',homeqinyongkenglist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">博物馆名称:{{homeqinyongkenglist[4].bowuguanmingcheng}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">地理位置:{{homeqinyongkenglist[4].diliweizhi}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				                    				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeqinyongkenglist[4].tupian.substring(0,4)=='http'" :src="homeqinyongkenglist[4].tupian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeqinyongkenglist[4].tupian?baseUrl+homeqinyongkenglist[4].tupian.split(',')[0]:''"></image>
				                    				  				                    				  				</view>
			  </view>
			</view>
			<view v-if="homeqinyongkenglist.length > 5" @tap="onDetailTap('qinyongkeng',homeqinyongkenglist[5].id)" class="box box6" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","display":"none","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">博物馆名称:{{homeqinyongkenglist[5].bowuguanmingcheng}}</view>
			  			  			                			  			                			  			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">地理位置:{{homeqinyongkenglist[5].diliweizhi}}</view>
			  			  			                			  			                			  			                			  			                			  			                			  			  			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeqinyongkenglist[5].tupian.substring(0,4)=='http'" :src="homeqinyongkenglist[5].tupian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeqinyongkenglist[5].tupian?baseUrl+homeqinyongkenglist[5].tupian.split(',')[0]:''"></image>
			                			  			                			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																																																																		<!-- 商品列表 -->
		
		
		<!-- 新闻资讯 -->
																																																																																																				<!-- 新闻资讯 -->
				

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
                role : '',
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				zhanlanlist: [],
				zangpinlist: [],
				homeqinyongkenglist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            
        },
		async onShow() {
			this.swiperMenuList = []
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
			let role = '管理员'
			this.menuList.forEach((item,key) => {
			    if(role==item.roleName) {
			        item.frontMenu.forEach((item2,key2) => {
						if(item2.child.length) {
							item2.childs = []
						    item2.child.forEach((item3,key3)=>{
								if(item3.buttons.indexOf("查看")>-1){
									item2.childs.push(item3)
									this.swiperMenuList.push(item3);
								}
							})
						}
			            
			        })
			    }
			})
            // let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.list('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}

			// 推荐信息
			res = await this.$api.recommend('zhanlan', {                                              
                page: 1,
                limit: 4
            });
			this.zhanlanlist = res.data.list
			// 推荐信息
			res = await this.$api.recommend('zangpin', {                                              
                page: 1,
                limit: 4
            });
			this.zangpinlist = res.data.list

			res = await this.$api.list('qinyongkeng', {
				page: 1,

				limit: 6
			});
			this.homeqinyongkenglist = res.data.list
		},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){
				if(tableName=='news'){
					uni.navigateTo({
						url: `../news-list/news-list`,
						fail: function(){
							uni.switchTab({
								url: `../news-list/news-list`
							});
						}
					});
					return false
				}

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
			menuClick(menu, index) {
				if (menu.childs.length > 0 && menu.childs.length == 1) {
					uni.navigateTo({
						url: `../${menu.childs[0].tableName}/list`,
						fail: function() {
							uni.switchTab({
								url: `../${menu.childs[0].tableName}/list`
							});
						}
					});
				} else if (menu.childs.length > 1) {
					let arr = []
					for(let x in menu.childs){
						arr.push(menu.childs[x].menu.length>6?menu.childs[x].menu.substring(0,6):menu.childs[x].menu)
					}
					uni.showActionSheet({
						itemList: arr,
						success: function (res) {
							uni.navigateTo({
								url: `../${menu.childs[res.tapIndex].tableName}/list`,
								fail: function() {
									uni.switchTab({
										url: `../${menu.childs[res.tapIndex].tableName}/list`
									});
								}
							});
						}
					});
				}
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
