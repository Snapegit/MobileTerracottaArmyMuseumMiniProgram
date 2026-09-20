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


import com.cl.dao.BianminfuwuDao;
import com.cl.entity.BianminfuwuEntity;
import com.cl.service.BianminfuwuService;
import com.cl.entity.view.BianminfuwuView;

@Service("bianminfuwuService")
public class BianminfuwuServiceImpl extends ServiceImpl<BianminfuwuDao, BianminfuwuEntity> implements BianminfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BianminfuwuEntity> page = this.selectPage(
                new Query<BianminfuwuEntity>(params).getPage(),
                new EntityWrapper<BianminfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BianminfuwuEntity> wrapper) {
		  Page<BianminfuwuView> page =new Query<BianminfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<BianminfuwuView> selectListView(Wrapper<BianminfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BianminfuwuView selectView(Wrapper<BianminfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
