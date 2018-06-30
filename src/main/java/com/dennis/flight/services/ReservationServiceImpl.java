package com.dennis.flight.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennis.flight.datatransferobject.ReservationRequest;
import com.dennis.flight.model.Flight;
import com.dennis.flight.model.Passenger;
import com.dennis.flight.model.Reservation;
import com.dennis.flight.repos.FlightRepository;
import com.dennis.flight.repos.PassengerRepository;
import com.dennis.flight.repos.ReservationRepository;

@Service 
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	public Reservation bookFlight(ReservationRequest request) {
		//Make payment
		Long flightId = request.getFlightId();
		Flight flight = flightRepository.findById(flightId).orElse(null);
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setMiddleName("Takaros");
		passenger.setPhone(request.getPassengerPhone());
		Passenger savedPassenger = passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		
		Reservation savedReservation = reservationRepository.save(reservation);
		
		return savedReservation;
	}
	
	
	
}
