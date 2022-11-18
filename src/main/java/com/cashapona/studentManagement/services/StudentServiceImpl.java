package com.cashapona.studentManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashapona.studentManagement.entities.Student;
import com.cashapona.studentManagement.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		Student savedStudent = studentRepository.save(student);
		return savedStudent;
	}

}
