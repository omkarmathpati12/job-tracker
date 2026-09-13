package com.job_tracker.Dto.Response;

import com.job_tracker.Enums.ReminderType;

import java.time.LocalDateTime;

public record JobReminderResponse (Long jobReminderId,
                                   Long applicationId,
                                   LocalDateTime reminderDate,
                                   ReminderType reminderType,
                                   boolean completed){
}
