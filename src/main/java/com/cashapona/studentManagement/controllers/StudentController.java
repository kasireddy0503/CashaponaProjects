package com.cashapona.studentManagement.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cashapona.studentManagement.entities.Parent;
import com.cashapona.studentManagement.entities.Student;
import com.cashapona.studentManagement.requestResponses.StudentParentRequest;
import com.cashapona.studentManagement.services.ParentService;
import com.cashapona.studentManagement.services.StudentService;

@RestController
@RequestMapping("/api/p2/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private ParentService parentService;
	
	@PostMapping("/saveAll")
	public ResponseEntity saveAllDetails(@RequestBody StudentParentRequest stpdReq)
	{
		Student student = new Student();
		BeanUtils.copyProperties(stpdReq, student);
		student = studentService.saveStudent(student);
		List<Parent> parents =stpdReq.getParentsList();
		Integer studentId =student.getStudentId();
		parents.forEach(parent->parent.setStudentId(studentId));
		parentService.saveAllRelatedParents(parents);
		
		return ResponseEntity.status(HttpStatus.OK).body("Saved Details Successfully");
	
	}

}
