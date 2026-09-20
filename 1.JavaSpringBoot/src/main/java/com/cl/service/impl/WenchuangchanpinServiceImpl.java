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


import com.cl.dao.WenchuangchanpinDao;
import com.cl.entity.WenchuangchanpinEntity;
import com.cl.service.WenchuangchanpinService;
import com.cl.entity.view.WenchuangchanpinView;

@Service("wenchuangchanpinService")
public class WenchuangchanpinServiceImpl extends ServiceImpl<WenchuangchanpinDao, WenchuangchanpinEntity> implements WenchuangchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenchuangchanpinEntity> page = this.selectPage(
                new Query<WenchuangchanpinEntity>(params).getPage(),
                new EntityWrapper<WenchuangchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenchuangchanpinEntity> wrapper) {
		  Page<WenchuangchanpinView> page =new Query<WenchuangchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<WenchuangchanpinView> selectListView(Wrapper<WenchuangchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenchuangchanpinView selectView(Wrapper<WenchuangchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
