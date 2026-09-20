package com.cl.dao;

import com.cl.entity.YizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YizhiView;


/**
 * 遗址
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface YizhiDao extends BaseMapper<YizhiEntity> {
	
	List<YizhiView> selectListView(@Param("ew") Wrapper<YizhiEntity> wrapper);

	List<YizhiView> selectListView(Pagination page,@Param("ew") Wrapper<YizhiEntity> wrapper);
	
	YizhiView selectView(@Param("ew") Wrapper<YizhiEntity> wrapper);
	

}
