package com.dao;

import com.entity.GoodsShouyinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GoodsShouyinView;

/**
 * 收银 Dao 接口
 *
 * @author 
 */
public interface GoodsShouyinDao extends BaseMapper<GoodsShouyinEntity> {

   List<GoodsShouyinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
