package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussqinyongkengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussqinyongkengView;


/**
 * 秦俑坑评论表
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface DiscussqinyongkengService extends IService<DiscussqinyongkengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqinyongkengView> selectListView(Wrapper<DiscussqinyongkengEntity> wrapper);
   	
   	DiscussqinyongkengView selectView(@Param("ew") Wrapper<DiscussqinyongkengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqinyongkengEntity> wrapper);
   	

}

