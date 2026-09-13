package com.job_tracker.Service;

import com.job_tracker.Dto.Request.JobApplicationRequest;
import com.job_tracker.Dto.Response.JobApplicationResponse;
import com.job_tracker.Enums.ApplicationStatus;
import com.job_tracker.Enums.JobType;

import java.time.LocalDate;
import java.util.List;

public interface JobApplicationService {
    JobApplicationResponse createApplication(
            JobApplicationRequest request
    );

    JobApplicationResponse getApplicationById(
            Long applicationId
    );

    List<JobApplicationResponse> getAllApplications();

    JobApplicationResponse updateApplication(
            Long applicationId,
            JobApplicationRequest request
    );

    void deleteApplication(
            Long applicationId
    );

    List<JobApplicationResponse> getApplicationsByUserId(
            Long userId
    );

    List<JobApplicationResponse> getApplicationsByCompanyId(
            Long companyId
    );

    List<JobApplicationResponse> getApplicationsByStatus(
            ApplicationStatus status
    );

    List<JobApplicationResponse> getApplicationsByJobType(
            JobType jobType
    );

    List<JobApplicationResponse> getApplicationsByAppliedDate(
            LocalDate appliedDate
    );

    JobApplicationResponse updateApplicationStatus(
            Long applicationId,
            ApplicationStatus status
    );

}
