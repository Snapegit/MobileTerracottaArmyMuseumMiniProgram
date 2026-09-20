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
 * 导览
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@TableName("daolan")
public class DaolanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DaolanEntity() {
		
	}
	
	public DaolanEntity(T t) {
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
	 * 博物馆名称
	 */
					
	private String bowuguanmingcheng;
	
	/**
	 * 导览地址
	 */
					
	private String daolandizhi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：博物馆名称
	 */
	public void setBowuguanmingcheng(String bowuguanmingcheng) {
		this.bowuguanmingcheng = bowuguanmingcheng;
	}
	/**
	 * 获取：博物馆名称
	 */
	public String getBowuguanmingcheng() {
		return bowuguanmingcheng;
	}
	/**
	 * 设置：导览地址
	 */
	public void setDaolandizhi(String daolandizhi) {
		this.daolandizhi = daolandizhi;
	}
	/**
	 * 获取：导览地址
	 */
	public String getDaolandizhi() {
		return daolandizhi;
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

}
