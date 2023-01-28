package com.ex.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="user")
public class User {
	
	    //id is automatically generated
	
	private String name;
	private String email;
	private String password;
	@Id
	private long mobileNumber;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn
//	private List<Expense> expenses;
	
	public User() {
	}
	
	public User(String name, String email, String password,Long mobileNumber) {

	this.name = name;
	this.email = email;
	this.password = password;
	this.mobileNumber = mobileNumber;
}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", mobileNumber="
				+ mobileNumber + "]";
	}

	

	
//	
//	public List<Expense> getExpenses() {
//		return expenses;
//	}
//	public void setExpenses(List<Expense> expenses) {
//		this.expenses = expenses;
//	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", expenses=" + expenses + "]";
//	}
	
	
	
}
