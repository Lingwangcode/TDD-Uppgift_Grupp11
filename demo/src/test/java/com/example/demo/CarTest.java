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
    public void notNullTest (){
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
    public void hasHalfLights(){
        assertNotNull(car.getHalfLights());
    }
    @Test
    public void hasHighBeam(){
        assertNotNull(car.getHighBeam());
    }






}