package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.BianminfuwuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BianminfuwuView;


/**
 * 便民服务
 *
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
public interface BianminfuwuService extends IService<BianminfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BianminfuwuView> selectListView(Wrapper<BianminfuwuEntity> wrapper);
   	
   	BianminfuwuView selectView(@Param("ew") Wrapper<BianminfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BianminfuwuEntity> wrapper);
   	

}

