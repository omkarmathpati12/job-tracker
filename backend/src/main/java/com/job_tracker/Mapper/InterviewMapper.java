package com.job_tracker.Mapper;

import com.job_tracker.Dto.Request.InterviewRequest;
import com.job_tracker.Dto.Response.InterviewResponse;
import com.job_tracker.Entity.InterviewEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InterviewMapper {

    InterviewEntity toEntity(InterviewRequest interviewRequest);
    InterviewResponse toResponse(InterviewEntity interviewEntity);
}
