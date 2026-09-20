package com.cl.entity.view;

import com.cl.entity.BowufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 博物分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@TableName("bowufenlei")
public class BowufenleiView  extends BowufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BowufenleiView(){
	}
 
 	public BowufenleiView(BowufenleiEntity bowufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, bowufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
