package com.logistics.logisticsmanagementsystem.controller;

import com.logistics.logisticsmanagementsystem.entity.*;
import com.logistics.logisticsmanagementsystem.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @GetMapping
    public List<Shipment> getAllShipments() {
        return shipmentService.getAllShipments();
    }

    @GetMapping("/{id}")
    public Shipment getShipmentById(@PathVariable Long id) {
        return shipmentService.getShipmentById(id);
    }

    @PostMapping
    public Shipment createShipment(@RequestBody Shipment shipment) {
        return shipmentService.createShipment(shipment);
    }

    @PutMapping("/{id}")
    public Shipment updateShipment(@PathVariable Long id, @RequestBody Shipment updatedShipment) {
        return shipmentService.updateShipment(id, updatedShipment);
    }

    @DeleteMapping("/{id}")
    public void deleteShipment(@PathVariable Long id) {
        shipmentService.deleteShipment(id);
    }

    @GetMapping("/carriers")
    public List<Carrier> getAllCarriers() {
        return shipmentService.getAllCarriers();
    }

    @PostMapping("/carriers")
    public Carrier createCarrier(@RequestBody Carrier carrier) {
        return shipmentService.createCarrier(carrier);
    }

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        return shipmentService.getAllLocations();
    }

    @PostMapping("/locations")
    public Location createLocation(@RequestBody Location location) {
        return shipmentService.createLocation(location);
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return shipmentService.getAllOrders();
    }

    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order) {
        return shipmentService.createOrder(order);
    }

    @PostMapping("/billing")
    public Billing createBilling(@RequestBody Billing billing) {
        return shipmentService.createBilling(billing);
    }

    @PostMapping("/invoicing")
    public Invoice createInvoicing(@RequestBody Invoice invoicing) {
        return shipmentService.createInvoicing(invoicing);
    }
}
