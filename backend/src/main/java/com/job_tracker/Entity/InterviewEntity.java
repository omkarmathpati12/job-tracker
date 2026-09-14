package com.job_tracker.Entity;

import com.job_tracker.Enums.InterviewResult;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InterviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long interviewId;
    @ManyToOne
    @JoinColumn(name = "application_id", nullable = false)
    private JobApplicationEntity jobApplication;

    @CreationTimestamp
    private LocalDateTime interviewDate;
    @Enumerated(EnumType.STRING)
    private InterviewResult interviewResult;
}
