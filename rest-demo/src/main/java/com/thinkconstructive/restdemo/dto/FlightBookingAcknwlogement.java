package com.thinkconstructive.restdemo.dto;

import com.thinkconstructive.restdemo.model.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknwlogement{

private String status;
private double totalfare;
private String pnrno;

private PassengerInfo passengerInfo;

}
