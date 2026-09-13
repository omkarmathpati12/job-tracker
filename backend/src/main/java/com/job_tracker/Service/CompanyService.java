package com.job_tracker.Service;

import com.job_tracker.Dto.Request.CompanyRequest;
import com.job_tracker.Dto.Response.CompanyResponse;

import java.util.List;

public interface CompanyService {

    CompanyResponse createCompany(CompanyRequest companyRequest);
    CompanyResponse updateCompany(CompanyRequest companyRequest,Long cId);
    void deleteCompany(Long cId);
    CompanyResponse getCompany(Long cId);
    List<CompanyResponse> getCompanies();
    CompanyResponse getCompanyByName(String name);
    List<CompanyResponse> getCompanyByIndustry(String industry);
    List<CompanyResponse> getCompanyByLocation(String location);
}
