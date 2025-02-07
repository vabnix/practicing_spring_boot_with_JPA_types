package com.vaibhav.springjpa.controller;

import com.vaibhav.springjpa.entity.Resume;
import com.vaibhav.springjpa.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @PostMapping("/api/applicants/{applicantId}/resume")
    public ResponseEntity<?> addResume(@PathVariable Long applicantId, @RequestBody Resume resume){
        return ResponseEntity.ok(resumeService.addResume(applicantId, resume));
    }
}
