package com.dennis.flight.services;

import com.dennis.flight.datatransferobject.ReservationRequest;
import com.dennis.flight.model.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);
}
