package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusswenchuangchanpinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusswenchuangchanpinView;


/**
 * 文创产品评论表
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface DiscusswenchuangchanpinService extends IService<DiscusswenchuangchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenchuangchanpinView> selectListView(Wrapper<DiscusswenchuangchanpinEntity> wrapper);
   	
   	DiscusswenchuangchanpinView selectView(@Param("ew") Wrapper<DiscusswenchuangchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenchuangchanpinEntity> wrapper);
   	

}

