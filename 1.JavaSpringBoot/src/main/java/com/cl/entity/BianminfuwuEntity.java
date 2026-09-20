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
 * 便民服务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@TableName("bianminfuwu")
public class BianminfuwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BianminfuwuEntity() {
		
	}
	
	public BianminfuwuEntity(T t) {
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
	 * 开放时间
	 */
					
	private String kaifangshijian;
	
	/**
	 * 门票价格
	 */
					
	private String menpiaojiage;
	
	/**
	 * 免费政策
	 */
					
	private String mianfeizhengce;
	
	/**
	 * 休息区域
	 */
					
	private String xiuxiquyu;
	
	/**
	 * 储物设施
	 */
					
	private String chuwusheshi;
	
	/**
	 * 交通指南
	 */
					
	private String jiaotongzhinan;
	
	/**
	 * 餐饮设施
	 */
					
	private String canyinsheshi;
	
	
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
	 * 设置：开放时间
	 */
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
	/**
	 * 设置：门票价格
	 */
	public void setMenpiaojiage(String menpiaojiage) {
		this.menpiaojiage = menpiaojiage;
	}
	/**
	 * 获取：门票价格
	 */
	public String getMenpiaojiage() {
		return menpiaojiage;
	}
	/**
	 * 设置：免费政策
	 */
	public void setMianfeizhengce(String mianfeizhengce) {
		this.mianfeizhengce = mianfeizhengce;
	}
	/**
	 * 获取：免费政策
	 */
	public String getMianfeizhengce() {
		return mianfeizhengce;
	}
	/**
	 * 设置：休息区域
	 */
	public void setXiuxiquyu(String xiuxiquyu) {
		this.xiuxiquyu = xiuxiquyu;
	}
	/**
	 * 获取：休息区域
	 */
	public String getXiuxiquyu() {
		return xiuxiquyu;
	}
	/**
	 * 设置：储物设施
	 */
	public void setChuwusheshi(String chuwusheshi) {
		this.chuwusheshi = chuwusheshi;
	}
	/**
	 * 获取：储物设施
	 */
	public String getChuwusheshi() {
		return chuwusheshi;
	}
	/**
	 * 设置：交通指南
	 */
	public void setJiaotongzhinan(String jiaotongzhinan) {
		this.jiaotongzhinan = jiaotongzhinan;
	}
	/**
	 * 获取：交通指南
	 */
	public String getJiaotongzhinan() {
		return jiaotongzhinan;
	}
	/**
	 * 设置：餐饮设施
	 */
	public void setCanyinsheshi(String canyinsheshi) {
		this.canyinsheshi = canyinsheshi;
	}
	/**
	 * 获取：餐饮设施
	 */
	public String getCanyinsheshi() {
		return canyinsheshi;
	}

}
