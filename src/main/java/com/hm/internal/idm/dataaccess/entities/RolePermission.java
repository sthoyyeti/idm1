package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "ROLE_PERMISSIONS")
public class RolePermission extends BaseId implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
    private Role roleId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERMISSION_ID", referencedColumnName = "ID")
    private Permission permissionId;
    public RolePermission (){};

    public RolePermission(Role roleId, Permission permissionId) {
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public RolePermission(Long id, Role roleId, Permission permissionId) {
        super(id);
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public RolePermission(Timestamp createdAt, Timestamp updatedAt, Long id, Role roleId, Permission permissionId) {
        super(createdAt, updatedAt, id);
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public Permission getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Permission permissionId) {
        this.permissionId = permissionId;
    }
}
