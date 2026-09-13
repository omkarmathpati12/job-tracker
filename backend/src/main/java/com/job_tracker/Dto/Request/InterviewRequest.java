package com.job_tracker.Dto.Request;

import com.job_tracker.Enums.InterviewResult;

import java.time.LocalDateTime;

public record InterviewRequest(Long applicationId,
                               LocalDateTime interviewDate,
                               InterviewResult interviewResult) {
}
