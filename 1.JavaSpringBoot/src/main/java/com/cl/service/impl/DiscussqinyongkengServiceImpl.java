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


import com.cl.dao.DiscussqinyongkengDao;
import com.cl.entity.DiscussqinyongkengEntity;
import com.cl.service.DiscussqinyongkengService;
import com.cl.entity.view.DiscussqinyongkengView;

@Service("discussqinyongkengService")
public class DiscussqinyongkengServiceImpl extends ServiceImpl<DiscussqinyongkengDao, DiscussqinyongkengEntity> implements DiscussqinyongkengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqinyongkengEntity> page = this.selectPage(
                new Query<DiscussqinyongkengEntity>(params).getPage(),
                new EntityWrapper<DiscussqinyongkengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqinyongkengEntity> wrapper) {
		  Page<DiscussqinyongkengView> page =new Query<DiscussqinyongkengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussqinyongkengView> selectListView(Wrapper<DiscussqinyongkengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqinyongkengView selectView(Wrapper<DiscussqinyongkengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
