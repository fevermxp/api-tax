package com.gree.gree_x.dao.api;

import com.gree.gree_x.model.api.UserInfo;
import com.gree.gree_x.model.api.UserInfoExample;
import java.util.List;

public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);
}