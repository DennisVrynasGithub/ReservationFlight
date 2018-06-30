package com.dennis.flight.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dennis.flight.model.Passenger;
import com.dennis.flight.model.Reservation;

public interface ReservationRepository extends JpaRepository<Passenger, Long>{

	Reservation save(Reservation reservation);

}
