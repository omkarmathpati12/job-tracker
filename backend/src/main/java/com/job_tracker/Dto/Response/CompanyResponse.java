package com.job_tracker.Dto.Response;

public record CompanyResponse(Long cId,
                              String name,
                              String website,
                              String industry,
                              String location) {
}
