package com.hm.internal.idm.dataaccess.repository;

import com.hm.internal.idm.dataaccess.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
