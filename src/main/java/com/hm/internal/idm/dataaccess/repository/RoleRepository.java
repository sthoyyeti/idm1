package com.hm.internal.idm.dataaccess.repository;

import com.hm.internal.idm.dataaccess.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
