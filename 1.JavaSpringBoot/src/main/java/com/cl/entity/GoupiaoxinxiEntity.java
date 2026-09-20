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
 * 购票信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
@TableName("goupiaoxinxi")
public class GoupiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GoupiaoxinxiEntity() {
		
	}
	
	public GoupiaoxinxiEntity(T t) {
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
	 * 票编号
	 */
					
	private String piaobianhao;
	
	/**
	 * 博物馆名称
	 */
					
	private String bowuguanmingcheng;
	
	/**
	 * 价格
	 */
					
	private Double jiage;
	
	/**
	 * 建造时间
	 */
					
	private String jianzaoshijian;
	
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
					
	private String fajueshijian;
	
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
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 购票时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date goupiaoshijian;
	
	
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
	 * 设置：票编号
	 */
	public void setPiaobianhao(String piaobianhao) {
		this.piaobianhao = piaobianhao;
	}
	/**
	 * 获取：票编号
	 */
	public String getPiaobianhao() {
		return piaobianhao;
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
	public void setJianzaoshijian(String jianzaoshijian) {
		this.jianzaoshijian = jianzaoshijian;
	}
	/**
	 * 获取：建造时间
	 */
	public String getJianzaoshijian() {
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
	public void setFajueshijian(String fajueshijian) {
		this.fajueshijian = fajueshijian;
	}
	/**
	 * 获取：发掘时间
	 */
	public String getFajueshijian() {
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
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：购票时间
	 */
	public void setGoupiaoshijian(Date goupiaoshijian) {
		this.goupiaoshijian = goupiaoshijian;
	}
	/**
	 * 获取：购票时间
	 */
	public Date getGoupiaoshijian() {
		return goupiaoshijian;
	}

}
