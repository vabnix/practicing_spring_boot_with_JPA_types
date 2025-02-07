package com.vaibhav.springjpa.dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ApplicantDto {
    @Id
    private Long id;
    private String first_name;
    private String last_name;
    private String email_address;
    private String active;
}
