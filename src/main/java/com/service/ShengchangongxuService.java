package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengchangongxuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengchangongxuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengchangongxuView;


/**
 * 生产工序
 *
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public interface ShengchangongxuService extends IService<ShengchangongxuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengchangongxuVO> selectListVO(Wrapper<ShengchangongxuEntity> wrapper);
   	
   	ShengchangongxuVO selectVO(@Param("ew") Wrapper<ShengchangongxuEntity> wrapper);
   	
   	List<ShengchangongxuView> selectListView(Wrapper<ShengchangongxuEntity> wrapper);
   	
   	ShengchangongxuView selectView(@Param("ew") Wrapper<ShengchangongxuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengchangongxuEntity> wrapper);
   	

}

