package com.job_tracker.Entity;

import com.job_tracker.Enums.ApplicationStatus;
import com.job_tracker.Enums.JobType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;
    private String jobTitle;
    @Enumerated(EnumType.STRING)
    private ApplicationStatus  applicationStatus;
    private LocalDate appliedDate;
    @Enumerated(EnumType.STRING)
    private JobType jobType;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private CompanyEntity company;

    @OneToMany(mappedBy = "jobApplication")
    private List<InterviewEntity> interviews=new ArrayList<>();

    @OneToMany(mappedBy = "jobApplication")
    private List<JobReminderEntity> reminders;



}
