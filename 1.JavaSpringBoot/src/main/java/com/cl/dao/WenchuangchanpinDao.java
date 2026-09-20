package com.cl.dao;

import com.cl.entity.WenchuangchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WenchuangchanpinView;


/**
 * 文创产品
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
public interface WenchuangchanpinDao extends BaseMapper<WenchuangchanpinEntity> {
	
	List<WenchuangchanpinView> selectListView(@Param("ew") Wrapper<WenchuangchanpinEntity> wrapper);

	List<WenchuangchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<WenchuangchanpinEntity> wrapper);
	
	WenchuangchanpinView selectView(@Param("ew") Wrapper<WenchuangchanpinEntity> wrapper);
	

}
