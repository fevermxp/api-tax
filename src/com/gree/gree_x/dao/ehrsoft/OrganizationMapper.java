package com.gree.gree_x.dao.ehrsoft;

import com.gree.gree_x.model.ehrsoft.Organization;
import com.gree.gree_x.model.ehrsoft.OrganizationExample;
import java.util.List;

public interface OrganizationMapper {
    int countByExample(OrganizationExample example);

    int deleteByExample(OrganizationExample example);

    int insert(Organization record);

    int insertSelective(Organization record);

    List<Organization> selectByExampleWithBLOBs(OrganizationExample example);

    List<Organization> selectByExample(OrganizationExample example);
}