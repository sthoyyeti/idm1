package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "USER_ROLES")
public class UserRole extends BaseId implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private User userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
    private Role roleId;
    public  UserRole (){};

    public UserRole(User userId, Role roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public UserRole(Long id, User userId, Role roleId) {
        super(id);
        this.userId = userId;
        this.roleId = roleId;
    }

    public UserRole(Timestamp createdAt, Timestamp updatedAt, Long id, User userId, Role roleId) {
        super(createdAt, updatedAt, id);
        this.userId = userId;
        this.roleId = roleId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }
}
