package com.ex.service;

import java.util.List;

import com.ex.model.Trip;

public interface TripService {
	Trip getTripById(int tripId);
	List<Trip> getTrips();
	void addTrip(Trip trip);
	void deleteTripById(int tripId);
	public Trip updateTrip(Trip trip,int tripId);
}
