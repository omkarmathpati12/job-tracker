package com.job_tracker.ServiceImpl;

import com.job_tracker.Dto.Request.ProfileRequest;
import com.job_tracker.Dto.Response.ProfileResponse;
import com.job_tracker.Service.ProfileService;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Override
    public ProfileResponse createProfile(ProfileRequest profileRequest) {
        return null;
    }

    @Override
    public ProfileResponse updateProfile(ProfileRequest profileRequest, Long profileId) {
        return null;
    }

    @Override
    public ProfileResponse deleteProfile(Long profileId) {
        return null;
    }

    @Override
    public ProfileResponse getProfileById(Long profileId) {
        return null;
    }

    @Override
    public ProfileResponse getProfileByUserId(Long userId) {
        return null;
    }
}
