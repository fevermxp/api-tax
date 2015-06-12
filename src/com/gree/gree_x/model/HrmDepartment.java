package com.gree.gree_x.model;

public class HrmDepartment extends BaseModel {
    private Integer id;

    private String departmentmark;

    private String departmentname;

    private Integer subcompanyid1;

    private Integer supdepid;

    private String allsupdepid;

    private Integer showorder;

    private String canceled;

    private String departmentcode;

    private Integer coadjutant;

    private String zzjgbmfzr;

    private String zzjgbmfgld;

    private String jzglbmfzr;

    private String jzglbmfgld;

    private String bmfzr;

    private String bmfgld;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentmark() {
        return departmentmark;
    }

    public void setDepartmentmark(String departmentmark) {
        this.departmentmark = departmentmark == null ? null : departmentmark.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public Integer getSubcompanyid1() {
        return subcompanyid1;
    }

    public void setSubcompanyid1(Integer subcompanyid1) {
        this.subcompanyid1 = subcompanyid1;
    }

    public Integer getSupdepid() {
        return supdepid;
    }

    public void setSupdepid(Integer supdepid) {
        this.supdepid = supdepid;
    }

    public String getAllsupdepid() {
        return allsupdepid;
    }

    public void setAllsupdepid(String allsupdepid) {
        this.allsupdepid = allsupdepid == null ? null : allsupdepid.trim();
    }

    public Integer getShoworder() {
        return showorder;
    }

    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
    }

    public String getCanceled() {
        return canceled;
    }

    public void setCanceled(String canceled) {
        this.canceled = canceled == null ? null : canceled.trim();
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode == null ? null : departmentcode.trim();
    }

    public Integer getCoadjutant() {
        return coadjutant;
    }

    public void setCoadjutant(Integer coadjutant) {
        this.coadjutant = coadjutant;
    }

    public String getZzjgbmfzr() {
        return zzjgbmfzr;
    }

    public void setZzjgbmfzr(String zzjgbmfzr) {
        this.zzjgbmfzr = zzjgbmfzr == null ? null : zzjgbmfzr.trim();
    }

    public String getZzjgbmfgld() {
        return zzjgbmfgld;
    }

    public void setZzjgbmfgld(String zzjgbmfgld) {
        this.zzjgbmfgld = zzjgbmfgld == null ? null : zzjgbmfgld.trim();
    }

    public String getJzglbmfzr() {
        return jzglbmfzr;
    }

    public void setJzglbmfzr(String jzglbmfzr) {
        this.jzglbmfzr = jzglbmfzr == null ? null : jzglbmfzr.trim();
    }

    public String getJzglbmfgld() {
        return jzglbmfgld;
    }

    public void setJzglbmfgld(String jzglbmfgld) {
        this.jzglbmfgld = jzglbmfgld == null ? null : jzglbmfgld.trim();
    }

    public String getBmfzr() {
        return bmfzr;
    }

    public void setBmfzr(String bmfzr) {
        this.bmfzr = bmfzr == null ? null : bmfzr.trim();
    }

    public String getBmfgld() {
        return bmfgld;
    }

    public void setBmfgld(String bmfgld) {
        this.bmfgld = bmfgld == null ? null : bmfgld.trim();
    }
}