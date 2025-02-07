package com.vaibhav.springjpa.repository;

import com.vaibhav.springjpa.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {


    List<Applicant> findAllByOrderByFirstNameAsc();

    List<Applicant> findAllByOrderByLastNameAsc();
}
