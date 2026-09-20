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


import com.cl.dao.DiscusswenchuangchanpinDao;
import com.cl.entity.DiscusswenchuangchanpinEntity;
import com.cl.service.DiscusswenchuangchanpinService;
import com.cl.entity.view.DiscusswenchuangchanpinView;

@Service("discusswenchuangchanpinService")
public class DiscusswenchuangchanpinServiceImpl extends ServiceImpl<DiscusswenchuangchanpinDao, DiscusswenchuangchanpinEntity> implements DiscusswenchuangchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswenchuangchanpinEntity> page = this.selectPage(
                new Query<DiscusswenchuangchanpinEntity>(params).getPage(),
                new EntityWrapper<DiscusswenchuangchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswenchuangchanpinEntity> wrapper) {
		  Page<DiscusswenchuangchanpinView> page =new Query<DiscusswenchuangchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusswenchuangchanpinView> selectListView(Wrapper<DiscusswenchuangchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswenchuangchanpinView selectView(Wrapper<DiscusswenchuangchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
