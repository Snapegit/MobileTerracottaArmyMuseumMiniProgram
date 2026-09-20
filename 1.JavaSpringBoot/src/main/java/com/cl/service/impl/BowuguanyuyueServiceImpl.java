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


import com.cl.dao.BowuguanyuyueDao;
import com.cl.entity.BowuguanyuyueEntity;
import com.cl.service.BowuguanyuyueService;
import com.cl.entity.view.BowuguanyuyueView;

@Service("bowuguanyuyueService")
public class BowuguanyuyueServiceImpl extends ServiceImpl<BowuguanyuyueDao, BowuguanyuyueEntity> implements BowuguanyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BowuguanyuyueEntity> page = this.selectPage(
                new Query<BowuguanyuyueEntity>(params).getPage(),
                new EntityWrapper<BowuguanyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BowuguanyuyueEntity> wrapper) {
		  Page<BowuguanyuyueView> page =new Query<BowuguanyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<BowuguanyuyueView> selectListView(Wrapper<BowuguanyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BowuguanyuyueView selectView(Wrapper<BowuguanyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
