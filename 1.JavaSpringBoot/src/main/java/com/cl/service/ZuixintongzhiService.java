package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZuixintongzhiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZuixintongzhiView;


/**
 * 最新通知
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface ZuixintongzhiService extends IService<ZuixintongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuixintongzhiView> selectListView(Wrapper<ZuixintongzhiEntity> wrapper);
   	
   	ZuixintongzhiView selectView(@Param("ew") Wrapper<ZuixintongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuixintongzhiEntity> wrapper);
   	

}

