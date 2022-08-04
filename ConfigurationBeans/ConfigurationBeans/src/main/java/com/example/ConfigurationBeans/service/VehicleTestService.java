package com.example.ConfigurationBeans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleTestService {
    @Autowired
            //@Qualifier("planeVehicleServiceConfiguration")

    VehicleService vehicleService;
    public  void testvehicle(){
        vehicleService.startEngine();
        vehicleService.move();
        vehicleService.stopEngine();
    }
}
