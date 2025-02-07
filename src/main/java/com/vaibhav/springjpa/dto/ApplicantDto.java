package com.vaibhav.springjpa.dto;

import com.vaibhav.springjpa.entity.Application;
import com.vaibhav.springjpa.entity.Resume;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ApplicantDto {
    @Id
    private Long id; // maps to database column first_name
    private String firstName;      // camelCase in Java
    private String lastName;
    private String emailAddress;
    private String status;
    private Resume resume;
    private List<Application> applications = new ArrayList<>();
}
