package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatteryTest {
    Battery battery;
    @BeforeEach
    void setup(){
        battery=new Battery();
    }

    @Test
    public void getBatteryLevelTest() {
        assertNotNull(battery.getBatteryLevel());
        assert (battery.getBatteryLevel() >= 0);
        assert (battery.getBatteryLevel() <= 100);
    }

    @Test
    public void setBatteryLevelTestValid() {
        battery.setBatteryLevel(75);
        assertEquals (battery.getBatteryLevel(), 75);
    }
    @Test
    public void setBatteryLevelTestInvalid() {
        battery.setBatteryLevel(-75);
        assertEquals (battery.getBatteryLevel(), 0);
        battery.setBatteryLevel(175);
        assertEquals (battery.getBatteryLevel(), 100);
    }
}