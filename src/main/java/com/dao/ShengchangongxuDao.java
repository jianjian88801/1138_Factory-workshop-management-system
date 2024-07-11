package com.dao;

import com.entity.ShengchangongxuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengchangongxuVO;
import com.entity.view.ShengchangongxuView;


/**
 * 生产工序
 * 
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public interface ShengchangongxuDao extends BaseMapper<ShengchangongxuEntity> {
	
	List<ShengchangongxuVO> selectListVO(@Param("ew") Wrapper<ShengchangongxuEntity> wrapper);
	
	ShengchangongxuVO selectVO(@Param("ew") Wrapper<ShengchangongxuEntity> wrapper);
	
	List<ShengchangongxuView> selectListView(@Param("ew") Wrapper<ShengchangongxuEntity> wrapper);

	List<ShengchangongxuView> selectListView(Pagination page,@Param("ew") Wrapper<ShengchangongxuEntity> wrapper);
	
	ShengchangongxuView selectView(@Param("ew") Wrapper<ShengchangongxuEntity> wrapper);
	

}
