package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    public void notNullTest() {
        assertNotNull(car);
    }

/*
    @Test
    public void turnOnLights(){
        car.lightSwitch();
        assertTrue(car.getLights().isLightsOn());
    }
    @Test
    public void turnOffLights(){
        car.lightSwitch();
        car.lightSwitch();
        assertFalse(car.getLights().isLightsOn());
    }*/

    @Test
    public void hasHalfLights() {
        assertNotNull(car.getHalfLights());
    }

    @Test
    public void hasHighBeam() {
        assertNotNull(car.getHighBeam());
    }

    @Test
    public void hasBackLights() {
        assertNotNull(car.getBackLights());
    }

    @Test
    public void hasGears() {
        assertNotNull(car.getGear());
    }
    @Test
    public void hasBattery() {
        assertNotNull(car.getBattery());
    }

    @Test
    public void drivingUsesUpBattery(){
        car.getBattery().setBatteryLevel(100);
        int originalBatteryLevel=car.getBattery().getBatteryLevel();
        car.drive(15);
        assertTrue (originalBatteryLevel >= car.getBattery().getBatteryLevel());
    }
    @Test
    public void lightsUsesUpBattery(){      //obs!! bara för halvljus än så länge!! ändra om vi refaktoriserar så logiken kommer ut ur Car
        car.getBattery().setBatteryLevel(100);
        int originalBatteryLevel=car.getBattery().getBatteryLevel();
        car.getHalfLights().putLightsOn();
        car.shine();
        assertTrue (originalBatteryLevel > car.getBattery().getBatteryLevel());
    }


    @Test
    public void driveOnEmptyBatteryGivesException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> car.drive(15));
        assertEquals("Car can't run on empty battery", exception.getMessage());
    }
    @Test
    public void isRunningFalse() {
        assertFalse(car.getIsRunning());
    }

    @Test
    public void isRunningTrue() {
        car.startEngine();
        assertTrue(car.getIsRunning());
    }

    @Test
    public void stopEngineLightsOut() {
        //put on lights to put them out by engine
        car.getBackLights().putLightsOn();
        car.getHalfLights().putLightsOn();
        car.getHighBeam().putLightsOn();
        car.stopEngine();

        assertFalse(car.getHalfLights().isLightsOn());
        assertFalse(car.getHighBeam().isLightsOn());
        assertFalse(car.getBackLights().isLightsOn());
    }

    @Test
    public void hasWarningLights() {
        assertNotNull(car.getWarningLights());
    }

    @Test
    public void gasOn50() {
        car.setGasOn();
        assertTrue(car.getGasOn());
        car.setSpeed(50);
        assertEquals(50, car.getSpeed());
    }

    @Test
    public void gasOn181GivesException() {
        Car car = new Car();
        int invalidLevel = 181;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> car.setSpeed(invalidLevel));
        assertEquals("Must be between 0 and 180!", exception.getMessage());
    }

    @Test
    public void brake() {
        car.brake();
        assertEquals(car.getSpeed(), 0);
        assertFalse(car.getGasOn());
        assertTrue(car.getBrakeLights().isLightsOn());
    }

}