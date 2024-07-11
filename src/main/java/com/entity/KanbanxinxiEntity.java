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
 * 看板信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
@TableName("kanbanxinxi")
public class KanbanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KanbanxinxiEntity() {
		
	}
	
	public KanbanxinxiEntity(T t) {
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
	 * 看板名称
	 */
					
	private String kanbanmingcheng;
	
	/**
	 * 预览图
	 */
					
	private String yulantu;
	
	/**
	 * 网页链接
	 */
					
	private String wangyelianjie;
	
	/**
	 * 内容说明
	 */
					
	private String neirongshuoming;
	
	
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
	 * 设置：看板名称
	 */
	public void setKanbanmingcheng(String kanbanmingcheng) {
		this.kanbanmingcheng = kanbanmingcheng;
	}
	/**
	 * 获取：看板名称
	 */
	public String getKanbanmingcheng() {
		return kanbanmingcheng;
	}
	/**
	 * 设置：预览图
	 */
	public void setYulantu(String yulantu) {
		this.yulantu = yulantu;
	}
	/**
	 * 获取：预览图
	 */
	public String getYulantu() {
		return yulantu;
	}
	/**
	 * 设置：网页链接
	 */
	public void setWangyelianjie(String wangyelianjie) {
		this.wangyelianjie = wangyelianjie;
	}
	/**
	 * 获取：网页链接
	 */
	public String getWangyelianjie() {
		return wangyelianjie;
	}
	/**
	 * 设置：内容说明
	 */
	public void setNeirongshuoming(String neirongshuoming) {
		this.neirongshuoming = neirongshuoming;
	}
	/**
	 * 获取：内容说明
	 */
	public String getNeirongshuoming() {
		return neirongshuoming;
	}

}
