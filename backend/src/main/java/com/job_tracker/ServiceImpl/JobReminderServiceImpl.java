package com.job_tracker.ServiceImpl;

import com.job_tracker.Dto.Request.JobReminderRequest;
import com.job_tracker.Dto.Response.JobReminderResponse;
import com.job_tracker.Service.JobReminderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobReminderServiceImpl implements JobReminderService {
    @Override
    public JobReminderResponse createReminder(JobReminderRequest request) {
        return null;
    }

    @Override
    public JobReminderResponse getReminderById(Long reminderId) {
        return null;
    }

    @Override
    public List<JobReminderResponse> getAllReminders() {
        return List.of();
    }

    @Override
    public List<JobReminderResponse> getRemindersByApplicationId(Long applicationId) {
        return List.of();
    }

    @Override
    public JobReminderResponse updateReminder(Long reminderId, JobReminderRequest request) {
        return null;
    }

    @Override
    public JobReminderResponse markReminderAsCompleted(Long reminderId) {
        return null;
    }

    @Override
    public JobReminderResponse markReminderAsIncomplete(Long reminderId) {
        return null;
    }

    @Override
    public void deleteReminder(Long reminderId) {

    }

    @Override
    public List<JobReminderResponse> getPendingReminders() {
        return List.of();
    }

    @Override
    public List<JobReminderResponse> getUpcomingReminders() {
        return List.of();
    }
}
