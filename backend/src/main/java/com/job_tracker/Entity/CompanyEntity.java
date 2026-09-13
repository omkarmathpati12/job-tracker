package com.job_tracker.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cId;
    private String name;
    private String website;
    private String industry;
    private String location;
    private boolean isActive;
    @OneToMany(mappedBy = "company")
    private List<JobApplicationEntity> applications;
}
