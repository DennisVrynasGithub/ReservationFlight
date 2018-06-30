package com.dennis.flight.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dennis.flight.model.Passenger;
import com.dennis.flight.model.User;

public interface PassengerRepository extends JpaRepository<User, Long>{

	Passenger save(Passenger passenger);

}
