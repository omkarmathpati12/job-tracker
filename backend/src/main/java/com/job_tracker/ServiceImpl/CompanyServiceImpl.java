package com.job_tracker.ServiceImpl;

import com.job_tracker.Dto.Request.CompanyRequest;
import com.job_tracker.Dto.Response.CompanyResponse;
import com.job_tracker.Entity.CompanyEntity;
import com.job_tracker.Exceptions.ResourceNotFoundException;
import com.job_tracker.Mapper.CompanyMapper;
import com.job_tracker.Repository.CompanyRepo;
import com.job_tracker.Service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepo companyRepo;
    private final CompanyMapper companyMapper;

    @Override
    public CompanyResponse createCompany(CompanyRequest companyRequest) {

        CompanyEntity company=companyMapper.toEntity(companyRequest);
        company.setActive(true);
        CompanyEntity companyEntity=companyRepo.save(company);
        return companyMapper.toResponse(companyEntity);
    }

    @Override
    public CompanyResponse updateCompany(CompanyRequest companyRequest, Long cId) {
        CompanyEntity company=companyRepo.findById(cId)
                .orElseThrow(()-> new  ResourceNotFoundException("Company not found"));
        companyMapper.toEntity(companyRequest);
        CompanyEntity companyEntity=companyRepo.save(company);
        return companyMapper.toResponse(companyEntity);
    }

    @Override
    public void deleteCompany(Long cId) {
        CompanyEntity company=companyRepo.findById(cId)
                .orElseThrow(()-> new  ResourceNotFoundException("Company not found"));
        company.setActive(false);
        companyRepo.save(company);
    }

    @Override
    public CompanyResponse getCompany(Long cId) {
        return null;
    }

    @Override
    public List<CompanyResponse> getCompanies() {
        return List.of();
    }

    @Override
    public CompanyResponse getCompanyByName(String name) {
        return null;
    }

    @Override
    public List<CompanyResponse> getCompanyByIndustry(String industry) {
        return List.of();
    }

    @Override
    public List<CompanyResponse> getCompanyByLocation(String location) {
        return List.of();
    }
}
