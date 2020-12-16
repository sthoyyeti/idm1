package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "PASSWORD_POLICY")
public class PasswordPolicy extends BaseId implements Serializable {
    @Column(name = "ENTERPRISE_CODE")
    private String enterpriseCode;
    @Column(name = "POLICY_NAME")
    private String policyName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "STATUS")
    private Character status;
    public PasswordPolicy (){};

    public PasswordPolicy(String enterpriseCode, String policyName, String description, Character status) {
        this.enterpriseCode = enterpriseCode;
        this.policyName = policyName;
        this.description = description;
        this.status = status;
    }

    public PasswordPolicy(Long id, String enterpriseCode, String policyName, String description, Character status) {
        super(id);
        this.enterpriseCode = enterpriseCode;
        this.policyName = policyName;
        this.description = description;
        this.status = status;
    }

    public PasswordPolicy(Timestamp createdAt, Timestamp updatedAt, Long id, String enterpriseCode, String policyName, String description, Character status) {
        super(createdAt, updatedAt, id);
        this.enterpriseCode = enterpriseCode;
        this.policyName = policyName;
        this.description = description;
        this.status = status;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
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
}
