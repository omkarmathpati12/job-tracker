package com.job_tracker.Mapper;

import com.job_tracker.Dto.Request.JobApplicationRequest;
import com.job_tracker.Dto.Response.JobApplicationResponse;
import com.job_tracker.Entity.JobApplicationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JobApplicationMapper {

    JobApplicationEntity toEntity(JobApplicationRequest jobApplicationRequest);
    JobApplicationResponse toResponse(JobApplicationEntity jobApplicationEntity);
}
