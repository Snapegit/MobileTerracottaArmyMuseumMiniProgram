package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.QinyongkengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QinyongkengView;


/**
 * 秦俑坑
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
public interface QinyongkengService extends IService<QinyongkengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QinyongkengView> selectListView(Wrapper<QinyongkengEntity> wrapper);
   	
   	QinyongkengView selectView(@Param("ew") Wrapper<QinyongkengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QinyongkengEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<QinyongkengEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<QinyongkengEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<QinyongkengEntity> wrapper);



}

