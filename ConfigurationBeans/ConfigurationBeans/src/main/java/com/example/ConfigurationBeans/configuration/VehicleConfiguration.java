package com.example.ConfigurationBeans.configuration;

import com.example.ConfigurationBeans.service.CarVehicleService;
import com.example.ConfigurationBeans.service.PlaneVehicleService;
import com.example.ConfigurationBeans.service.VehicleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class VehicleConfiguration {
    @Bean
    //@Qualifier("carVehicleServiceConfiguration")
    @ConditionalOnProperty(value = "vehicle.service.mode",havingValue = "car",matchIfMissing = false)
    public VehicleService carVehicleServiceConfiguration(){
        return new CarVehicleService();
    }
    @Bean
    //@Primary
    //@Qualifier("planeVehicleServiceConfiguration")
    @ConditionalOnProperty(value = "vehicle.service.mode",havingValue = "plane",matchIfMissing = false)
    public VehicleService planeVehicleServiceConfiguration(){
        return new PlaneVehicleService();
    }
}
