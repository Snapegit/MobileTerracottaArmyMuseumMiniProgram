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


import com.cl.dao.BowufenleiDao;
import com.cl.entity.BowufenleiEntity;
import com.cl.service.BowufenleiService;
import com.cl.entity.view.BowufenleiView;

@Service("bowufenleiService")
public class BowufenleiServiceImpl extends ServiceImpl<BowufenleiDao, BowufenleiEntity> implements BowufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BowufenleiEntity> page = this.selectPage(
                new Query<BowufenleiEntity>(params).getPage(),
                new EntityWrapper<BowufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BowufenleiEntity> wrapper) {
		  Page<BowufenleiView> page =new Query<BowufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<BowufenleiView> selectListView(Wrapper<BowufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BowufenleiView selectView(Wrapper<BowufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
