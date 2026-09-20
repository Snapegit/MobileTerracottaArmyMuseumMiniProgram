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


import com.cl.dao.ZhanlanDao;
import com.cl.entity.ZhanlanEntity;
import com.cl.service.ZhanlanService;
import com.cl.entity.view.ZhanlanView;

@Service("zhanlanService")
public class ZhanlanServiceImpl extends ServiceImpl<ZhanlanDao, ZhanlanEntity> implements ZhanlanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhanlanEntity> page = this.selectPage(
                new Query<ZhanlanEntity>(params).getPage(),
                new EntityWrapper<ZhanlanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhanlanEntity> wrapper) {
		  Page<ZhanlanView> page =new Query<ZhanlanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZhanlanView> selectListView(Wrapper<ZhanlanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhanlanView selectView(Wrapper<ZhanlanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
