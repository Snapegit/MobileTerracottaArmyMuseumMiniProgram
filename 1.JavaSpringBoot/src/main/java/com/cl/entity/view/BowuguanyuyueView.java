package com.cl.entity.view;

import com.cl.entity.BowuguanyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 博物馆预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
@TableName("bowuguanyuyue")
public class BowuguanyuyueView  extends BowuguanyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BowuguanyuyueView(){
	}
 
 	public BowuguanyuyueView(BowuguanyuyueEntity bowuguanyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, bowuguanyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
