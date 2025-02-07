package com.vaibhav.springjpa.controller;

import com.vaibhav.springjpa.dto.ApplicantDto;
import com.vaibhav.springjpa.service.ApplicantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/applicants", produces = "application/json")
@Slf4j
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping
    public List<ApplicantDto> getAllApplicants(){
        log.info("Request received to get all applicants information");
        return applicantService.getAllApplicants();
    }

    @PostMapping
    public ResponseEntity<?> saveApplicant(@RequestBody ApplicantDto applicantDto){
        return applicantService.addApplicants(applicantDto);
    }

    @GetMapping("/{id}")
    public ApplicantDto getApplicantById(@PathVariable Long id){
        return applicantService.getApplicantById(id);
    }
}
