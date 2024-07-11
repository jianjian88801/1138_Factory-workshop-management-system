package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KanbanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KanbanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KanbanxinxiView;


/**
 * 看板信息
 *
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public interface KanbanxinxiService extends IService<KanbanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KanbanxinxiVO> selectListVO(Wrapper<KanbanxinxiEntity> wrapper);
   	
   	KanbanxinxiVO selectVO(@Param("ew") Wrapper<KanbanxinxiEntity> wrapper);
   	
   	List<KanbanxinxiView> selectListView(Wrapper<KanbanxinxiEntity> wrapper);
   	
   	KanbanxinxiView selectView(@Param("ew") Wrapper<KanbanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KanbanxinxiEntity> wrapper);
   	

}

