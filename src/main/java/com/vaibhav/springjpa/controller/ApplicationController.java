package com.vaibhav.springjpa.controller;

import com.vaibhav.springjpa.entity.Application;
import com.vaibhav.springjpa.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/api/applicants/{applicantId}/application")
    public ResponseEntity<Application> createApplication(@PathVariable Long applicantId, @RequestBody Application application){
        return ResponseEntity.ok(applicationService.saveApplication(applicantId, application));
    }
}
