package com.hm.internal.idm.dataaccess.repository;

import com.hm.internal.idm.dataaccess.entities.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {
}
