package com.gree.gree_x.model.api;

import java.util.Date;

import com.gree.gree_x.model.BaseModel;

public class UserInfo extends BaseModel {
	private static final long serialVersionUID = 1605141317619344738L;

	private String workcode;

    private String password;

    private String lastname;

    private Integer status;

    private Date creattime;

    private Integer mark;

    private String mobile;

    private Integer departmentid;

    private Integer joblevel;

    private Integer banzu;

    public String getWorkcode() {
        return workcode;
    }

    public void setWorkcode(String workcode) {
        this.workcode = workcode == null ? null : workcode.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getJoblevel() {
        return joblevel;
    }

    public void setJoblevel(Integer joblevel) {
        this.joblevel = joblevel;
    }

    public Integer getBanzu() {
        return banzu;
    }

    public void setBanzu(Integer banzu) {
        this.banzu = banzu;
    }
}