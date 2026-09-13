package com.job_tracker.Repository;

import com.job_tracker.Entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepo extends JpaRepository<ProfileEntity, Long> {
}
