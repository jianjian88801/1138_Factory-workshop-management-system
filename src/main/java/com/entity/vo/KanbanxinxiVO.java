package com.entity.vo;

import com.entity.KanbanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 看板信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public class KanbanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
