package com.entity.view;

import com.entity.RenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
@TableName("renyuan")
public class RenyuanView  extends RenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenyuanView(){
	}
 
 	public RenyuanView(RenyuanEntity renyuanEntity){
 	try {
			BeanUtils.copyProperties(this, renyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
