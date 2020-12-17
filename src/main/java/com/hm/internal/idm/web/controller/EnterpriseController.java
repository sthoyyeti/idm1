package com.hm.internal.idm.web.controller;

import java.util.List;

import com.hm.internal.idm.business.EnterpriseService;
import com.hm.internal.idm.web.model.EnterpriseDto;
import com.hm.internal.idm.web.transform.EnterpriseDtoTransformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnterpriseController {

    private final EnterpriseService enterpriseService;

    private final EnterpriseDtoTransformer enterpriseDtoTransformer;

    @Autowired
    public EnterpriseController(EnterpriseService anEnterpriseService,
                                EnterpriseDtoTransformer anEnterpriseDtoTransformer) {
        this.enterpriseService = anEnterpriseService;
        this.enterpriseDtoTransformer = anEnterpriseDtoTransformer;
    }

    @GetMapping("/enterprises")
    public List<EnterpriseDto> getEnterprises() {
        List<EnterpriseDto> enterpriseDtos =
            enterpriseDtoTransformer.toEnterpriseDto(enterpriseService.getEnterprises());

        enterpriseDtos.forEach(System.out::println);

        return enterpriseDtos;
    }

}
