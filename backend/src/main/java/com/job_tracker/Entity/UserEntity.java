package com.job_tracker.Entity;

import com.job_tracker.Enums.Role;
import com.job_tracker.Enums.UserStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String location;
    @Lob
    private byte[] profile;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToOne
    private ProfileEntity profileEntity;
    @OneToMany
    @JoinColumn(name = "application_id",nullable = false)
    private List<JobApplicationEntity> applications;
}
