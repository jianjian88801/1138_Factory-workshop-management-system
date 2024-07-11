package com.dao;

import com.entity.ShengchanliuchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengchanliuchengVO;
import com.entity.view.ShengchanliuchengView;


/**
 * 生产流程
 * 
 * @author 
 * @email 
 * @date 2022-03-19 15:00:26
 */
public interface ShengchanliuchengDao extends BaseMapper<ShengchanliuchengEntity> {
	
	List<ShengchanliuchengVO> selectListVO(@Param("ew") Wrapper<ShengchanliuchengEntity> wrapper);
	
	ShengchanliuchengVO selectVO(@Param("ew") Wrapper<ShengchanliuchengEntity> wrapper);
	
	List<ShengchanliuchengView> selectListView(@Param("ew") Wrapper<ShengchanliuchengEntity> wrapper);

	List<ShengchanliuchengView> selectListView(Pagination page,@Param("ew") Wrapper<ShengchanliuchengEntity> wrapper);
	
	ShengchanliuchengView selectView(@Param("ew") Wrapper<ShengchanliuchengEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShengchanliuchengEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShengchanliuchengEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShengchanliuchengEntity> wrapper);
}
