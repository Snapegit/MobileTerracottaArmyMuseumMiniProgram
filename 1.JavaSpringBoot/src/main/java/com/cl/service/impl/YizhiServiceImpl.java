package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.YizhiDao;
import com.cl.entity.YizhiEntity;
import com.cl.service.YizhiService;
import com.cl.entity.view.YizhiView;

@Service("yizhiService")
public class YizhiServiceImpl extends ServiceImpl<YizhiDao, YizhiEntity> implements YizhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YizhiEntity> page = this.selectPage(
                new Query<YizhiEntity>(params).getPage(),
                new EntityWrapper<YizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YizhiEntity> wrapper) {
		  Page<YizhiView> page =new Query<YizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YizhiView> selectListView(Wrapper<YizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YizhiView selectView(Wrapper<YizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
