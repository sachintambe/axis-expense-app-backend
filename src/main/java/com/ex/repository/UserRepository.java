package com.ex.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ex.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

	Optional<User> findByMobileNumber(long mobileNumber);

	void deleteByMobileNumber(long mobileNumber);

	

}
