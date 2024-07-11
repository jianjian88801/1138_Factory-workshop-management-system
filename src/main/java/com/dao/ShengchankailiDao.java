package com.dao;

import com.entity.ShengchankailiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengchankailiVO;
import com.entity.view.ShengchankailiView;


/**
 * 生产开立
 * 
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public interface ShengchankailiDao extends BaseMapper<ShengchankailiEntity> {
	
	List<ShengchankailiVO> selectListVO(@Param("ew") Wrapper<ShengchankailiEntity> wrapper);
	
	ShengchankailiVO selectVO(@Param("ew") Wrapper<ShengchankailiEntity> wrapper);
	
	List<ShengchankailiView> selectListView(@Param("ew") Wrapper<ShengchankailiEntity> wrapper);

	List<ShengchankailiView> selectListView(Pagination page,@Param("ew") Wrapper<ShengchankailiEntity> wrapper);
	
	ShengchankailiView selectView(@Param("ew") Wrapper<ShengchankailiEntity> wrapper);
	

}
