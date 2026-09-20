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
 * 臧品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@TableName("zangpin")
public class ZangpinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZangpinEntity() {
		
	}
	
	public ZangpinEntity(T t) {
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
	 * 臧品名称
	 */
					
	private String zangpinmingcheng;
	
	/**
	 * 时代
	 */
					
	private String shidai;
	
	/**
	 * 尺寸
	 */
					
	private String chicun;
	
	/**
	 * 地质
	 */
					
	private String dizhi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
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
	 * 设置：臧品名称
	 */
	public void setZangpinmingcheng(String zangpinmingcheng) {
		this.zangpinmingcheng = zangpinmingcheng;
	}
	/**
	 * 获取：臧品名称
	 */
	public String getZangpinmingcheng() {
		return zangpinmingcheng;
	}
	/**
	 * 设置：时代
	 */
	public void setShidai(String shidai) {
		this.shidai = shidai;
	}
	/**
	 * 获取：时代
	 */
	public String getShidai() {
		return shidai;
	}
	/**
	 * 设置：尺寸
	 */
	public void setChicun(String chicun) {
		this.chicun = chicun;
	}
	/**
	 * 获取：尺寸
	 */
	public String getChicun() {
		return chicun;
	}
	/**
	 * 设置：地质
	 */
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	/**
	 * 获取：地质
	 */
	public String getDizhi() {
		return dizhi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
