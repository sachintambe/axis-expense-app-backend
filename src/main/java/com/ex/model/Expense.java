package com.ex.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="expense")
public class 	Expense {
	@Id
	@GeneratedValue	
	private long id;	
	private String name;
	private int amount;
	private String payment_type;
	private long mobileNumber;
	private int tripId;
	
//	@ManyToOne
//	private Trip trip;
//	@ManyToOne
//	private User user;
//	
	public Expense() {
		
	}
	public Expense( String name, int amount,  String payment_type, long mobileNumber, int tripid) {
		super();		
		this.name = name;
		this.amount = amount;
		this.payment_type = payment_type;
		this.mobileNumber = mobileNumber;
		this.tripId = tripId;
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
		
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
public int getTripId() {
		return tripId;
	}
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	//	public Trip getTrip() {
//		return trip;
//	}
//	public void setTrip(Trip trip) {
//		this.trip = trip;
//	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	@Override
	public String toString() {
		return "Expense [id=" + id + ", name=" + name + ", amount=" + amount + ", payment_type=" + payment_type
				+ ", mobileNumber=" + mobileNumber + ", tripId=" + tripId + "]";
	}

	
	
	
	

	
	
	

}
