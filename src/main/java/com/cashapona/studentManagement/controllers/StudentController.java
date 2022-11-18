package com.cashapona.studentManagement.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cashapona.studentManagement.entities.Student;
import com.cashapona.studentManagement.requestResponses.StudentParentRequest;
import com.cashapona.studentManagement.services.StudentService;

@RestController
@RequestMapping("/api/p2/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/saveAll")
	public ResponseEntity<String> saveAllDetails(@RequestBody StudentParentRequest stpdReq)
	{
		Student student = studentService.saveStudent(stpdReq);
		if(student!=null)
		{
		return ResponseEntity.status(HttpStatus.OK).body("Saved Details Successfully");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Student Details not saved");
		}
	}

}
