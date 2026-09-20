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


import com.cl.dao.GoupiaoxinxiDao;
import com.cl.entity.GoupiaoxinxiEntity;
import com.cl.service.GoupiaoxinxiService;
import com.cl.entity.view.GoupiaoxinxiView;

@Service("goupiaoxinxiService")
public class GoupiaoxinxiServiceImpl extends ServiceImpl<GoupiaoxinxiDao, GoupiaoxinxiEntity> implements GoupiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoupiaoxinxiEntity> page = this.selectPage(
                new Query<GoupiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<GoupiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoupiaoxinxiEntity> wrapper) {
		  Page<GoupiaoxinxiView> page =new Query<GoupiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<GoupiaoxinxiView> selectListView(Wrapper<GoupiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoupiaoxinxiView selectView(Wrapper<GoupiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
