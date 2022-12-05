package com.laiszig.spring_data_jpa_transaction_management.repository;

import com.laiszig.spring_data_jpa_transaction_management.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {
}
