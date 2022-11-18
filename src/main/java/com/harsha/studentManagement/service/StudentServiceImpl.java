package com.harsha.studentManagement.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsha.studentManagement.domain.Student;
import com.harsha.studentManagement.dto.StudentDto;
import com.harsha.studentManagement.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo stdRepo;
	
	public Student saveStudent(StudentDto studentDto)
	{
		if(studentDto.getStudentId()!= null)
		{
		Optional<Student> student =stdRepo.findById(studentDto.getStudentId());
		
		if(student.isPresent())
		{
			Student presentStudent=student.get();
			BeanUtils.copyProperties(studentDto, presentStudent);
			presentStudent=stdRepo.save(presentStudent);
			return presentStudent;
			 
		}
		}
		
		Student student1 = new Student();
		BeanUtils.copyProperties(studentDto, student1);
		student1 = stdRepo.save(student1);
		return student1;
		
		
	}

	
	public StudentDto getStudent(Integer studentId) {
		Optional<Student> student =stdRepo.findById(studentId);
		if(student.isPresent())
		{
			Student savedStudent= student.get();
			StudentDto studentDto = new StudentDto();
			BeanUtils.copyProperties(savedStudent,studentDto);
			return studentDto;
		}
		return new StudentDto();
	}


	public List<StudentDto> getAllStudents() {
		
		List<Student> studentList =stdRepo.findAll();
		
		ModelMapper modelMapper = new ModelMapper();
		
	
		@SuppressWarnings("unchecked")
		List<StudentDto> studentDtoList = modelMapper.map(studentList, ArrayList.class);
		
		return studentDtoList;
	}


	public void deleteStudent(Integer sId) {

		stdRepo.deleteById(sId);
		
	}


	
}
