package com.osama.service;

import com.osama.repo.MotorVehicle;
import com.osama.repo.MotorVehicleFactory;

public class CarFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
