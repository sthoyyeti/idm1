package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "ENTERPRISE")
public class Enterprise extends BaseId implements Serializable {
    @Column(name = "NAME")
    private String name;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "ENTERPRISE_CODE")
    private String code;
    @Column(name = "ENTERPRISE_TYPE")
    private String type;
    public Enterprise (){};

    public Enterprise(String name) {
        this.name = name;
    }

    public Enterprise(Long id, String name) {
        super(id);
        this.name = name;
    }

    public Enterprise(Timestamp createdAt, Timestamp updatedAt, Long id, String name) {
        super(createdAt, updatedAt, id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
