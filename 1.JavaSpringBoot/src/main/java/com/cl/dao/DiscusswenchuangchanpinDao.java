package com.cl.dao;

import com.cl.entity.DiscusswenchuangchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusswenchuangchanpinView;


/**
 * 文创产品评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface DiscusswenchuangchanpinDao extends BaseMapper<DiscusswenchuangchanpinEntity> {
	
	List<DiscusswenchuangchanpinView> selectListView(@Param("ew") Wrapper<DiscusswenchuangchanpinEntity> wrapper);

	List<DiscusswenchuangchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswenchuangchanpinEntity> wrapper);
	
	DiscusswenchuangchanpinView selectView(@Param("ew") Wrapper<DiscusswenchuangchanpinEntity> wrapper);
	

}
