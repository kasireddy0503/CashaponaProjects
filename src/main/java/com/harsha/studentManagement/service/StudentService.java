package com.harsha.studentManagement.service;

import java.util.List;

import com.harsha.studentManagement.domain.Student;
import com.harsha.studentManagement.dto.StudentDto;


public interface StudentService {

	public Student saveStudent(StudentDto studentDto);
	
	public StudentDto getStudent(Integer sId);
	
	public List<StudentDto> getAllStudents();
	
	public void deleteStudent(Integer sId);
	
}
