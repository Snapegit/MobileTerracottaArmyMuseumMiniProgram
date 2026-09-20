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


import com.cl.dao.DaolanDao;
import com.cl.entity.DaolanEntity;
import com.cl.service.DaolanService;
import com.cl.entity.view.DaolanView;

@Service("daolanService")
public class DaolanServiceImpl extends ServiceImpl<DaolanDao, DaolanEntity> implements DaolanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaolanEntity> page = this.selectPage(
                new Query<DaolanEntity>(params).getPage(),
                new EntityWrapper<DaolanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaolanEntity> wrapper) {
		  Page<DaolanView> page =new Query<DaolanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DaolanView> selectListView(Wrapper<DaolanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaolanView selectView(Wrapper<DaolanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
