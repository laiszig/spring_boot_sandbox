package com.laiszig.spring_data_jpa_transaction_management.repository;

import com.laiszig.spring_data_jpa_transaction_management.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {
}
