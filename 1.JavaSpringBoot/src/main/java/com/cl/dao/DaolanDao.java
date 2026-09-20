package com.cl.dao;

import com.cl.entity.DaolanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DaolanView;


/**
 * 导览
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface DaolanDao extends BaseMapper<DaolanEntity> {
	
	List<DaolanView> selectListView(@Param("ew") Wrapper<DaolanEntity> wrapper);

	List<DaolanView> selectListView(Pagination page,@Param("ew") Wrapper<DaolanEntity> wrapper);
	
	DaolanView selectView(@Param("ew") Wrapper<DaolanEntity> wrapper);
	

}
