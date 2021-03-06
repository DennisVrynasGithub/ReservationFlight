package com.dennis.flight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation  extends AbstractEntity{

	@Column(name="checked_in")
	private Boolean checkedIn;
	private Integer numberOfBags;
	
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	 
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public Integer getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(Integer numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}
