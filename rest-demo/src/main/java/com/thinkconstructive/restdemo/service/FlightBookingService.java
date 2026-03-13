package com.thinkconstructive.restdemo.service;

import com.thinkconstructive.restdemo.dto.FlightBookingAcknwlogement;
import com.thinkconstructive.restdemo.dto.FlightBookingRequest;

public interface FlightBookingService {

    public FlightBookingAcknwlogement bookFlightTicket(FlightBookingRequest flightBookingRequest);
}
