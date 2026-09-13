package com.job_tracker.Dto.Request;

import com.job_tracker.Enums.WorkMode;

public record ProfileRequest(String headline,
                             String summary,
                             Integer yearsOfExperience,
                             String currentCompany,
                             String currentTitle,
                             String preferredLocation,
                             WorkMode preferredWorkMode,
                             Double expectedSalary,
                             String linkedinUrl,
                             String githubUrl,
                             String portfolioUrl) {
}
