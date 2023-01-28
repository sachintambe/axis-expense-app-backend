package com.ex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.model.Trip;
import com.ex.repository.TripRepository;
@Service
public class TripServiceImpl implements TripService{
	
	@Autowired
	TripRepository triprepository;
	


	@Override
	public List<Trip> getTrips() {
		// TODO Auto-generated method stub
		return (List<Trip>)triprepository.findAll();
	}

	@Override
	public void addTrip(Trip trip) {
		// TODO Auto-generated method stub
		triprepository.save(trip);
	}

	

	@Override
	public Trip updateTrip(Trip trip,int tripId) {
		// TODO Auto-generated method stub
		Trip toUpdate = triprepository.findById(tripId).get();
		toUpdate.setTripName(trip.getTripName());
	
		return triprepository.save(toUpdate);
		
	}

	@Override
	public void deleteTripById(int tripId) {
		// TODO Auto-generated method stub
		triprepository.deleteById(tripId);
		
	}

	@Override
	public Trip getTripById(int tripId) {
		// TODO Auto-generated method stub
		Optional<Trip> tripOpt=triprepository.findById(tripId);
//		if(!tripOpt.isPresent())
//			throw new TripNotFoundException("Trip not found whth id: "+tripId);
		
		
		return tripOpt.get();
		
	}

}
