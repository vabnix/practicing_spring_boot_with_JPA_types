package com.vaibhav.springjpa.service;

import com.vaibhav.springjpa.dto.ApplicantDto;
import com.vaibhav.springjpa.entity.Applicant;
import com.vaibhav.springjpa.mapper.ApplicantMapper;
import com.vaibhav.springjpa.repository.ApplicantPagingAndSortingRepository;
import com.vaibhav.springjpa.repository.ApplicantRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;

    @Autowired
    private ApplicantPagingAndSortingRepository pagingAndSortingRepository;

    public List<ApplicantDto> getAllApplicants() {
        Iterable<Applicant> data = applicantRepository.findAll();
        List<Applicant> applicantList = new ArrayList<>();
        data.forEach(applicantList::add);
        return new ApplicantMapper().entityToDtoListMapper(applicantList);
    }

    public ResponseEntity<?> addApplicants(ApplicantDto applicantDto) {
        Applicant applicant = new ApplicantMapper().dtoToEntityMapper(applicantDto);
        applicantRepository.save(applicant);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ApplicantDto getApplicantById(Long id) {
        if(id != null){
            return applicantRepository.findById(id)
                    .map(applicant -> new ApplicantMapper().entityToDtoMapper(applicant))
                    .orElseThrow(() -> new EntityNotFoundException("Applicant Id not found : "+ id));
        }
        return null;
    }

    public Page<?> getApplicantWithPagination(int page, int size){
         return pagingAndSortingRepository.findAll(PageRequest.of(page,size));
    }
}
