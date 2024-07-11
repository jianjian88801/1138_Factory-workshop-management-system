package com.entity.model;

import com.entity.ShengchankailiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 生产开立
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public class ShengchankailiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
