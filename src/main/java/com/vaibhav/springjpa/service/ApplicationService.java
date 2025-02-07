package com.vaibhav.springjpa.service;

import com.vaibhav.springjpa.entity.Applicant;
import com.vaibhav.springjpa.entity.Application;
import com.vaibhav.springjpa.repository.ApplicantRepository;
import com.vaibhav.springjpa.repository.ApplicationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private ApplicantRepository applicantRepository;

    public ApplicationService(ApplicationRepository applicationRepository, ApplicantRepository applicantRepository) {
        this.applicationRepository = applicationRepository;
        this.applicantRepository = applicantRepository;
    }

    public Application saveApplication(Long applicantId, Application application) {

        Optional<Applicant> applicant = applicantRepository.findById(applicantId);
        if(applicant.isPresent()){
            Applicant applicant1 = applicant.get();
            application.setApplicant(applicant1);
            return applicationRepository.save(application);
        }
        else {
            throw new EntityNotFoundException("Applicant not found with id : "+ applicantId);
        }
    }
}
