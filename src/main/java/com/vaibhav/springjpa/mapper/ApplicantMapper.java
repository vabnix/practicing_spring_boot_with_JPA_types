package com.vaibhav.springjpa.mapper;

import com.vaibhav.springjpa.dto.ApplicantDto;
import com.vaibhav.springjpa.entity.Applicant;

import java.util.ArrayList;
import java.util.List;

public class ApplicantMapper {

    public ApplicantDto entityToDtoMapper(Applicant applicant){
        ApplicantDto applicantDto = new ApplicantDto();
        applicantDto.setId(applicant.getId());
        applicantDto.setFirstName(applicant.getFirstName());
        applicantDto.setLastName(applicant.getLastName());
        applicantDto.setEmailAddress(applicant.getEmailAddress());
        applicantDto.setStatus(applicant.getStatus());
        return applicantDto;
    }

    public Applicant dtoToEntityMapper(ApplicantDto applicantDto){
        Applicant applicant = new Applicant();
        applicant.setId(applicantDto.getId());
        applicant.setFirstName(applicantDto.getFirstName());
        applicant.setLastName(applicantDto.getLastName());
        applicant.setEmailAddress(applicantDto.getEmailAddress());
        applicant.setStatus(applicant.getStatus());
        return applicant;
    }

    public List<ApplicantDto> entityToDtoListMapper(List<Applicant> applicantList){
        List<ApplicantDto> applicantDtoList = new ArrayList<>();
        for (Applicant applicant: applicantList){
            ApplicantDto applicantDto = new ApplicantDto();
            applicantDto.setId(applicant.getId());
            applicantDto.setFirstName(applicant.getFirstName());
            applicantDto.setLastName(applicant.getLastName());
            applicantDto.setEmailAddress(applicant.getEmailAddress());
            applicantDto.setStatus(applicant.getStatus());
            applicantDtoList.add(applicantDto);
        }
        return applicantDtoList;
    }

    public List<Applicant> dtoToEntityListMapper(List<ApplicantDto> applicantDtoList){
        List<Applicant> applicantList = new ArrayList<>();
        for (ApplicantDto applicantDto: applicantDtoList){
            Applicant applicant = new Applicant();
            applicant.setId(applicantDto.getId());
            applicant.setFirstName(applicantDto.getFirstName());
            applicant.setLastName(applicantDto.getLastName());
            applicant.setEmailAddress(applicantDto.getEmailAddress());
            applicant.setStatus(applicant.getStatus());
            applicantList.add(applicant);
        }
        return applicantList;
    }
}
