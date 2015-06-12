package com.gree.gree_x.dao;

import com.gree.gree_x.model.HrmDepartment;
import com.gree.gree_x.model.HrmDepartmentExample;
import java.util.List;

public interface HrmDepartmentMapper {
    int countByExample(HrmDepartmentExample example);

    int deleteByExample(HrmDepartmentExample example);

    int insert(HrmDepartment record);

    int insertSelective(HrmDepartment record);

    List<HrmDepartment> selectByExample(HrmDepartmentExample example);
}