package com.hm.internal.idm.dataaccess.repository;

import com.hm.internal.idm.dataaccess.entities.PasswordPolicyAttr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordPolicyAttrRepository extends JpaRepository<PasswordPolicyAttr, Long> {
}
