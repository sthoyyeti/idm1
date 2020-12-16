package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "PASSWORD_POLICY_ATTR")
public class PasswordPolicyAttr extends BaseId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "POLICY_ID", referencedColumnName = "ID")
    private PasswordPolicy policyId;
    @Column(name = "ATTR_NAME")
    private String name;
    @Column(name = "ATTR_VALUE")
    private String value;
    public PasswordPolicyAttr (){};

    public PasswordPolicyAttr(PasswordPolicy policyId, String name, String value) {
        this.policyId = policyId;
        this.name = name;
        this.value = value;
    }

    public PasswordPolicyAttr(Long id, PasswordPolicy policyId, String name, String value) {
        super(id);
        this.policyId = policyId;
        this.name = name;
        this.value = value;
    }

    public PasswordPolicyAttr(Timestamp createdAt, Timestamp updatedAt, Long id, PasswordPolicy policyId, String name, String value) {
        super(createdAt, updatedAt, id);
        this.policyId = policyId;
        this.name = name;
        this.value = value;
    }

    public PasswordPolicy getPolicyId() {
        return policyId;
    }

    public void setPolicyId(PasswordPolicy policyId) {
        this.policyId = policyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
