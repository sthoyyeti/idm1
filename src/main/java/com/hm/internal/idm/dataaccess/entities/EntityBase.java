package com.hm.internal.idm.dataaccess.entities;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class EntityBase {
  public EntityBase() {

  }

  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected Long id;

  @Column(name = "create_date")
  protected Instant createdDate;

  @Column(name = "last_update_date")
  protected Instant lastUpdateDate;

  @PrePersist
  public void beforeInsert() {
    createdDate = Instant.now();
  }

  @PreUpdate
  public void beforeUpdate() {
    lastUpdateDate = Instant.now();
  }
}
