package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "USER")
public class User extends EntityBase implements Serializable {
    @Column(name = "NAME")
    private String name;
    @Column(name = "USERNAME")
    private String userName;
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "SALT")
    private String salt;
    @Column(name = "PASSWD_CREATED")
    private Timestamp passwordCreatedDate;
    @Column(name = "CHANGE_PASSWD")
    private Boolean isChangePassword;
    @Column(name = "LOGIN_FAIL_COUNT")
    private Integer loginFailCount;
    @Column(name = "EMAIL_VERIFIED")
    private Boolean isEmailVerified;
    @Column(name = "ENTERPRISE_CODE")
    private String enterpriseCode;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "USER_TYPE")
    private Boolean userType;
    @Column(name = "PASSWORD_EXPIRY")
    private Timestamp passwordExpiryDate;
    @Column(name = "LAST_LOGIN_DATE")
    private Timestamp lastLoginDate;
    public User (){};

    public User(String name, String userName, String emailId, String password, String salt, Timestamp passwordCreatedDate, Boolean isChangePassword, Integer loginFailCount, Boolean isEmailVerified, String enterpriseCode, Character status, Boolean userType, Timestamp passwordExpiryDate, Timestamp lastLoginDate) {
        this.name = name;
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.salt = salt;
        this.passwordCreatedDate = passwordCreatedDate;
        this.isChangePassword = isChangePassword;
        this.loginFailCount = loginFailCount;
        this.isEmailVerified = isEmailVerified;
        this.enterpriseCode = enterpriseCode;
        this.status = status;
        this.userType = userType;
        this.passwordExpiryDate = passwordExpiryDate;
        this.lastLoginDate = lastLoginDate;
    }

    public User(Long id, String name, String userName, String emailId, String password, String salt, Timestamp passwordCreatedDate, Boolean isChangePassword, Integer loginFailCount, Boolean isEmailVerified, String enterpriseCode, Character status, Boolean userType, Timestamp passwordExpiryDate, Timestamp lastLoginDate) {
       // super(id);
        this.name = name;
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.salt = salt;
        this.passwordCreatedDate = passwordCreatedDate;
        this.isChangePassword = isChangePassword;
        this.loginFailCount = loginFailCount;
        this.isEmailVerified = isEmailVerified;
        this.enterpriseCode = enterpriseCode;
        this.status = status;
        this.userType = userType;
        this.passwordExpiryDate = passwordExpiryDate;
        this.lastLoginDate = lastLoginDate;
    }

    public User(Timestamp createdAt, Timestamp updatedAt, Long id, String name, String userName, String emailId, String password, String salt, Timestamp passwordCreatedDate, Boolean isChangePassword, Integer loginFailCount, Boolean isEmailVerified, String enterpriseCode, Character status, Boolean userType, Timestamp passwordExpiryDate, Timestamp lastLoginDate) {
       // super(createdAt, updatedAt, id);
        this.name = name;
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.salt = salt;
        this.passwordCreatedDate = passwordCreatedDate;
        this.isChangePassword = isChangePassword;
        this.loginFailCount = loginFailCount;
        this.isEmailVerified = isEmailVerified;
        this.enterpriseCode = enterpriseCode;
        this.status = status;
        this.userType = userType;
        this.passwordExpiryDate = passwordExpiryDate;
        this.lastLoginDate = lastLoginDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Timestamp getPasswordCreatedDate() {
        return passwordCreatedDate;
    }

    public void setPasswordCreatedDate(Timestamp passwordCreatedDate) {
        this.passwordCreatedDate = passwordCreatedDate;
    }

    public Boolean getChangePassword() {
        return isChangePassword;
    }

    public void setChangePassword(Boolean changePassword) {
        isChangePassword = changePassword;
    }

    public Integer getLoginFailCount() {
        return loginFailCount;
    }

    public void setLoginFailCount(Integer loginFailCount) {
        this.loginFailCount = loginFailCount;
    }

    public Boolean getEmailVerified() {
        return isEmailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        isEmailVerified = emailVerified;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Boolean getUserType() {
        return userType;
    }

    public void setUserType(Boolean userType) {
        this.userType = userType;
    }

    public Timestamp getPasswordExpiryDate() {
        return passwordExpiryDate;
    }

    public void setPasswordExpiryDate(Timestamp passwordExpiryDate) {
        this.passwordExpiryDate = passwordExpiryDate;
    }

    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
