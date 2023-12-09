package com.osama;

import com.osama.service.CarFactory;
import com.osama.service.MotorcycleFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryApplication.class, args);

        MotorcycleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.create();

        CarFactory carFactory = new CarFactory();
        carFactory.create();


    }

}
