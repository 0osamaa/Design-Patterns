package com.osama.service;

import com.osama.repo.MotorVehicle;

public class Motorcycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
