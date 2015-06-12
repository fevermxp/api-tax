package com.gree.gree_x.dao;

import com.gree.gree_x.model.HrmResource;
import com.gree.gree_x.model.HrmResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrmResourceMapper {
    int countByExample(HrmResourceExample example);

    int deleteByExample(HrmResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HrmResource record);

    int insertSelective(HrmResource record);

    List<HrmResource> selectByExample(HrmResourceExample example);

    HrmResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HrmResource record, @Param("example") HrmResourceExample example);

    int updateByExample(@Param("record") HrmResource record, @Param("example") HrmResourceExample example);

    int updateByPrimaryKeySelective(HrmResource record);

    int updateByPrimaryKey(HrmResource record);
}