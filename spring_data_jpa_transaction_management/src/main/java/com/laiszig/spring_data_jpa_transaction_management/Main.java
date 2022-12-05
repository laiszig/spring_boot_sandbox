package com.laiszig.spring_data_jpa_transaction_management;

import com.laiszig.spring_data_jpa_transaction_management.dto.FlightBookingRequest;
import com.laiszig.spring_data_jpa_transaction_management.dto.FlightBookingResponse;
import com.laiszig.spring_data_jpa_transaction_management.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

    @Autowired
    private FlightBookingService service;

    @PostMapping("/bookFlightTicket")
    public FlightBookingResponse bookFlightTicket(@RequestBody FlightBookingRequest request) {
        return service.bookFlightTicket(request);
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
