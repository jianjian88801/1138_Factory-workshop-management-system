package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengchanliuchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengchanliuchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengchanliuchengView;


/**
 * 生产流程
 *
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public interface ShengchanliuchengService extends IService<ShengchanliuchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengchanliuchengVO> selectListVO(Wrapper<ShengchanliuchengEntity> wrapper);
   	
   	ShengchanliuchengVO selectVO(@Param("ew") Wrapper<ShengchanliuchengEntity> wrapper);
   	
   	List<ShengchanliuchengView> selectListView(Wrapper<ShengchanliuchengEntity> wrapper);
   	
   	ShengchanliuchengView selectView(@Param("ew") Wrapper<ShengchanliuchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengchanliuchengEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShengchanliuchengEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShengchanliuchengEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShengchanliuchengEntity> wrapper);
}

