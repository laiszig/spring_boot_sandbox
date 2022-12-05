package com.laiszig.spring_data_jpa_transaction_management.service;

import com.laiszig.spring_data_jpa_transaction_management.dto.FlightBookingRequest;
import com.laiszig.spring_data_jpa_transaction_management.dto.FlightBookingResponse;
import com.laiszig.spring_data_jpa_transaction_management.entity.PassengerInfo;
import com.laiszig.spring_data_jpa_transaction_management.entity.PaymentInfo;
import com.laiszig.spring_data_jpa_transaction_management.repository.PassengerInfoRepository;
import com.laiszig.spring_data_jpa_transaction_management.repository.PaymentInfoRepository;
import com.laiszig.spring_data_jpa_transaction_management.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public FlightBookingResponse bookFlightTicket (FlightBookingRequest request) {

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPassengerId());
        paymentInfo.setAmount(passengerInfo.getFare());

        paymentInfoRepository.save(paymentInfo);

        return new FlightBookingResponse("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);
    }
}
