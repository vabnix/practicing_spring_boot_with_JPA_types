package com.vaibhav.springjpa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String content;

    @OneToOne
    @JoinColumn(name = "applicationId", nullable = false)
    private Applicant applicant;
}
