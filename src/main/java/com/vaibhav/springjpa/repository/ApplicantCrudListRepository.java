package com.vaibhav.springjpa.repository;

import com.vaibhav.springjpa.entity.Applicant;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantCrudListRepository extends ListCrudRepository<Applicant, Long> {
}
