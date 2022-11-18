package com.cashapona.studentManagement.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashapona.studentManagement.entities.Parent;
import com.cashapona.studentManagement.repositories.ParentRepository;

@Service
public class ParentServiceImpl implements ParentService {

	@Autowired
	private ParentRepository parentRepository;
	@Override
	public void saveAllRelatedParents(List<Parent> parents) {
		
		parentRepository.saveAll(parents);
	}

}
