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


import com.cl.dao.QinyongkengDao;
import com.cl.entity.QinyongkengEntity;
import com.cl.service.QinyongkengService;
import com.cl.entity.view.QinyongkengView;

@Service("qinyongkengService")
public class QinyongkengServiceImpl extends ServiceImpl<QinyongkengDao, QinyongkengEntity> implements QinyongkengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QinyongkengEntity> page = this.selectPage(
                new Query<QinyongkengEntity>(params).getPage(),
                new EntityWrapper<QinyongkengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QinyongkengEntity> wrapper) {
		  Page<QinyongkengView> page =new Query<QinyongkengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<QinyongkengView> selectListView(Wrapper<QinyongkengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QinyongkengView selectView(Wrapper<QinyongkengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<QinyongkengEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<QinyongkengEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<QinyongkengEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
