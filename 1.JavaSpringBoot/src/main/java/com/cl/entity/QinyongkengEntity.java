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
 * 秦俑坑
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
@TableName("qinyongkeng")
public class QinyongkengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QinyongkengEntity() {
		
	}
	
	public QinyongkengEntity(T t) {
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
	 * 博物分类
	 */
					
	private String bowufenlei;
	
	/**
	 * 价格
	 */
					
	private Double jiage;
	
	/**
	 * 建造时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jianzaoshijian;
	
	/**
	 * 地理位置
	 */
					
	private String diliweizhi;
	
	/**
	 * 占地面积
	 */
					
	private String zhandimianji;
	
	/**
	 * 发掘时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fajueshijian;
	
	/**
	 * 主要结构
	 */
					
	private String zhuyaojiegou;
	
	/**
	 * 文物数量
	 */
					
	private Integer wenwushuliang;
	
	/**
	 * 文物特点
	 */
					
	private String wenwutedian;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：博物分类
	 */
	public void setBowufenlei(String bowufenlei) {
		this.bowufenlei = bowufenlei;
	}
	/**
	 * 获取：博物分类
	 */
	public String getBowufenlei() {
		return bowufenlei;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Double getJiage() {
		return jiage;
	}
	/**
	 * 设置：建造时间
	 */
	public void setJianzaoshijian(Date jianzaoshijian) {
		this.jianzaoshijian = jianzaoshijian;
	}
	/**
	 * 获取：建造时间
	 */
	public Date getJianzaoshijian() {
		return jianzaoshijian;
	}
	/**
	 * 设置：地理位置
	 */
	public void setDiliweizhi(String diliweizhi) {
		this.diliweizhi = diliweizhi;
	}
	/**
	 * 获取：地理位置
	 */
	public String getDiliweizhi() {
		return diliweizhi;
	}
	/**
	 * 设置：占地面积
	 */
	public void setZhandimianji(String zhandimianji) {
		this.zhandimianji = zhandimianji;
	}
	/**
	 * 获取：占地面积
	 */
	public String getZhandimianji() {
		return zhandimianji;
	}
	/**
	 * 设置：发掘时间
	 */
	public void setFajueshijian(Date fajueshijian) {
		this.fajueshijian = fajueshijian;
	}
	/**
	 * 获取：发掘时间
	 */
	public Date getFajueshijian() {
		return fajueshijian;
	}
	/**
	 * 设置：主要结构
	 */
	public void setZhuyaojiegou(String zhuyaojiegou) {
		this.zhuyaojiegou = zhuyaojiegou;
	}
	/**
	 * 获取：主要结构
	 */
	public String getZhuyaojiegou() {
		return zhuyaojiegou;
	}
	/**
	 * 设置：文物数量
	 */
	public void setWenwushuliang(Integer wenwushuliang) {
		this.wenwushuliang = wenwushuliang;
	}
	/**
	 * 获取：文物数量
	 */
	public Integer getWenwushuliang() {
		return wenwushuliang;
	}
	/**
	 * 设置：文物特点
	 */
	public void setWenwutedian(String wenwutedian) {
		this.wenwutedian = wenwutedian;
	}
	/**
	 * 获取：文物特点
	 */
	public String getWenwutedian() {
		return wenwutedian;
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
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
