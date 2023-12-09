package com.osama.service;

import com.osama.repo.MotorVehicle;
import com.osama.repo.MotorVehicleFactory;

public class MotorcycleFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Motorcycle();
    }
}
