package com.gree.gree_x.dao.ehrsoft;

import com.gree.gree_x.model.ehrsoft.HrUser;
import com.gree.gree_x.model.ehrsoft.HrUserExample;
import java.util.List;

public interface HrUserMapper {
    int countByExample(HrUserExample example);

    int deleteByExample(HrUserExample example);

    int insert(HrUser record);

    int insertSelective(HrUser record);

    List<HrUser> selectByExample(HrUserExample example);
}