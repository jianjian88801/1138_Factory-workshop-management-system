package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengchankailiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengchankailiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengchankailiView;


/**
 * 生产开立
 *
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public interface ShengchankailiService extends IService<ShengchankailiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengchankailiVO> selectListVO(Wrapper<ShengchankailiEntity> wrapper);
   	
   	ShengchankailiVO selectVO(@Param("ew") Wrapper<ShengchankailiEntity> wrapper);
   	
   	List<ShengchankailiView> selectListView(Wrapper<ShengchankailiEntity> wrapper);
   	
   	ShengchankailiView selectView(@Param("ew") Wrapper<ShengchankailiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengchankailiEntity> wrapper);
   	

}

