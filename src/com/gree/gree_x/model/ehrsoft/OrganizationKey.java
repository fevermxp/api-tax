package com.gree.gree_x.model.ehrsoft;

import com.gree.gree_x.model.BaseModel;

public class OrganizationKey extends BaseModel {
    private String codesetid;

    private String codeitemid;

    public String getCodesetid() {
        return codesetid;
    }

    public void setCodesetid(String codesetid) {
        this.codesetid = codesetid == null ? null : codesetid.trim();
    }

    public String getCodeitemid() {
        return codeitemid;
    }

    public void setCodeitemid(String codeitemid) {
        this.codeitemid = codeitemid == null ? null : codeitemid.trim();
    }
}