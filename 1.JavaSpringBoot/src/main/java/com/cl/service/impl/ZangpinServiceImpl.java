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


import com.cl.dao.ZangpinDao;
import com.cl.entity.ZangpinEntity;
import com.cl.service.ZangpinService;
import com.cl.entity.view.ZangpinView;

@Service("zangpinService")
public class ZangpinServiceImpl extends ServiceImpl<ZangpinDao, ZangpinEntity> implements ZangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZangpinEntity> page = this.selectPage(
                new Query<ZangpinEntity>(params).getPage(),
                new EntityWrapper<ZangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZangpinEntity> wrapper) {
		  Page<ZangpinView> page =new Query<ZangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZangpinView> selectListView(Wrapper<ZangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZangpinView selectView(Wrapper<ZangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZangpinEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZangpinEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZangpinEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
