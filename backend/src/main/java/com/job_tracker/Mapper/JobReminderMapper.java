package com.job_tracker.Mapper;

import com.job_tracker.Dto.Request.JobReminderRequest;
import com.job_tracker.Dto.Response.JobReminderResponse;
import com.job_tracker.Entity.JobReminderEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JobReminderMapper {

    JobReminderEntity toEntity(JobReminderRequest jobReminderRequest);
    JobReminderResponse toResponse(JobReminderEntity jobReminderEntity);
}
