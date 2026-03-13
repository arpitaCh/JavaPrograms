package com.thinkconstructive.restdemo.dto;

import com.thinkconstructive.restdemo.model.PassengerInfo;
import com.thinkconstructive.restdemo.model.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class FlightBookingRequest {


    private PassengerInfo passengerinfo;

    private PaymentInfo paymentInfo;

}
