package com.job_tracker.Mapper;

import com.job_tracker.Dto.Request.UserRequest;
import com.job_tracker.Dto.Response.UserResponse;
import com.job_tracker.Entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toRequest(UserRequest userRequest);
    UserResponse toResponse(UserEntity userEntity);
    void updateEntity(UserRequest request, @MappingTarget UserEntity user);
}
