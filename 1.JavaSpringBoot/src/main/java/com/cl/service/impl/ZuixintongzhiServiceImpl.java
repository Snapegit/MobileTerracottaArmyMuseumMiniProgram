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


import com.cl.dao.ZuixintongzhiDao;
import com.cl.entity.ZuixintongzhiEntity;
import com.cl.service.ZuixintongzhiService;
import com.cl.entity.view.ZuixintongzhiView;

@Service("zuixintongzhiService")
public class ZuixintongzhiServiceImpl extends ServiceImpl<ZuixintongzhiDao, ZuixintongzhiEntity> implements ZuixintongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuixintongzhiEntity> page = this.selectPage(
                new Query<ZuixintongzhiEntity>(params).getPage(),
                new EntityWrapper<ZuixintongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuixintongzhiEntity> wrapper) {
		  Page<ZuixintongzhiView> page =new Query<ZuixintongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZuixintongzhiView> selectListView(Wrapper<ZuixintongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuixintongzhiView selectView(Wrapper<ZuixintongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
