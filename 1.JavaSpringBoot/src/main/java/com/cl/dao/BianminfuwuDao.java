package com.cl.dao;

import com.cl.entity.BianminfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BianminfuwuView;


/**
 * 便民服务
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface BianminfuwuDao extends BaseMapper<BianminfuwuEntity> {
	
	List<BianminfuwuView> selectListView(@Param("ew") Wrapper<BianminfuwuEntity> wrapper);

	List<BianminfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<BianminfuwuEntity> wrapper);
	
	BianminfuwuView selectView(@Param("ew") Wrapper<BianminfuwuEntity> wrapper);
	

}
