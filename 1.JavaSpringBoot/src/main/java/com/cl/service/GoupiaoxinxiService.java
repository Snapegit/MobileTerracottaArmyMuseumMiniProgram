package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.GoupiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GoupiaoxinxiView;


/**
 * 购票信息
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
public interface GoupiaoxinxiService extends IService<GoupiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoupiaoxinxiView> selectListView(Wrapper<GoupiaoxinxiEntity> wrapper);
   	
   	GoupiaoxinxiView selectView(@Param("ew") Wrapper<GoupiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoupiaoxinxiEntity> wrapper);
   	

}

