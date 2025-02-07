package com.vaibhav.springjpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "application_sequence")
    @SequenceGenerator(
            name = "application_sequence",
            sequenceName = "application_seq",
            initialValue = 1,
            allocationSize = 1
    )
    private Long id;

    private String status;

    private String position;

    @ManyToOne
    @JoinColumn(name = "applicationId", nullable = false)
    @JsonIgnore
    private Applicant applicant;

}
