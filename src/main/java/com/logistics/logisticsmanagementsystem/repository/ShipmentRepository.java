package com.logistics.logisticsmanagementsystem.repository;

import com.logistics.logisticsmanagementsystem.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}
