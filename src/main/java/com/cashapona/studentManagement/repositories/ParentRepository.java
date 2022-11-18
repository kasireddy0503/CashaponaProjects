package com.cashapona.studentManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cashapona.studentManagement.entities.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Integer> {

}
