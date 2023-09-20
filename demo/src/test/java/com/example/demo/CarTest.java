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
    public void nullTest (){
        assertNull(car);
    }

    @Test
    public void notNullTest (){
        assertNotNull(car);
    }

}