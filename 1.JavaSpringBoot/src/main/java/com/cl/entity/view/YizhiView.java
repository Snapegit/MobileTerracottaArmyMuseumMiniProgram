package com.cl.entity.view;

import com.cl.entity.YizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 遗址
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@TableName("yizhi")
public class YizhiView  extends YizhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YizhiView(){
	}
 
 	public YizhiView(YizhiEntity yizhiEntity){
 	try {
			BeanUtils.copyProperties(this, yizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
