package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.BowuguanyuyueEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BowuguanyuyueView;


/**
 * 博物馆预约
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
public interface BowuguanyuyueService extends IService<BowuguanyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BowuguanyuyueView> selectListView(Wrapper<BowuguanyuyueEntity> wrapper);
   	
   	BowuguanyuyueView selectView(@Param("ew") Wrapper<BowuguanyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BowuguanyuyueEntity> wrapper);
   	

}

