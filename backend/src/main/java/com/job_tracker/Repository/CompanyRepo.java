package com.job_tracker.Repository;

import com.job_tracker.Entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends JpaRepository<CompanyEntity, Long> {
}
