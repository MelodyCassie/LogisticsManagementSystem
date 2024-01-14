package com.logistics.logisticsmanagementsystem.repository;

import com.logistics.logisticsmanagementsystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
