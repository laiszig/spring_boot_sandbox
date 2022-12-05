package com.laiszig.spring_data_jpa_transaction_management.dto;

import com.laiszig.spring_data_jpa_transaction_management.entity.PassengerInfo;
import com.laiszig.spring_data_jpa_transaction_management.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
