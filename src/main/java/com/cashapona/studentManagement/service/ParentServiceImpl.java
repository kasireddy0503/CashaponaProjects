package com.cashapona.studentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashapona.studentManagement.entities.Parent;
import com.cashapona.studentManagement.repo.ParentRepo;

@Service
public class ParentServiceImpl implements ParentService {

	@Autowired
	private ParentRepo parentRepo;

	@Override
	public Parent saveParentDetails(Parent parent) {
	
		parent =parentRepo.save(parent);
		return parent;
	}
	
	 
}
