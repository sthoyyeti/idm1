package com.hm.internal.idm.business;

import java.util.List;

import com.hm.internal.idm.dataaccess.entities.Enterprise;
import com.hm.internal.idm.dataaccess.repository.EnterpriseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService {

    private final EnterpriseRepository enterpriseRepo;

    @Autowired
    public EnterpriseService(EnterpriseRepository aEnterpriseRepo) {
        this.enterpriseRepo = aEnterpriseRepo;
    }

    public List<Enterprise> getEnterprises() {
       return enterpriseRepo.findAll();
    }

    /**
     * When ever we create Enterprise it must define admin along with it
     * @param enterprise
     * @return
     */
    public Enterprise createEnterprises(Enterprise enterprise) {
        return enterpriseRepo.save(enterprise);
    }
}
