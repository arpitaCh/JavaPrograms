package com.thinkconstructive.restdemo.service.impl;

import com.thinkconstructive.restdemo.dto.FlightBookingAcknwlogement;
import com.thinkconstructive.restdemo.dto.FlightBookingRequest;
import com.thinkconstructive.restdemo.model.PassengerInfo;
import com.thinkconstructive.restdemo.model.PaymentInfo;
import com.thinkconstructive.restdemo.service.FlightBookingService;
import com.thinkconstructive.restdemo.util.paymentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import com.thinkconstructive.restdemo.repository.passengerRepo;
import com.thinkconstructive.restdemo.repository.paymentRepo;
import org.springframework.stereotype.Service;

@Service
public class FlightBookingServiceimpl implements FlightBookingService {
    @Autowired
    private passengerRepo passengerRepo;

    @Autowired
    private paymentRepo paymentRepo;


    @Override
    public FlightBookingAcknwlogement bookFlightTicket(FlightBookingRequest flightBookingRequest) {

FlightBookingAcknwlogement flightBookingAcknwlogement =null;

        PassengerInfo passengerInfo=  flightBookingRequest.getPassengerinfo();
//        passengerInfo=passengerRepo.save(passengerInfo);

        PaymentInfo paymentinfo = flightBookingRequest.getPaymentInfo();
//        passengerInfo= paymentRepo.save(paymentinfo);

        paymentUtil.validateCreditLimit(paymentinfo.getAccountNo(),paymentinfo.getAmount() );


return null;

    }
}
