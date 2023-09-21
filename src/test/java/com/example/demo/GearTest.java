package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GearTest {

    @Test
    void driveExists() {
        assertTrue(Gear.contains(Gear.DRIVE));
    }

    @Test
    void reverseExists() {
        assertTrue(Gear.contains(Gear.REVERSE));
    }
}