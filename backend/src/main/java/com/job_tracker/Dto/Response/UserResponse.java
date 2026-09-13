package com.job_tracker.Dto.Response;

import com.job_tracker.Enums.Role;
import com.job_tracker.Enums.UserStatus;
import jakarta.persistence.Lob;

import java.time.LocalDateTime;

public record UserResponse(Long userId,
                           String firstName,
                           String lastName,
                           String email,
                           String phoneNumber,
                           String location,
                           byte[] profile,
                           UserStatus userStatus,
                           Role role,
                           LocalDateTime createdAt,
                           LocalDateTime updatedAt) {
}
