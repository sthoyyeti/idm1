package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "USER_ACTIVATION_KEY")
public class UserActivationKey extends BaseId implements Serializable {
    @Column(name = "USER_ID")
    private User userId;
    @Column(name = "ACTIVATION_KEY")
    private String activationKey;
    @Column(name = "EXPIRY_DATE")
    private Date expiryDate;
    public UserActivationKey (){};

    public UserActivationKey(User userId, String activationKey, Date expiryDate) {
        this.userId = userId;
        this.activationKey = activationKey;
        this.expiryDate = expiryDate;
    }

    public UserActivationKey(Long id, User userId, String activationKey, Date expiryDate) {
        super(id);
        this.userId = userId;
        this.activationKey = activationKey;
        this.expiryDate = expiryDate;
    }

    public UserActivationKey(Timestamp createdAt, Timestamp updatedAt, Long id, User userId, String activationKey, Date expiryDate) {
        super(createdAt, updatedAt, id);
        this.userId = userId;
        this.activationKey = activationKey;
        this.expiryDate = expiryDate;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
