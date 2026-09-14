package com.job_tracker.Dto.Request;

import com.job_tracker.Dto.Response.CompanyResponse;
import com.job_tracker.Dto.Response.UserResponse;
import com.job_tracker.Enums.ApplicationStatus;
import com.job_tracker.Enums.JobType;

import java.time.LocalDate;

public record JobApplicationRequest( String jobTitle,
                                     ApplicationStatus applicationStatus,
                                     LocalDate appliedDate,
                                     JobType jobType,
                                     Long userId,
                                     Long cId
                                    ) {
}
