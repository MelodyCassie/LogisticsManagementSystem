package com.logistics.logisticsmanagementsystem.service;

import com.logistics.logisticsmanagementsystem.entity.*;
import com.logistics.logisticsmanagementsystem.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    @Autowired
    private CarrierRepository carrierRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private BillingRepository billingRepository;

    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }

    public Shipment getShipmentById(Long id) {
        return shipmentRepository.findById(id).orElse(null);
    }

    public Shipment createShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    public Shipment updateShipment(Long id, Shipment updatedShipment) {
        Shipment existingShipment = shipmentRepository.findById(id).orElse(null);
        if (existingShipment != null) {
            existingShipment.setTrackingNumber(updatedShipment.getTrackingNumber());
            existingShipment.setOrigin(updatedShipment.getOrigin());
            existingShipment.setDestination(updatedShipment.getDestination());
            existingShipment.setStatus(updatedShipment.getStatus());
            existingShipment.setCarrier(updatedShipment.getCarrier());
            return shipmentRepository.save(existingShipment);
        }
        return null;
    }

    public void deleteShipment(Long id) {
        shipmentRepository.deleteById(id);
    }

    public List<Carrier> getAllCarriers() {
        return carrierRepository.findAll();
    }

    public Carrier createCarrier(Carrier carrier) {
        return carrierRepository.save(carrier);
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Billing createBilling(Billing billing) {
        return billingRepository.save(billing);
    }

    public Invoice createInvoicing(Invoice invoicing) {
        return invoiceRepository.save(invoicing);
    }
}
