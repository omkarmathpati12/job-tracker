package com.job_tracker.Service;

import com.job_tracker.Dto.Request.ProfileRequest;
import com.job_tracker.Dto.Response.ProfileResponse;

public interface ProfileService {

    ProfileResponse createProfile(ProfileRequest profileRequest);
    ProfileResponse updateProfile(ProfileRequest profileRequest,Long profileId);
    ProfileResponse deleteProfile(Long  profileId);
    ProfileResponse getProfileById(Long profileId);
    ProfileResponse getProfileByUserId(Long userId);
}
