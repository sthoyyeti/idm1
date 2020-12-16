package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
public class BaseId extends BaseDateColumns implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public BaseId (){}

    public BaseId(Long id) {
        this.id = id;
    }

    public BaseId(Timestamp createdAt, Timestamp updatedAt, Long id) {
        super(createdAt, updatedAt);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}