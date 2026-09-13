package com.job_tracker.Dto.Response;

import com.job_tracker.Enums.ApplicationStatus;
import com.job_tracker.Enums.JobType;

import java.time.LocalDate;

public record JobApplicationResponse(Long jobId,
                                     String jobTitle,
                                     ApplicationStatus applicationStatus,
                                     LocalDate appliedDate,
                                     JobType jobType,
                                     Long userId,
                                     Long companyId) {
}
