package com.cl.dao;

import com.cl.entity.ZangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZangpinView;


/**
 * 臧品
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface ZangpinDao extends BaseMapper<ZangpinEntity> {
	
	List<ZangpinView> selectListView(@Param("ew") Wrapper<ZangpinEntity> wrapper);

	List<ZangpinView> selectListView(Pagination page,@Param("ew") Wrapper<ZangpinEntity> wrapper);
	
	ZangpinView selectView(@Param("ew") Wrapper<ZangpinEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZangpinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZangpinEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZangpinEntity> wrapper);



}
