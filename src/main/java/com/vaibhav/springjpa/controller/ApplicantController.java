package com.vaibhav.springjpa.controller;

import com.vaibhav.springjpa.dto.ApplicantDto;
import com.vaibhav.springjpa.dto.PageResponseDto;
import com.vaibhav.springjpa.entity.Applicant;
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

    @GetMapping("/page")
    public PageResponseDto<Applicant> getPageData(@RequestParam(defaultValue = "0") int page,
                                                  @RequestParam(defaultValue = "2") int size){
        return applicantService.getAllApplicantsByPageAndSize(page, size);
    }

    @GetMapping("/order")
    public List<Applicant> orderByName(@RequestParam String type){
        return switch (type) {
            case "firstName" -> applicantService.getApplicantOrderByFirstName();
            case "lastName" -> applicantService.getApplicantOrderByLastName();
            default -> null;
        };
    }
}
