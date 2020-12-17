package com.hm.internal.idm.web.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.hm.internal.idm.dataaccess.entities.EntityBase;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@JsonDeserialize(builder = EnterpriseDto.EnterpriseDtoBuilder.class)
public class EnterpriseDto implements  Serializable{
    private Long id;
    private String name;
    private Character status;
    private String code;
    private String type;
    private String createdDate;
    private String updatedDate;

    @JsonPOJOBuilder(withPrefix = "")
    public static class EnterpriseDtoBuilder {

    }
}
