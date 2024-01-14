package com.logistics.logisticsmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trackingNumber;
    private String status;
    private String origin;
    private String destination;

    @ManyToOne
    private Carrier carrier;

    @OneToOne(mappedBy = "shipment")
    private Order order;
}
