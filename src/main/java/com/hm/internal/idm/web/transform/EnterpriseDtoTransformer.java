package com.hm.internal.idm.web.transform;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import com.hm.internal.idm.dataaccess.entities.Enterprise;
import com.hm.internal.idm.web.model.EnterpriseDto;

import org.springframework.stereotype.Component;

@Component
public class EnterpriseDtoTransformer {

    public EnterpriseDto toEnterpriseDto(Enterprise enterpriseEntity){
        if (enterpriseEntity == null ) return null;

            return EnterpriseDto.builder()
            .id(enterpriseEntity.getId())
            .name(enterpriseEntity.getName())
            .status(enterpriseEntity.getStatus())
            .code(enterpriseEntity.getCode())
            .type(enterpriseEntity.getType())
            .createdDate(toFormattedDate(enterpriseEntity.getCreatedDate()))
            .updatedDate(toFormattedDate(enterpriseEntity.getLastUpdateDate()))
            .build();

    }

    public List<EnterpriseDto> toEnterpriseDto(List<Enterprise> enterpriseEntities){
        return enterpriseEntities.stream()
            .filter(entity -> entity != null)
            .map(this::toEnterpriseDto)
            .collect(Collectors.toList());
    }

    private String toFormattedDate(Instant instant) {
        return instant == null ? null : instant.toString();
    }

}
