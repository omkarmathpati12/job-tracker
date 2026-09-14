package com.job_tracker.Repository;

import com.job_tracker.Entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepo extends JpaRepository<CompanyEntity, Long> {

    List<CompanyEntity> findCompanyByLocation(String location);
    Optional<CompanyEntity> findCompanyByName(String name);
    List<CompanyEntity> findCompanyByIndustry(String industry);
}
