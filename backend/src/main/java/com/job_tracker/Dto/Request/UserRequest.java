package com.job_tracker.Dto.Request;

import com.job_tracker.Enums.Role;
import com.job_tracker.Enums.UserStatus;
import jakarta.persistence.Lob;

public record UserRequest(String firstName,
                          String lastName,
                          String email,
                          String password,
                          String phoneNumber,
                          String location,
                          byte[] profile,
                          UserStatus userStatus,
                          Role role) {
}
