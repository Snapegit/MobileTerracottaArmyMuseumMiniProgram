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


import com.cl.dao.ZixunfuwuDao;
import com.cl.entity.ZixunfuwuEntity;
import com.cl.service.ZixunfuwuService;
import com.cl.entity.view.ZixunfuwuView;

@Service("zixunfuwuService")
public class ZixunfuwuServiceImpl extends ServiceImpl<ZixunfuwuDao, ZixunfuwuEntity> implements ZixunfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixunfuwuEntity> page = this.selectPage(
                new Query<ZixunfuwuEntity>(params).getPage(),
                new EntityWrapper<ZixunfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixunfuwuEntity> wrapper) {
		  Page<ZixunfuwuView> page =new Query<ZixunfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZixunfuwuView> selectListView(Wrapper<ZixunfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixunfuwuView selectView(Wrapper<ZixunfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
