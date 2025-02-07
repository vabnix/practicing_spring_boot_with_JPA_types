package com.vaibhav.springjpa.repository;

import com.vaibhav.springjpa.entity.Applicant;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantPagingAndSortingListRepository extends ListPagingAndSortingRepository<Applicant, Long> {
}
