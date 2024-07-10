package com.dao;

import com.entity.XiaofangjianchaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofangjianchaView;

/**
 * 消防检查 Dao 接口
 *
 * @author 
 */
public interface XiaofangjianchaDao extends BaseMapper<XiaofangjianchaEntity> {

   List<XiaofangjianchaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
