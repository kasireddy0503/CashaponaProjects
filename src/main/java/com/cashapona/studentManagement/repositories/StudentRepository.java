package com.cashapona.studentManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cashapona.studentManagement.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
