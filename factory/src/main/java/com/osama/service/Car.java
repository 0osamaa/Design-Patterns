package com.osama.service;

import com.osama.repo.MotorVehicle;

public class Car implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
