package com.dennis.flight.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dennis.flight.datatransferobject.ReservationRequest;
import com.dennis.flight.model.Flight;
import com.dennis.flight.model.Reservation;
import com.dennis.flight.repos.FlightRepository;
import com.dennis.flight.services.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;

	@Autowired
	ReservationService reservationService;;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId,
			                              ModelMap modelMap) {
		Flight flight = flightRepository.findById(flightId).orElse(null);
		modelMap.addAttribute("flight",flight);
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation", method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request,
			                          ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation successfully and the id is "+reservation.getId());
		return "reservationConfirmation";
	}
}
