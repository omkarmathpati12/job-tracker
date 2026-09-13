package com.job_tracker.Dto.Response;

import com.job_tracker.Enums.InterviewResult;

import java.time.LocalDateTime;

public record InterviewResponse(Long interviewId,
                                Long applicationId,
                                LocalDateTime interviewDate,
                                InterviewResult interviewResult) {
}
