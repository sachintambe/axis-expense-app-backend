package com.ex.service;

import java.util.List;

import com.ex.model.User;



public interface UserService {
	User getUserByMobileNumber(long mobileNumber);
	List<User> getUsers();
	void addUser(User user);
	void deleteUserByMobileNumber(long mobileNumber);
	void updateUser(long mobileNumber, User user);
}
