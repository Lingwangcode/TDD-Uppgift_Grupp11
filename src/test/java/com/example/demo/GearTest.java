package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.in;
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

    //using hamcrest assertions to check the gears
    @Test
    void hasCorrectGears(){
        assertThat(Gear.values(), arrayWithSize(2));
        assertThat(Gear.REVERSE, in(Gear.values()));
        assertThat(Gear.DRIVE, in(Gear.values()));
        assertThat(null, not(in(Gear.values()))); // Should return false for null input
        assertThat(Gear.class, not(in(Gear.values())));
    }

}