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
 * 生产开立
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
@TableName("shengchankaili")
public class ShengchankailiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShengchankailiEntity() {
		
	}
	
	public ShengchankailiEntity(T t) {
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
	 * 工单数量
	 */
					
	private Integer gongdanshuliang;
	
	/**
	 * 生产批次
	 */
					
	private String shengchanpici;
	
	/**
	 * 批次数量
	 */
					
	private Integer picishuliang;
	
	/**
	 * 批次说明
	 */
					
	private String picishuoming;
	
	/**
	 * 产品名称
	 */
					
	private String chanpinmingcheng;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
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
	 * 设置：工单数量
	 */
	public void setGongdanshuliang(Integer gongdanshuliang) {
		this.gongdanshuliang = gongdanshuliang;
	}
	/**
	 * 获取：工单数量
	 */
	public Integer getGongdanshuliang() {
		return gongdanshuliang;
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
	 * 设置：批次说明
	 */
	public void setPicishuoming(String picishuoming) {
		this.picishuoming = picishuoming;
	}
	/**
	 * 获取：批次说明
	 */
	public String getPicishuoming() {
		return picishuoming;
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
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
