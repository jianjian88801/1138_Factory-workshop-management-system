package com.dao;

import com.entity.KanbanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KanbanxinxiVO;
import com.entity.view.KanbanxinxiView;


/**
 * 看板信息
 * 
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public interface KanbanxinxiDao extends BaseMapper<KanbanxinxiEntity> {
	
	List<KanbanxinxiVO> selectListVO(@Param("ew") Wrapper<KanbanxinxiEntity> wrapper);
	
	KanbanxinxiVO selectVO(@Param("ew") Wrapper<KanbanxinxiEntity> wrapper);
	
	List<KanbanxinxiView> selectListView(@Param("ew") Wrapper<KanbanxinxiEntity> wrapper);

	List<KanbanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KanbanxinxiEntity> wrapper);
	
	KanbanxinxiView selectView(@Param("ew") Wrapper<KanbanxinxiEntity> wrapper);
	

}
