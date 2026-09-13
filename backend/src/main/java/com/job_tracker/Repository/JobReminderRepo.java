package com.job_tracker.Repository;

import com.job_tracker.Entity.JobReminderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobReminderRepo extends JpaRepository<JobReminderEntity, Long> {
}
