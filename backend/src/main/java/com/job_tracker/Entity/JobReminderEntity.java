package com.job_tracker.Entity;

import com.job_tracker.Enums.ReminderType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobReminderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobReminderId;
    @ManyToOne
    @JoinColumn(name = "application_id",nullable = false)
    private JobApplicationEntity jobApplication;
    private LocalDateTime reminderDate;
    @Enumerated(EnumType.STRING)
    private ReminderType reminderType;
    private boolean completed;
}
