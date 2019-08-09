package com.gcjlearn.pojo;

import java.util.Date;

public class Message {
    private String mId;

    private String uIdFrom;

    private String uIdTo;

    private String mContent;

    private Date createTime;

    private Date updateTime;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getuIdFrom() {
        return uIdFrom;
    }

    public void setuIdFrom(String uIdFrom) {
        this.uIdFrom = uIdFrom == null ? null : uIdFrom.trim();
    }

    public String getuIdTo() {
        return uIdTo;
    }

    public void setuIdTo(String uIdTo) {
        this.uIdTo = uIdTo == null ? null : uIdTo.trim();
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent == null ? null : mContent.trim();
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