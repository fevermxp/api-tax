package com.gree.gree_x.model;

public class SequenceIndex extends BaseModel {
    private String indexdesc;

    private Integer currentid;

    public String getIndexdesc() {
        return indexdesc;
    }

    public void setIndexdesc(String indexdesc) {
        this.indexdesc = indexdesc == null ? null : indexdesc.trim();
    }

    public Integer getCurrentid() {
        return currentid;
    }

    public void setCurrentid(Integer currentid) {
        this.currentid = currentid;
    }
}