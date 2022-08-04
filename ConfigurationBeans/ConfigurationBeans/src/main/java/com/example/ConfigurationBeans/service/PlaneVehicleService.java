package com.example.ConfigurationBeans.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PlaneVehicleService implements VehicleService {
    private Logger log = LoggerFactory.getLogger(PlaneVehicleService.class);
    @Override
    public void startEngine() {
        log.info("Starting plane Engine");

    }

    @Override
    public void move() {
        log.info("Flying engine");
    }

    @Override
    public void stopEngine() {
        log.info("Landing plane and turning off Engine ");
    }
}
