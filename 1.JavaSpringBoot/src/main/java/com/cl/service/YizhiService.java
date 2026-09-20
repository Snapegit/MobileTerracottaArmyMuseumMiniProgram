package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YizhiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YizhiView;


/**
 * 遗址
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface YizhiService extends IService<YizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YizhiView> selectListView(Wrapper<YizhiEntity> wrapper);
   	
   	YizhiView selectView(@Param("ew") Wrapper<YizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YizhiEntity> wrapper);
   	

}

