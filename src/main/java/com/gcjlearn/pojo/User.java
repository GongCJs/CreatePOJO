package com.gcjlearn.pojo;

import java.util.Date;

public class User {
    private String uId;

    private String uPassword;

    private String uSale;

    private Date createTime;

    private Date updateTime;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuSale() {
        return uSale;
    }

    public void setuSale(String uSale) {
        this.uSale = uSale == null ? null : uSale.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}