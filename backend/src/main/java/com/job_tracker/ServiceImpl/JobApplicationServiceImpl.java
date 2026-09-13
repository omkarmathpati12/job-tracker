package com.job_tracker.ServiceImpl;

import com.job_tracker.Dto.Request.JobApplicationRequest;
import com.job_tracker.Dto.Response.JobApplicationResponse;
import com.job_tracker.Enums.ApplicationStatus;
import com.job_tracker.Enums.JobType;
import com.job_tracker.Service.JobApplicationService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {
    @Override
    public JobApplicationResponse createApplication(JobApplicationRequest request) {
        return null;
    }

    @Override
    public JobApplicationResponse getApplicationById(Long applicationId) {
        return null;
    }

    @Override
    public List<JobApplicationResponse> getAllApplications() {
        return List.of();
    }

    @Override
    public JobApplicationResponse updateApplication(Long applicationId, JobApplicationRequest request) {
        return null;
    }

    @Override
    public void deleteApplication(Long applicationId) {

    }

    @Override
    public List<JobApplicationResponse> getApplicationsByUserId(Long userId) {
        return List.of();
    }

    @Override
    public List<JobApplicationResponse> getApplicationsByCompanyId(Long companyId) {
        return List.of();
    }

    @Override
    public List<JobApplicationResponse> getApplicationsByStatus(ApplicationStatus status) {
        return List.of();
    }

    @Override
    public List<JobApplicationResponse> getApplicationsByJobType(JobType jobType) {
        return List.of();
    }

    @Override
    public List<JobApplicationResponse> getApplicationsByAppliedDate(LocalDate appliedDate) {
        return List.of();
    }

    @Override
    public JobApplicationResponse updateApplicationStatus(Long applicationId, ApplicationStatus status) {
        return null;
    }
}
