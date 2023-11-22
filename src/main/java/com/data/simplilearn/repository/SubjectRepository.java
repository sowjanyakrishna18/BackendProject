package com.data.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.simplilearn.entity.Subject;
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
