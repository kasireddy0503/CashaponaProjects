package com.cashapona.studentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashapona.studentManagement.entities.Student;
import com.cashapona.studentManagement.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		
		 student = studentRepo.save(student);
		
		return student;
	}

}
