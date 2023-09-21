package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;
    CarHandler carHandler;

    @BeforeEach
    void setUp() {
        car = new Car();
        carHandler = new CarHandler(car);
    }

    @Test
    public void notNullTest() {
        assertNotNull(carHandler.getCar());
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
        assertNotNull(carHandler.getCar().getHalfLights());
    }

    @Test
    public void hasHighBeam() {
        assertNotNull(carHandler.getCar().getHighBeam());
    }

    @Test
    public void hasBackLights() {
        assertNotNull(carHandler.getCar().getBackLights());
    }

    @Test
    public void hasGears() {
        assertNotNull(carHandler.getCar().getGear());
    }

    @Test
    public void hasBattery() {
        assertNotNull(carHandler.getCar().getBattery());
    }

    @Test
    public void drivingUsesUpBattery() {
        carHandler.getCar().getBattery().setBatteryLevel(100);
        int originalBatteryLevel = carHandler.getCar().getBattery().getBatteryLevel();
        carHandler.drive(15);
        assertTrue(originalBatteryLevel >= carHandler.getCar().getBattery().getBatteryLevel());
    }

    @Test
    public void lightsUsesUpBattery() {      //obs!! bara för halvljus än så länge!! ändra om vi refaktoriserar så logiken kommer ut ur Car
        carHandler.getCar().getBattery().setBatteryLevel(100);
        int originalBatteryLevel = carHandler.getCar().getBattery().getBatteryLevel();
        carHandler.getCar().getHalfLights().putLightsOn();
        carHandler.shine();
        assertTrue(originalBatteryLevel > carHandler.getCar().getBattery().getBatteryLevel());
    }


    @Test
    public void driveOnEmptyBatteryGivesException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> carHandler.drive(15));
        assertEquals("Car can't run on empty battery", exception.getMessage());
    }

    @Test
    public void speedCantIncreaseOnEmptyBattery() {
        carHandler.getCar().setSpeed(100);
        carHandler.changeSpeed(10);

        assertEquals(carHandler.getCar().getSpeed(), 100);
        assertNotEquals(carHandler.getCar().getSpeed(), 110);
    }

    @Test
    public void lightsOutOnEmptyBattery() {
        //put on lights to put them out by engine
        car.getBattery().setBatteryLevel(50);
        car.getBackLights().putLightsOn();
        car.getHalfLights().putLightsOn();
        car.getHighBeam().putLightsOn();
        car.getBrakeLights().putLightsOn();


        Exception exception = assertThrows(IllegalArgumentException.class, () -> carHandler.drive(55));
        assertEquals("Car can't run on empty battery", exception.getMessage());


        assertFalse(car.getHighBeam().isLightsOn());
        assertFalse(car.getHalfLights().isLightsOn());
        assertFalse(car.getBackLights().isLightsOn());
        assertFalse(car.getBrakeLights().isLightsOn());

        assertTrue(car.getWarningLights().isLightsOn());
    }

    @Test
    public void isRunningFalse() {
        assertFalse(carHandler.getCar().getIsRunning());
    }

    @Test
    public void isRunningTrue() {
        carHandler.startEngine();
        assertTrue(carHandler.getCar().getIsRunning());
    }

    @Test
    public void stopEngineLightsOut() {
        //put on lights to put them out by engine
        carHandler.getCar().getBackLights().putLightsOn();
        carHandler.getCar().getHalfLights().putLightsOn();
        carHandler.getCar().getHighBeam().putLightsOn();
        carHandler.stopEngine();

        //asserts w hamcrest
        assertThat(carHandler.getCar().getBackLights().isLightsOn(), is(false));
        assertThat(carHandler.getCar().getHalfLights().isLightsOn(), is(false));
        assertThat(carHandler.getCar().getHighBeam().isLightsOn(), is(false));
    }

    @Test
    public void hasWarningLights() {
        assertNotNull(carHandler.getCar().getWarningLights());
    }

    @Test
    public void gasOn50() {
        carHandler.getCar().getBattery().setBatteryLevel(50);
        carHandler.getCar().setGasOn();
        assertTrue(carHandler.getCar().getGasOn());
        carHandler.getCar().setSpeed(50);
        assertEquals(50, carHandler.getCar().getSpeed());
    }

    @Test
    public void gasOn181GivesException() {
        Car car = new Car();
        int invalidLevel = 181;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> carHandler.setSpeed(invalidLevel));
        assertEquals("Must be between 0 and 180!", exception.getMessage());
    }

    @Test
    public void brake() {
        carHandler.brake();
        assertEquals(carHandler.getCar().getSpeed(), 0);
        assertFalse(carHandler.getCar().getGasOn());
        assertTrue(carHandler.getCar().getBrakeLights().isLightsOn());
    }
    @Test
    public void charger(){
        carHandler.getCar().getBattery().setBatteryLevel(0);
        carHandler.charger(50);
        assertEquals(carHandler.getCar().getBattery().getBatteryLevel(),50);
    }
    @Test
    public void chargeFullBatteryThrowsExceptionTest(){
        carHandler.getCar().getBattery().setBatteryLevel(100);
        Exception exception = assertThrows(RuntimeException.class, () -> carHandler.charger(1));
        assertEquals("Battery is already charged", exception.getMessage());
    }
    @Test
    public void connectCarToCharge(){
        assertNotNull(carHandler.getCar().isConnect());
    }

}