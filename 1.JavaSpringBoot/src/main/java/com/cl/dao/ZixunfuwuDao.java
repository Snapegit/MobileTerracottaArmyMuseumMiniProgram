package com.cl.dao;

import com.cl.entity.ZixunfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZixunfuwuView;


/**
 * 资讯服务
 * 
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface ZixunfuwuDao extends BaseMapper<ZixunfuwuEntity> {
	
	List<ZixunfuwuView> selectListView(@Param("ew") Wrapper<ZixunfuwuEntity> wrapper);

	List<ZixunfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<ZixunfuwuEntity> wrapper);
	
	ZixunfuwuView selectView(@Param("ew") Wrapper<ZixunfuwuEntity> wrapper);
	

}
