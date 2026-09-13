package com.job_tracker.Controller;

import com.job_tracker.Dto.Response.ApiResponse;
import com.job_tracker.ServiceImpl.CompanyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {
    private final CompanyServiceImpl companyService;

    @DeleteMapping("/{cId}")
    public ResponseEntity<ApiResponse> deleteCompany(@PathVariable Long cId) {
        companyService.deleteCompany(cId);
        return ResponseEntity.ok(new ApiResponse(true,"Company deleted sucessfully"));
    }
}
