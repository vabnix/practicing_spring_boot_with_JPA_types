package com.vaibhav.springjpa.mapper;

import com.vaibhav.springjpa.dto.ApplicantDto;
import com.vaibhav.springjpa.entity.Applicant;

import java.util.ArrayList;
import java.util.List;

public class ApplicantMapper {

    public ApplicantDto entityToDtoMapper(Applicant applicant){
        ApplicantDto applicantDto = new ApplicantDto();
        applicantDto.setId(applicant.getId());
        applicantDto.setFirst_name(applicant.getFirst_name());
        applicantDto.setLast_name(applicant.getLast_name());
        applicantDto.setEmail_address(applicant.getEmail_address());
        applicantDto.setActive(applicant.getActive());
        return applicantDto;
    }

    public Applicant dtoToEntityMapper(ApplicantDto applicantDto){
        Applicant applicant = new Applicant();
        applicant.setId(applicantDto.getId());
        applicant.setFirst_name(applicantDto.getFirst_name());
        applicant.setLast_name(applicantDto.getLast_name());
        applicant.setEmail_address(applicantDto.getEmail_address());
        applicant.setActive(applicant.getActive());
        return applicant;
    }

    public List<ApplicantDto> entityToDtoListMapper(List<Applicant> applicantList){
        List<ApplicantDto> applicantDtoList = new ArrayList<>();
        for (Applicant applicant: applicantList){
            ApplicantDto applicantDto = new ApplicantDto();
            applicantDto.setId(applicant.getId());
            applicantDto.setFirst_name(applicant.getFirst_name());
            applicantDto.setLast_name(applicant.getLast_name());
            applicantDto.setEmail_address(applicant.getEmail_address());
            applicantDto.setActive(applicant.getActive());
            applicantDtoList.add(applicantDto);
        }
        return applicantDtoList;
    }

    public List<Applicant> dtoToEntityListMapper(List<ApplicantDto> applicantDtoList){
        List<Applicant> applicantList = new ArrayList<>();
        for (ApplicantDto applicantDto: applicantDtoList){
            Applicant applicant = new Applicant();
            applicant.setId(applicantDto.getId());
            applicant.setFirst_name(applicantDto.getFirst_name());
            applicant.setLast_name(applicantDto.getLast_name());
            applicant.setEmail_address(applicantDto.getEmail_address());
            applicant.setActive(applicant.getActive());
            applicantList.add(applicant);
        }
        return applicantList;
    }
}
