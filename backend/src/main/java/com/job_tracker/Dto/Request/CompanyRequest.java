package com.job_tracker.Dto.Request;

public record CompanyRequest(String name,
                             String website,
                             String industry,
                             String location,
                             boolean isActive) {
}
