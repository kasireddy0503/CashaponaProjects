package com.cashapona.studentManagement.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashapona.studentManagement.entities.Parent;
import com.cashapona.studentManagement.entities.Student;
import com.cashapona.studentManagement.repositories.ParentRepository;
import com.cashapona.studentManagement.repositories.StudentRepository;
import com.cashapona.studentManagement.requestResponses.ParentDto;
import com.cashapona.studentManagement.requestResponses.StudentParentRequest;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ParentRepository parentRepository;
	
	@Override
	public Student saveStudent(StudentParentRequest stpdReq) {
		
		
		Student student = new Student();
		BeanUtils.copyProperties(stpdReq, student);
		student = studentRepository.save(student);
		List<Parent> parents =new ArrayList<>();
		for(ParentDto parent :stpdReq.getParentsList())
		{
			Parent parentObj = new Parent();
			BeanUtils.copyProperties(parent, parentObj);
			parentObj.setStudentId(student.getStudentId());
			parents.add(parentObj);
		}
		
		parentRepository.saveAll(parents);
		
		return student;
	}
}
