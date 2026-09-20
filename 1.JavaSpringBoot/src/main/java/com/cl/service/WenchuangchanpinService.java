package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.WenchuangchanpinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WenchuangchanpinView;


/**
 * 文创产品
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
public interface WenchuangchanpinService extends IService<WenchuangchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenchuangchanpinView> selectListView(Wrapper<WenchuangchanpinEntity> wrapper);
   	
   	WenchuangchanpinView selectView(@Param("ew") Wrapper<WenchuangchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenchuangchanpinEntity> wrapper);
   	

}

