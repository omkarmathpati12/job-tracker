package com.job_tracker.Mapper;

import com.job_tracker.Dto.Request.CompanyRequest;
import com.job_tracker.Dto.Response.CompanyResponse;
import com.job_tracker.Entity.CompanyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    @Mapping(target = "active", constant = "false")
    CompanyEntity toEntity(CompanyRequest companyRequest);

    CompanyResponse toResponse(CompanyEntity companyEntity);
}
