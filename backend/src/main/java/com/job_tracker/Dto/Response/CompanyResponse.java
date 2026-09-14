package com.job_tracker.Dto.Response;

import com.job_tracker.Enums.CompanyStatus;

public record CompanyResponse(Long cId,
                              String name,
                              String website,
                              String industry,
                              String location,
                              CompanyStatus status) {
}
