package com.logistics.logisticsmanagementsystem.repository;

import com.logistics.logisticsmanagementsystem.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
