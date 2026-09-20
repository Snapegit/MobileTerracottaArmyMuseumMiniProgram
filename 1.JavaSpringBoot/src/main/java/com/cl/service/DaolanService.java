package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DaolanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DaolanView;


/**
 * 导览
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface DaolanService extends IService<DaolanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaolanView> selectListView(Wrapper<DaolanEntity> wrapper);
   	
   	DaolanView selectView(@Param("ew") Wrapper<DaolanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaolanEntity> wrapper);
   	

}

