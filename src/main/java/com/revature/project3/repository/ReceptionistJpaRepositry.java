package com.revature.project3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.project3.model.Receptionist;

@Repository
public interface ReceptionistJpaRepositry extends JpaRepository<Receptionist,Integer>{
	
}
