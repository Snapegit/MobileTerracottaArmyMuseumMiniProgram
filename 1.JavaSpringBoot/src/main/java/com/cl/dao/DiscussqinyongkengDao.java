package com.cl.dao;

import com.cl.entity.DiscussqinyongkengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussqinyongkengView;


/**
 * 秦俑坑评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface DiscussqinyongkengDao extends BaseMapper<DiscussqinyongkengEntity> {
	
	List<DiscussqinyongkengView> selectListView(@Param("ew") Wrapper<DiscussqinyongkengEntity> wrapper);

	List<DiscussqinyongkengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqinyongkengEntity> wrapper);
	
	DiscussqinyongkengView selectView(@Param("ew") Wrapper<DiscussqinyongkengEntity> wrapper);
	

}
