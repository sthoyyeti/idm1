package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "ROLE")
public class Role extends BaseId implements Serializable {
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "ENTERPRISE_CODE")
    private String enterpriseCode;
    public Role  (){};

    public Role(String name, String description, Character status, String enterpriseCode) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.enterpriseCode = enterpriseCode;
    }

    public Role(Long id, String name, String description, Character status, String enterpriseCode) {
        super(id);
        this.name = name;
        this.description = description;
        this.status = status;
        this.enterpriseCode = enterpriseCode;
    }

    public Role(Timestamp createdAt, Timestamp updatedAt, Long id, String name, String description, Character status, String enterpriseCode) {
        super(createdAt, updatedAt, id);
        this.name = name;
        this.description = description;
        this.status = status;
        this.enterpriseCode = enterpriseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }
}
