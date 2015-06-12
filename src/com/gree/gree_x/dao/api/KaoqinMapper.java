package com.gree.gree_x.dao.api;

import com.gree.gree_x.model.api.Kaoqin;
import com.gree.gree_x.model.api.KaoqinExample;
import java.util.List;

public interface KaoqinMapper {
    int countByExample(KaoqinExample example);

    int deleteByExample(KaoqinExample example);

    int insert(Kaoqin record);

    int insertSelective(Kaoqin record);

    List<Kaoqin> selectByExample(KaoqinExample example);
}