package com.ex.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ex.model.Trip;

@Repository
public interface TripRepository extends CrudRepository<Trip,Integer>{

	

//	void deleteByMobileNumber(long mobileNumber);
//
//	Optional<Trip> findByMobileNumber(long mobileNumber);

	
//	Trip findByName(String name);

	

	

	
}
