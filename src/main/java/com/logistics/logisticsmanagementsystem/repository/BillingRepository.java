package com.logistics.logisticsmanagementsystem.repository;

import com.logistics.logisticsmanagementsystem.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Long> {
}
