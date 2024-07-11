package com.dao;

import com.entity.RenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenyuanVO;
import com.entity.view.RenyuanView;


/**
 * 人员
 * 
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public interface RenyuanDao extends BaseMapper<RenyuanEntity> {
	
	List<RenyuanVO> selectListVO(@Param("ew") Wrapper<RenyuanEntity> wrapper);
	
	RenyuanVO selectVO(@Param("ew") Wrapper<RenyuanEntity> wrapper);
	
	List<RenyuanView> selectListView(@Param("ew") Wrapper<RenyuanEntity> wrapper);

	List<RenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<RenyuanEntity> wrapper);
	
	RenyuanView selectView(@Param("ew") Wrapper<RenyuanEntity> wrapper);
	

}
