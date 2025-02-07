package com.vaibhav.springjpa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "applicants")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "applicant_sequence")
    @SequenceGenerator(
            name = "applicant_sequence",
            sequenceName = "applicant_seq",
            initialValue = 1,
            allocationSize = 1
    )
    private Long id;
    @Column(name = "first_name")  // maps to database column first_name
    private String firstName;      // camelCase in Java

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "status")
    private String status;

    @OneToOne(mappedBy = "applicant", cascade = CascadeType.ALL)
    private Resume resume;
}
