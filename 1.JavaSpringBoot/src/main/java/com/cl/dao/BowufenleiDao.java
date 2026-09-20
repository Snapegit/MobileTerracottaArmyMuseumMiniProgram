package com.cl.dao;

import com.cl.entity.BowufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BowufenleiView;


/**
 * 博物分类
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface BowufenleiDao extends BaseMapper<BowufenleiEntity> {
	
	List<BowufenleiView> selectListView(@Param("ew") Wrapper<BowufenleiEntity> wrapper);

	List<BowufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<BowufenleiEntity> wrapper);
	
	BowufenleiView selectView(@Param("ew") Wrapper<BowufenleiEntity> wrapper);
	

}
