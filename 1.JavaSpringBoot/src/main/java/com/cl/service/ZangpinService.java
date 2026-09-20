package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZangpinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZangpinView;


/**
 * 臧品
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface ZangpinService extends IService<ZangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZangpinView> selectListView(Wrapper<ZangpinEntity> wrapper);
   	
   	ZangpinView selectView(@Param("ew") Wrapper<ZangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZangpinEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZangpinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZangpinEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZangpinEntity> wrapper);



}

