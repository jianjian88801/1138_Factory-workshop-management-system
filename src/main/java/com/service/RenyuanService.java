package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenyuanView;


/**
 * 人员
 *
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public interface RenyuanService extends IService<RenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenyuanVO> selectListVO(Wrapper<RenyuanEntity> wrapper);
   	
   	RenyuanVO selectVO(@Param("ew") Wrapper<RenyuanEntity> wrapper);
   	
   	List<RenyuanView> selectListView(Wrapper<RenyuanEntity> wrapper);
   	
   	RenyuanView selectView(@Param("ew") Wrapper<RenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenyuanEntity> wrapper);
   	

}

