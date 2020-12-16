package com.hm.internal.idm.dataaccess.repository;

import com.hm.internal.idm.dataaccess.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepo extends JpaRepository<UserRole, Long> {
}
