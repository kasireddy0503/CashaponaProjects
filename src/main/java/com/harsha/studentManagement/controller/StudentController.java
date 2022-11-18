package com.harsha.studentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harsha.studentManagement.dto.StudentDto;
import com.harsha.studentManagement.service.StudentService;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
	
	@Autowired
	private StudentService stdService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent1(@RequestBody StudentDto studentDto)
	{
		stdService.saveStudent( studentDto);
		return ResponseEntity.status(HttpStatus.OK).body("Student details saved Successfully");
		
	}
	
	@GetMapping("/getStudent/{studentId}")
	public StudentDto getOneStudent(@PathVariable Integer studentId) 
	{
		StudentDto studentDto =stdService.getStudent(studentId);
		
		return studentDto;
	}
	
	@DeleteMapping("/deleteStudent/{studentId}")
	public void deleteOneStudent(@PathVariable Integer studentId)
	{
		stdService.deleteStudent(studentId);
		
	}

	@GetMapping("/getAll")
	public List<StudentDto> getAllStudents() {

		List<StudentDto> students=stdService.getAllStudents();
		return students;

	}
	
	
}
