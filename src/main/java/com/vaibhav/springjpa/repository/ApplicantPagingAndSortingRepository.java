package com.vaibhav.springjpa.repository;

import com.vaibhav.springjpa.entity.Applicant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantPagingAndSortingRepository extends PagingAndSortingRepository<Applicant, Long> {
}
