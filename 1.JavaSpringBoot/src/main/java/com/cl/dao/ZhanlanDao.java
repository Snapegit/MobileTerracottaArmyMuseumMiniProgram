package com.cl.dao;

import com.cl.entity.ZhanlanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhanlanView;


/**
 * 展览
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
public interface ZhanlanDao extends BaseMapper<ZhanlanEntity> {
	
	List<ZhanlanView> selectListView(@Param("ew") Wrapper<ZhanlanEntity> wrapper);

	List<ZhanlanView> selectListView(Pagination page,@Param("ew") Wrapper<ZhanlanEntity> wrapper);
	
	ZhanlanView selectView(@Param("ew") Wrapper<ZhanlanEntity> wrapper);
	

}
