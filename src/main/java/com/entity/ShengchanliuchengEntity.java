package com.entity;

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
 * 生产流程
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
@TableName("shengchanliucheng")
public class ShengchanliuchengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShengchanliuchengEntity() {
		
	}
	
	public ShengchanliuchengEntity(T t) {
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
	 * 生产批号
	 */
					
	private String shengchanpihao;
	
	/**
	 * 生产批次
	 */
					
	private String shengchanpici;
	
	/**
	 * 工序名称
	 */
					
	private String gongxumingcheng;
	
	/**
	 * 工序编号
	 */
					
	private String gongxubianhao;
	
	/**
	 * 设备名称
	 */
					
	private String shebeimingcheng;
	
	/**
	 * 批次数量
	 */
					
	private Integer picishuliang;
	
	/**
	 * 产品名称
	 */
					
	private String chanpinmingcheng;
	
	/**
	 * 生产状态
	 */
					
	private String shengchanzhuangtai;
	
	
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
	 * 设置：生产批号
	 */
	public void setShengchanpihao(String shengchanpihao) {
		this.shengchanpihao = shengchanpihao;
	}
	/**
	 * 获取：生产批号
	 */
	public String getShengchanpihao() {
		return shengchanpihao;
	}
	/**
	 * 设置：生产批次
	 */
	public void setShengchanpici(String shengchanpici) {
		this.shengchanpici = shengchanpici;
	}
	/**
	 * 获取：生产批次
	 */
	public String getShengchanpici() {
		return shengchanpici;
	}
	/**
	 * 设置：工序名称
	 */
	public void setGongxumingcheng(String gongxumingcheng) {
		this.gongxumingcheng = gongxumingcheng;
	}
	/**
	 * 获取：工序名称
	 */
	public String getGongxumingcheng() {
		return gongxumingcheng;
	}
	/**
	 * 设置：工序编号
	 */
	public void setGongxubianhao(String gongxubianhao) {
		this.gongxubianhao = gongxubianhao;
	}
	/**
	 * 获取：工序编号
	 */
	public String getGongxubianhao() {
		return gongxubianhao;
	}
	/**
	 * 设置：设备名称
	 */
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
	/**
	 * 设置：批次数量
	 */
	public void setPicishuliang(Integer picishuliang) {
		this.picishuliang = picishuliang;
	}
	/**
	 * 获取：批次数量
	 */
	public Integer getPicishuliang() {
		return picishuliang;
	}
	/**
	 * 设置：产品名称
	 */
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
	/**
	 * 设置：生产状态
	 */
	public void setShengchanzhuangtai(String shengchanzhuangtai) {
		this.shengchanzhuangtai = shengchanzhuangtai;
	}
	/**
	 * 获取：生产状态
	 */
	public String getShengchanzhuangtai() {
		return shengchanzhuangtai;
	}

}
