package com.job_tracker.Service;

import com.job_tracker.Dto.Request.UserRequest;
import com.job_tracker.Dto.Response.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest userRequest);
    UserResponse updateUser(UserRequest userRequest,Long userId);
    String deleteUser(Long userId);
    UserResponse getUserById(Long userId);
    List<UserResponse> getAllUsers();
}
