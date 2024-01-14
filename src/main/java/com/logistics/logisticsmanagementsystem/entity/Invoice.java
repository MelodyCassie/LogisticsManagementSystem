package com.logistics.logisticsmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceNumber;

    @OneToOne
    private Billing billing;
}
