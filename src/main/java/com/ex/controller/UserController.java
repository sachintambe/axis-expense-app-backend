package com.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex.model.User;
import com.ex.service.UserService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{mobileNumber}")
	public User getUserByMobileNumber(@PathVariable long mobileNumber) {
		return userService.getUserByMobileNumber(mobileNumber);
		
	}
	
	@GetMapping("/user")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user){
		userService.addUser(user);
		return new ResponseEntity<String>("User added successfully...",HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{mobileNumber}")
	public ResponseEntity<String> deleteUserByMobileNumber(@PathVariable long mobileNumber){
		userService.deleteUserByMobileNumber(mobileNumber);
		return new ResponseEntity<String>("User deleted successfully...",HttpStatus.OK);
	}
	
	
}
