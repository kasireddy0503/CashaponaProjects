package com.harsha.studentManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harsha.studentManagement.domain.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
