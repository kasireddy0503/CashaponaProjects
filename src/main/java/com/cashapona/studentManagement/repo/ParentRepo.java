package com.cashapona.studentManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashapona.studentManagement.entities.Parent;

public interface ParentRepo extends JpaRepository<Parent, Integer> {

}
