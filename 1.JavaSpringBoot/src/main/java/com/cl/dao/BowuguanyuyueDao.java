package com.cl.dao;

import com.cl.entity.BowuguanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BowuguanyuyueView;


/**
 * 博物馆预约
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
public interface BowuguanyuyueDao extends BaseMapper<BowuguanyuyueEntity> {
	
	List<BowuguanyuyueView> selectListView(@Param("ew") Wrapper<BowuguanyuyueEntity> wrapper);

	List<BowuguanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<BowuguanyuyueEntity> wrapper);
	
	BowuguanyuyueView selectView(@Param("ew") Wrapper<BowuguanyuyueEntity> wrapper);
	

}
