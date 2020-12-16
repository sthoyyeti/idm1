package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "WEAK_PASSWORD")
public class WeakPassword extends BaseId implements Serializable {
    @Column(name = "VALUE")
    private String value;
    public WeakPassword  (){};

    public WeakPassword(String value) {
        this.value = value;
    }

    public WeakPassword(Long id, String value) {
        super(id);
        this.value = value;
    }

    public WeakPassword(Timestamp createdAt, Timestamp updatedAt, Long id, String value) {
        super(createdAt, updatedAt, id);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
