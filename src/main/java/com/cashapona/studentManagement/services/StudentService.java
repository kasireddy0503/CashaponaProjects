package com.cashapona.studentManagement.services;

import com.cashapona.studentManagement.entities.Student;
import com.cashapona.studentManagement.requestResponses.StudentParentRequest;

public interface StudentService {

	

	Student saveStudent(StudentParentRequest stpdReq);

}
