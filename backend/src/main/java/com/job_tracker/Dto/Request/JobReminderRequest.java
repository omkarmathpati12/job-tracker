package com.job_tracker.Dto.Request;

import com.job_tracker.Enums.ReminderType;

import java.time.LocalDateTime;

public record JobReminderRequest(Long applicationId,
                                 LocalDateTime reminderDate,
                                 ReminderType reminderType,
                                 boolean completed) {
}
