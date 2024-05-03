package com.dao;

import com.entity.GoodsShouyinListEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GoodsShouyinListView;

/**
 * 收银详情 Dao 接口
 *
 * @author 
 */
public interface GoodsShouyinListDao extends BaseMapper<GoodsShouyinListEntity> {

   List<GoodsShouyinListView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
