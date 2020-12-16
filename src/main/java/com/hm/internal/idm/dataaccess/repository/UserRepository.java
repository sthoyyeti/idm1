package com.hm.internal.idm.dataaccess.repository;

import com.hm.internal.idm.dataaccess.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
