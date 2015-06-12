package com.gree.gree_x.model.ehrsoft;

import java.util.Date;

public class Organization extends OrganizationKey {
    private String codeitemdesc;

    private String parentid;

    private String childid;

    private String state;

    private Short grade;

    private Short a0000;

    private Short groupid;

    private Short invalid;

    private Short flag;

    private Short layer;

    private String corcode;

    private Date endDate;

    private Date startDate;

    private Long viewChart;

    private String posCond;

    public String getCodeitemdesc() {
        return codeitemdesc;
    }

    public void setCodeitemdesc(String codeitemdesc) {
        this.codeitemdesc = codeitemdesc == null ? null : codeitemdesc.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getChildid() {
        return childid;
    }

    public void setChildid(String childid) {
        this.childid = childid == null ? null : childid.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Short getGrade() {
        return grade;
    }

    public void setGrade(Short grade) {
        this.grade = grade;
    }

    public Short getA0000() {
        return a0000;
    }

    public void setA0000(Short a0000) {
        this.a0000 = a0000;
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Short getInvalid() {
        return invalid;
    }

    public void setInvalid(Short invalid) {
        this.invalid = invalid;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public Short getLayer() {
        return layer;
    }

    public void setLayer(Short layer) {
        this.layer = layer;
    }

    public String getCorcode() {
        return corcode;
    }

    public void setCorcode(String corcode) {
        this.corcode = corcode == null ? null : corcode.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getViewChart() {
        return viewChart;
    }

    public void setViewChart(Long viewChart) {
        this.viewChart = viewChart;
    }

    public String getPosCond() {
        return posCond;
    }

    public void setPosCond(String posCond) {
        this.posCond = posCond == null ? null : posCond.trim();
    }
}