package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 展览
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
@TableName("zhanlan")
public class ZhanlanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhanlanEntity() {
		
	}
	
	public ZhanlanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 展品名称
	 */
					
	private String zhanpinmingcheng;
	
	/**
	 * 展品描述
	 */
					
	private String zhanpinmiaoshu;
	
	/**
	 * 展品图片
	 */
					
	private String zhanpintupian;
	
	/**
	 * 相关故事
	 */
					
	private String xiangguangushi;
	
	/**
	 * 参观线路建议
	 */
					
	private String canguanxianlujianyi;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：展品名称
	 */
	public void setZhanpinmingcheng(String zhanpinmingcheng) {
		this.zhanpinmingcheng = zhanpinmingcheng;
	}
	/**
	 * 获取：展品名称
	 */
	public String getZhanpinmingcheng() {
		return zhanpinmingcheng;
	}
	/**
	 * 设置：展品描述
	 */
	public void setZhanpinmiaoshu(String zhanpinmiaoshu) {
		this.zhanpinmiaoshu = zhanpinmiaoshu;
	}
	/**
	 * 获取：展品描述
	 */
	public String getZhanpinmiaoshu() {
		return zhanpinmiaoshu;
	}
	/**
	 * 设置：展品图片
	 */
	public void setZhanpintupian(String zhanpintupian) {
		this.zhanpintupian = zhanpintupian;
	}
	/**
	 * 获取：展品图片
	 */
	public String getZhanpintupian() {
		return zhanpintupian;
	}
	/**
	 * 设置：相关故事
	 */
	public void setXiangguangushi(String xiangguangushi) {
		this.xiangguangushi = xiangguangushi;
	}
	/**
	 * 获取：相关故事
	 */
	public String getXiangguangushi() {
		return xiangguangushi;
	}
	/**
	 * 设置：参观线路建议
	 */
	public void setCanguanxianlujianyi(String canguanxianlujianyi) {
		this.canguanxianlujianyi = canguanxianlujianyi;
	}
	/**
	 * 获取：参观线路建议
	 */
	public String getCanguanxianlujianyi() {
		return canguanxianlujianyi;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}

}
