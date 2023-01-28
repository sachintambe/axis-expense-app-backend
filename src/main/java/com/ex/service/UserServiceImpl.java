package com.ex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.exception.UserNotFoundException;
import com.ex.model.User;
import com.ex.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userrepository;
	
	@Override
	public User getUserByMobileNumber(long mobileNumber) {
		// TODO Auto-generated method stub
		Optional<User>userOpt=userrepository.findByMobileNumber(mobileNumber);
		 if(!userOpt.isPresent())
	            throw new UserNotFoundException("Person not found with person mobile number "+mobileNumber);
	        
	        return userOpt.get();
		
//		return userrepository.findById(id).get();
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return (List<User>)userrepository.findAll();
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userrepository.save(user);
	}

	@Override
	public void deleteUserByMobileNumber(long mobileNumber) {
		// TODO Auto-generated method stub
		userrepository.deleteByMobileNumber(mobileNumber);
	}

	@Override
	public void updateUser(long mobileNumber, User user) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void updateUser(int id, User user) {
//		// TODO Auto-generated method stub
//		
//	}

}
