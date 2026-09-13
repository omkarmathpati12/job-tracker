package com.job_tracker.ServiceImpl;

import com.job_tracker.Dto.Request.InterviewRequest;
import com.job_tracker.Dto.Response.InterviewResponse;
import com.job_tracker.Enums.InterviewResult;
import com.job_tracker.Service.InterviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {
    @Override
    public InterviewResponse scheduleInterview(InterviewRequest request) {
        return null;
    }

    @Override
    public InterviewResponse getInterviewById(Long interviewId) {
        return null;
    }

    @Override
    public List<InterviewResponse> getAllInterviews() {
        return List.of();
    }

    @Override
    public List<InterviewResponse> getInterviewsByApplicationId(Long applicationId) {
        return List.of();
    }

    @Override
    public InterviewResponse updateInterview(Long interviewId, InterviewRequest request) {
        return null;
    }

    @Override
    public InterviewResponse updateInterviewResult(Long interviewId, InterviewResult result) {
        return null;
    }

    @Override
    public void deleteInterview(Long interviewId) {

    }
}
