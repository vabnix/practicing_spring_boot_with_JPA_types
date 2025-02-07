package com.vaibhav.springjpa.dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ApplicantDto {
    @Id
    private Long id; // maps to database column first_name
    private String firstName;      // camelCase in Java
    private String lastName;
    private String emailAddress;
    private String active;
}
