package com.logistics.logisticsmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNumber;
    private String customerName;

    @OneToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;
}
