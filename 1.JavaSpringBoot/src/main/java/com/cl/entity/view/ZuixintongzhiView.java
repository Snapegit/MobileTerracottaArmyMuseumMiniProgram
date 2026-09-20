package com.cl.entity.view;

import com.cl.entity.ZuixintongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 最新通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@TableName("zuixintongzhi")
public class ZuixintongzhiView  extends ZuixintongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuixintongzhiView(){
	}
 
 	public ZuixintongzhiView(ZuixintongzhiEntity zuixintongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, zuixintongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
