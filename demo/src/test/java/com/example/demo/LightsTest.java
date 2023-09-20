package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightsTest {
    HighBeam highBeam;
    HalfLights halfLights;

    @BeforeEach
    void setUp(){
        highBeam = new HighBeam();
        halfLights = new HalfLights();
    }

    @Test
    public void halfLightsOff(){
        assertFalse(halfLights.isLightsOn());
    }
    @Test
    public void halfLightsOn(){
        halfLights.putLightsOn();
        assertTrue(halfLights.isLightsOn());
    }
    @Test
    public void highBeamOff(){
        assertFalse(highBeam.isLightsOn());
    }
    @Test
    public void highBeamOn(){
        highBeam.putLightsOn();
        assertTrue(highBeam.isLightsOn());
    }
}