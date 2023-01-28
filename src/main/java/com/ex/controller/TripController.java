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

import com.ex.model.Trip;
import com.ex.service.TripService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class TripController {
	@Autowired
	private TripService tripservice;
	
	@GetMapping("trip/{tripId}")
	public Trip getTripByMobileNumber(@PathVariable int tripId) {
		return tripservice.getTripById(tripId);
	} 
	
	@GetMapping("/trip")
	public List<Trip> getTrips(){
		return tripservice.getTrips();
	}
	
	@PostMapping("/trip")
	public ResponseEntity<String> addTrip(@RequestBody Trip trip){
		tripservice.addTrip(trip);
		return new ResponseEntity<String>("Trip added successfully...",HttpStatus.OK);
	}
	@DeleteMapping("/trip/{mobileNumber}")
	public ResponseEntity<String> deleteTripByMobileNumber(@PathVariable int tripId){
		tripservice.deleteTripById(tripId);
		return new ResponseEntity<String>("Trip deleted successfully",HttpStatus.OK);
	}
}
