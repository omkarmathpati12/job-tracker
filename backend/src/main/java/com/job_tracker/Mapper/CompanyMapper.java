package com.job_tracker.Mapper;

import com.job_tracker.Dto.Request.CompanyRequest;
import com.job_tracker.Dto.Response.CompanyResponse;
import com.job_tracker.Entity.CompanyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    @Mapping(target = "CId", ignore = true)
    @Mapping(target = "applications", ignore = true)
    CompanyEntity toEntity(CompanyRequest companyRequest);

    @Mapping(source = "CId", target = "cId")
    CompanyResponse toResponse(CompanyEntity companyEntity);
}
