package com.job_tracker.Entity;

import com.job_tracker.Enums.WorkMode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private UserEntity user;

    private String headline;

    @Column(columnDefinition = "TEXT")
    private String summary;

    private Integer yearsOfExperience;

    private String currentCompany;

    private String currentTitle;

    private String preferredLocation;

    @Enumerated(EnumType.STRING)
    private WorkMode preferredWorkMode;

    private Double expectedSalary;

    private String linkedinUrl;

    private String githubUrl;

    private String portfolioUrl;
}
