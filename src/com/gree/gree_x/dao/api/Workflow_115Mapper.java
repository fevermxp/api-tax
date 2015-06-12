package com.gree.gree_x.dao.api;

import com.gree.gree_x.model.api.Workflow_115;
import com.gree.gree_x.model.api.Workflow_115Example;
import java.util.List;

public interface Workflow_115Mapper {
    int countByExample(Workflow_115Example example);

    int deleteByExample(Workflow_115Example example);

    int insert(Workflow_115 record);

    int insertSelective(Workflow_115 record);

    List<Workflow_115> selectByExample(Workflow_115Example example);

	int selectMaxId();
}