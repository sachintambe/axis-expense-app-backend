package com.ex.model;

import javax.persistence.*;

@Entity
@Table(name="trip")
public class Trip {
	@Id
    @GeneratedValue
    private int tripId;
    private String tripName;
    private long mobileNumber;
    

   

//    @ManyToOne(cascade = CascadeType.PERSIST)
//    private User user;

    public Trip() {
    }

    public Trip(int tripId, String tripName, long mobileNumber) {
        this.tripId = tripId;
        this.tripName = tripName;
        this.mobileNumber = mobileNumber;
//        this.user = user;
        
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Trip [tripId=" + tripId + ", tripName=" + tripName + ", mobileNumber=" + mobileNumber + "]";
	}
    
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

	
   


	
}
