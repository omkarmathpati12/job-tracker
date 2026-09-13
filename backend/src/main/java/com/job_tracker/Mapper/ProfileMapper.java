package com.job_tracker.Mapper;

import com.job_tracker.Dto.Request.ProfileRequest;
import com.job_tracker.Dto.Response.ProfileResponse;
import com.job_tracker.Entity.ProfileEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    ProfileEntity toEntity(ProfileRequest profileRequest);
    ProfileResponse toResponse(ProfileEntity profileEntity);
}
