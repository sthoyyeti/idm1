package com.hm.internal.idm.dataaccess.repository;

import com.hm.internal.idm.dataaccess.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
}
