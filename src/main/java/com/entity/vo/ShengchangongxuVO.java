package com.entity.vo;

import com.entity.ShengchangongxuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 生产工序
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public class ShengchangongxuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 工序内容
	 */
	
	private String gongxuneirong;
		
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
	 * 设置：工序内容
	 */
	 
	public void setGongxuneirong(String gongxuneirong) {
		this.gongxuneirong = gongxuneirong;
	}
	
	/**
	 * 获取：工序内容
	 */
	public String getGongxuneirong() {
		return gongxuneirong;
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
