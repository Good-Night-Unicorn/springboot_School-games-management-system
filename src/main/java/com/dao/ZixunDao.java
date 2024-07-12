package com.dao;

import com.entity.ZixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunView;

/**
 * 运动会资讯 Dao 接口
 *
 * @author 
 */
public interface ZixunDao extends BaseMapper<ZixunEntity> {

   List<ZixunView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
