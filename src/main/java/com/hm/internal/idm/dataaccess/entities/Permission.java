package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "PERMISSION")
public class Permission extends BaseId implements Serializable {
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "FEATURE")
    private String feature;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "TYPE")
    private Boolean type;
    public Permission (){};

    public Permission(String name, String description, String feature, Character status, Boolean type) {
        this.name = name;
        this.description = description;
        this.feature = feature;
        this.status = status;
        this.type = type;
    }

    public Permission(Long id, String name, String description, String feature, Character status, Boolean type) {
        super(id);
        this.name = name;
        this.description = description;
        this.feature = feature;
        this.status = status;
        this.type = type;
    }

    public Permission(Timestamp createdAt, Timestamp updatedAt, Long id, String name, String description, String feature, Character status, Boolean type) {
        super(createdAt, updatedAt, id);
        this.name = name;
        this.description = description;
        this.feature = feature;
        this.status = status;
        this.type = type;
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

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }
}
