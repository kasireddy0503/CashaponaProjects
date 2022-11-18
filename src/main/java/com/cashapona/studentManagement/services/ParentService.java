package com.cashapona.studentManagement.services;

import java.util.List;

import com.cashapona.studentManagement.entities.Parent;


public interface ParentService {

	void saveAllRelatedParents(List<Parent> parents);

}
