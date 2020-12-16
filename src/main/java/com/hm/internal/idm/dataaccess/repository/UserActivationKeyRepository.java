package com.hm.internal.idm.dataaccess.repository;

import com.hm.internal.idm.dataaccess.entities.UserActivationKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActivationKeyRepository extends JpaRepository<UserActivationKey, Long> {
}
