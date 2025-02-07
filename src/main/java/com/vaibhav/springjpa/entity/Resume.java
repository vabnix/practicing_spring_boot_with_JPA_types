package com.vaibhav.springjpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resume_seq_gen")
    @SequenceGenerator(
            name = "resume_seq_gen",
            sequenceName = "resume_seq",
            allocationSize = 1
    )
    private Long Id;

    private String content;

    @OneToOne
    @JoinColumn(name = "applicationId", nullable = false)
    @JsonIgnore
    private Applicant applicant;
}
