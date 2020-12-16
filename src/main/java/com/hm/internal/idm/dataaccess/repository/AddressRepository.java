package com.hm.internal.idm.dataaccess.repository;

import com.hm.internal.idm.dataaccess.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
