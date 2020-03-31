package com.example.demo.model.mysql;

import java.util.Date;

public class UserBean {
    private String uuid;

    private String duuid;

    private String userName;

    private String password;

    private String encryptionRule;

    private Date validDate;

    private String userFrom;

    private Boolean isOnline;

    private String remark;

    private String passwordDes;

    private Date createtime;

    private Date updatetime;

    private Date loginTime;

    private String loginDept;

    private String loginWard;

    private String loginClient;

    private Short qyWxFlag;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getDuuid() {
        return duuid;
    }

    public void setDuuid(String duuid) {
        this.duuid = duuid == null ? null : duuid.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEncryptionRule() {
        return encryptionRule;
    }

    public void setEncryptionRule(String encryptionRule) {
        this.encryptionRule = encryptionRule == null ? null : encryptionRule.trim();
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom == null ? null : userFrom.trim();
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPasswordDes() {
        return passwordDes;
    }

    public void setPasswordDes(String passwordDes) {
        this.passwordDes = passwordDes == null ? null : passwordDes.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginDept() {
        return loginDept;
    }

    public void setLoginDept(String loginDept) {
        this.loginDept = loginDept == null ? null : loginDept.trim();
    }

    public String getLoginWard() {
        return loginWard;
    }

    public void setLoginWard(String loginWard) {
        this.loginWard = loginWard == null ? null : loginWard.trim();
    }

    public String getLoginClient() {
        return loginClient;
    }

    public void setLoginClient(String loginClient) {
        this.loginClient = loginClient == null ? null : loginClient.trim();
    }

    public Short getQyWxFlag() {
        return qyWxFlag;
    }

    public void setQyWxFlag(Short qyWxFlag) {
        this.qyWxFlag = qyWxFlag;
    }
}