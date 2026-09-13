package com.job_tracker.Repository;

import com.job_tracker.Entity.InterviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepo extends JpaRepository<InterviewEntity, Long> {
}
