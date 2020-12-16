package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "USER_PASSWD_HIST")
public class UserPasswordHistory extends BaseId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private User userId;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "SALT")
    private String salt;
    public  UserPasswordHistory (){};

    public UserPasswordHistory(User userId, String password, String salt) {
        this.userId = userId;
        this.password = password;
        this.salt = salt;
    }

    public UserPasswordHistory(Long id, User userId, String password, String salt) {
        super(id);
        this.userId = userId;
        this.password = password;
        this.salt = salt;
    }

    public UserPasswordHistory(Timestamp createdAt, Timestamp updatedAt, Long id, User userId, String password, String salt) {
        super(createdAt, updatedAt, id);
        this.userId = userId;
        this.password = password;
        this.salt = salt;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
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
}
