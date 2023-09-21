package com.example.demo;

import java.util.List;

public class CarHandler {
    private final Car car;

    public CarHandler(Car car) {
        this.car = car;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 180) {
            car.setSpeed(speed);
        } else {
            throw new IllegalArgumentException("Must be between 0 and 180!");
        }
    }

    public void changeSpeed(int change) {
        if (car.getBattery().getBatteryLevel() > 0) {
            car.setSpeed(car.getSpeed() + change);
        }
    }

    public void setGasOn() {
        if (car.getBattery().getBatteryLevel() > 0) {
            car.setGasOn();
        }
    }

    public void startEngine() {
        car.setIsRunningTrue();
        car.getHalfLights().putLightsOn();
    }

    public void drive(int distance) {
        if (!car.getIsRunning()) {
            startEngine();
        }
        if (car.getBattery().getBatteryLevel() > 0) {
            car.getBattery().setBatteryLevel(car.getBattery().getBatteryLevel() - distance);
            shine();
        } else {
            stopEngine();
            throw new IllegalArgumentException("Car can't run on empty battery");
        }
    }
    public void deadBattery() {
        List<Lights> lights = List.of(car.getHalfLights(), car.getHighBeam(),
                car.getBackLights(), car.getBrakeLights(), car.getWarningLights());
        for (Lights l : lights) {
            l.putLightsOff();
        }
    }

    public void shine() {
        List<Lights> lights = List.of(car.getHalfLights(), car.getHighBeam(),
                car.getBackLights(), car.getBrakeLights(), car.getWarningLights());
        for (Lights l : lights) {
            if (l.isLightsOn()) {
                car.getBattery().setBatteryLevel(car.getBattery().getBatteryLevel() - 1);
            }
        }
    }

    public void stopEngine() {
        car.setIsRunningFalse();
        car.getHalfLights().putLightsOff();
        car.getHighBeam().putLightsOff();
        car.getBackLights().putLightsOff();
    }

    public void brake() {
        car.setBrakeOn();
        car.setGasOff();
        car.setSpeed(0);
        car.getBrakeLights().putLightsOn();
    }

    public Car getCar(){
        return car;
    }
}
