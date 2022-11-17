package com.cashapona.studentManagement.controllers;

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
import com.cashapona.studentManagement.service.ParentService;
import com.cashapona.studentManagement.service.StudentService;

@RestController
@RequestMapping("api/v2/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private ParentService  parentService;
	
	@PostMapping("/saveAllDetails")
	public ResponseEntity saveAllDetails(@RequestBody StudentParentRequest stdPtRequest)
	{

		Student student = new Student();
		BeanUtils.copyProperties(stdPtRequest, student);
		student = studentService.saveStudent(student);
		Parent parent = new Parent();
		BeanUtils.copyProperties(stdPtRequest, parent);
		parent.setStudentId(student.getStudentId());
		parentService.saveParentDetails(parent);
		
		return ResponseEntity.status(HttpStatus.OK).body("Saved Details Successfully");
		
		
	}

}
