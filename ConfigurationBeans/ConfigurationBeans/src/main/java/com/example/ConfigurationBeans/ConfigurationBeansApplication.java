package com.example.ConfigurationBeans;

import com.example.ConfigurationBeans.service.VehicleService;
import com.example.ConfigurationBeans.service.VehicleTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigurationBeansApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(ConfigurationBeansApplication.class, args);
		//VehicleService vehicleService=context.getBean(VehicleService.class);
		//vehicleService.startEngine();
		//vehicleService.move();
		//vehicleService.stopEngine();
		//using qualifiers  ,//conditional property annotation
		VehicleTestService vehicleTestService= context.getBean(VehicleTestService.class);
		vehicleTestService.testvehicle();

	}

}
