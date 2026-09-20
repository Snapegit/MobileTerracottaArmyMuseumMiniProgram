package com.cl.dao;

import com.cl.entity.QinyongkengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QinyongkengView;


/**
 * 秦俑坑
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
public interface QinyongkengDao extends BaseMapper<QinyongkengEntity> {
	
	List<QinyongkengView> selectListView(@Param("ew") Wrapper<QinyongkengEntity> wrapper);

	List<QinyongkengView> selectListView(Pagination page,@Param("ew") Wrapper<QinyongkengEntity> wrapper);
	
	QinyongkengView selectView(@Param("ew") Wrapper<QinyongkengEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QinyongkengEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QinyongkengEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QinyongkengEntity> wrapper);



}
