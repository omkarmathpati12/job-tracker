package com.job_tracker.Service;

import com.job_tracker.Dto.Request.JobReminderRequest;
import com.job_tracker.Dto.Response.JobReminderResponse;

import java.util.List;

public interface JobReminderService {

    JobReminderResponse createReminder(
            JobReminderRequest request
    );

    JobReminderResponse getReminderById(
            Long reminderId
    );

    List<JobReminderResponse> getAllReminders();

    List<JobReminderResponse> getRemindersByApplicationId(
            Long applicationId
    );

    JobReminderResponse updateReminder(
            Long reminderId,
            JobReminderRequest request
    );

    JobReminderResponse markReminderAsCompleted(
            Long reminderId
    );

    JobReminderResponse markReminderAsIncomplete(
            Long reminderId
    );

    void deleteReminder(
            Long reminderId
    );

    List<JobReminderResponse> getPendingReminders();

    List<JobReminderResponse> getUpcomingReminders();
}
