package com.laiszig.spring_data_jpa_transaction_management.dto;

import com.laiszig.spring_data_jpa_transaction_management.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingResponse {

    private String status;
    private Double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
