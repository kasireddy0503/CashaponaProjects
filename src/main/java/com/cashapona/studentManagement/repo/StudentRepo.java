package com.cashapona.studentManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cashapona.studentManagement.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
