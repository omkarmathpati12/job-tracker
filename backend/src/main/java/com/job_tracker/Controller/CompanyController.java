package com.job_tracker.Controller;

import com.job_tracker.Dto.Request.CompanyRequest;
import com.job_tracker.Dto.Response.ApiResponse;
import com.job_tracker.ServiceImpl.CompanyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {
    private final CompanyServiceImpl companyService;

    @PostMapping
    public ResponseEntity<?> createCompany(@RequestBody CompanyRequest companyRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(companyService.createCompany(companyRequest));
    }

    @GetMapping("/{cId}")
    public ResponseEntity<?> getCompany(@PathVariable("cId") Long cId){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.getCompany(cId));
    }

    @DeleteMapping("/{cId}")
    public ResponseEntity<ApiResponse> deleteCompany(@PathVariable Long cId) {
        companyService.deleteCompany(cId);
        return ResponseEntity.ok(new ApiResponse(true,"Company deleted sucessfully"));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllCompanies(){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.getCompanies());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> getCompanyByName(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.getCompanyByName(name));
    }

    @PutMapping("/{cId}")
    public ResponseEntity<?> updateCompany(@RequestBody CompanyRequest companyRequest,@PathVariable Long cId) {
        return ResponseEntity.status(HttpStatus.OK).body(companyService.updateCompany(companyRequest,cId));
    }

    @GetMapping("/industry/{industry}")
    public ResponseEntity<?> getCompanyByIndustry(@PathVariable String industry){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.getCompanyByIndustry(industry));
    }

    @GetMapping("/location/{location}")
    public ResponseEntity<?> getCompanyByLocation(@PathVariable String location){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.getCompanyByLocation(location));
    }

}
