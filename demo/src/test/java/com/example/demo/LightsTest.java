package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightsTest {
    Lights lights;

    @BeforeEach
    void setUp(){
        lights=new Lights();
    }

    @Test
    public void lightsOn(){
        assertTrue(lights.getLightsOn());
    }
}