package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZixunfuwuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZixunfuwuView;


/**
 * 资讯服务
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface ZixunfuwuService extends IService<ZixunfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunfuwuView> selectListView(Wrapper<ZixunfuwuEntity> wrapper);
   	
   	ZixunfuwuView selectView(@Param("ew") Wrapper<ZixunfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunfuwuEntity> wrapper);
   	

}

