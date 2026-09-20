package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhanlanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhanlanView;


/**
 * 展览
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
public interface ZhanlanService extends IService<ZhanlanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhanlanView> selectListView(Wrapper<ZhanlanEntity> wrapper);
   	
   	ZhanlanView selectView(@Param("ew") Wrapper<ZhanlanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhanlanEntity> wrapper);
   	

}

