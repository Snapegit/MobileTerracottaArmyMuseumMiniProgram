package com.cl.dao;

import com.cl.entity.ZuixintongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZuixintongzhiView;


/**
 * 最新通知
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface ZuixintongzhiDao extends BaseMapper<ZuixintongzhiEntity> {
	
	List<ZuixintongzhiView> selectListView(@Param("ew") Wrapper<ZuixintongzhiEntity> wrapper);

	List<ZuixintongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuixintongzhiEntity> wrapper);
	
	ZuixintongzhiView selectView(@Param("ew") Wrapper<ZuixintongzhiEntity> wrapper);
	

}
