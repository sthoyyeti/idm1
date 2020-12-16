package com.hm.internal.idm.dataaccess.repository;

import com.hm.internal.idm.dataaccess.entities.UserPasswordHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPasswordHistoryRepo extends JpaRepository<UserPasswordHistory, Long> {
}
