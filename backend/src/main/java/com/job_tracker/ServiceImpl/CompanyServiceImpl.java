package com.job_tracker.ServiceImpl;

import com.job_tracker.Dto.Request.CompanyRequest;
import com.job_tracker.Dto.Response.CompanyResponse;
import com.job_tracker.Entity.CompanyEntity;
import com.job_tracker.Enums.CompanyStatus;
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
        CompanyEntity companyEntity=companyRepo.save(company);
        return companyMapper.toResponse(companyEntity);
    }

    @Override
    public CompanyResponse updateCompany(CompanyRequest companyRequest, Long cId) {
        CompanyEntity company=companyRepo.findById(cId)
                .orElseThrow(()-> new  ResourceNotFoundException("Company not found by this ID",cId));
        companyMapper.toEntity(companyRequest);
        CompanyEntity companyEntity=companyRepo.save(company);
        return companyMapper.toResponse(companyEntity);
    }

    @Override
    public void deleteCompany(Long cId) {
        CompanyEntity company=companyRepo.findById(cId)
                .orElseThrow(()-> new  ResourceNotFoundException("Company not found  by this ID",cId));
        company.setStatus(CompanyStatus.INACTIVE);
        companyRepo.save(company);
    }

    @Override
    public CompanyResponse getCompany(Long cId) {
        CompanyEntity company=companyRepo.findById(cId)
                .orElseThrow(()-> new  ResourceNotFoundException("Company not found by this ID",cId));

        return companyMapper.toResponse(company);
    }

    @Override
    public List<CompanyResponse> getCompanies() {

        List<CompanyEntity> company=companyRepo.findAll();
        return company.stream()
                .map(companyMapper::toResponse)
                .toList();
    }

    @Override
    public CompanyResponse getCompanyByName(String name) {

        CompanyEntity company=companyRepo.findCompanyByName(name)
                .orElseThrow(()-> new  ResourceNotFoundException("Company not found  by name",name));
        return companyMapper.toResponse(company);
    }

    @Override
    public List<CompanyResponse> getCompanyByIndustry(String industry) {
        List<CompanyEntity> company=companyRepo.findCompanyByIndustry(industry);
        if(company.isEmpty()){
            throw new ResourceNotFoundException("No company found for industry {} ",industry);
        }
        return company.stream()
                .map(companyMapper::toResponse)
                .toList();
    }

    @Override
    public List<CompanyResponse> getCompanyByLocation(String location) {
        List<CompanyEntity> company=companyRepo.findCompanyByLocation(location);
        if(company.isEmpty()){
            throw new ResourceNotFoundException("Company not found for location {}",location);
        }

        return company.stream()
                .map(companyMapper::toResponse)
                .toList();
    }
}
