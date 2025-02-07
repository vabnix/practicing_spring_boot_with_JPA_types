package com.vaibhav.springjpa.service;

import com.vaibhav.springjpa.entity.Applicant;
import com.vaibhav.springjpa.entity.Resume;
import com.vaibhav.springjpa.repository.ApplicantRepository;
import com.vaibhav.springjpa.repository.ResumeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    @Autowired
    private ApplicantRepository applicantRepository;

    public Resume addResume(Long applicantId, Resume resume) {
        Optional<Applicant> applicantData = applicantRepository.findById(applicantId);
        if(applicantData.isPresent()){
            Applicant applicant = applicantData.get();
            resume.setApplicant(applicant);
            return resumeRepository.save(resume);
        } else {
            throw new EntityNotFoundException("Applicant Id not found : "+ applicantId);
        }

    }
}
