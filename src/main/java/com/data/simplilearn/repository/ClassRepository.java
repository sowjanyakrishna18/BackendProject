package com.data.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.simplilearn.entity.Class;

@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {

}
