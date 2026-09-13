package com.job_tracker.Service;

import com.job_tracker.Dto.Request.InterviewRequest;
import com.job_tracker.Dto.Response.InterviewResponse;
import com.job_tracker.Enums.InterviewResult;

import java.util.List;

public interface InterviewService {

    InterviewResponse scheduleInterview(
            InterviewRequest request
    );

    InterviewResponse getInterviewById(
            Long interviewId
    );

    List<InterviewResponse> getAllInterviews();

    List<InterviewResponse> getInterviewsByApplicationId(
            Long applicationId
    );

    InterviewResponse updateInterview(
            Long interviewId,
            InterviewRequest request
    );

    InterviewResponse updateInterviewResult(
            Long interviewId,
            InterviewResult result
    );

    void deleteInterview(
            Long interviewId
    );
}
