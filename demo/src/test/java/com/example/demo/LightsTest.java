package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightsTest {
   // HighBeam highBeam;
    //HalfLights halfLights;
    LightingControl lightingControl;
    BackLights backLights;
    WarningLights warningLights;
    BrakeLights brakeLights;

    @BeforeEach
    void setUp(){
        //highBeam = new HighBeam();
       // halfLights = new HalfLights();
        lightingControl = new LightingControl();
        backLights = new BackLights();
        warningLights = new WarningLights();
        brakeLights = new BrakeLights();
    }

   /* @Test
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

    */
   @Test
   public void halfLightsOff(){
       assertFalse(lightingControl.isHalfLightsOn());
   }
    @Test
    public void halfLightsOn(){
        lightingControl.putHalfLightsOn();
        assertTrue(lightingControl.isHalfLightsOn());
    }
    @Test
    public void highBeamOff(){
        assertFalse(lightingControl.isLightsOn());
    }
    @Test
    public void highBeamOn(){
        lightingControl.putLightsOn();
        assertTrue(lightingControl.isLightsOn());
    }

    @Test
    public void backLightsOff(){
        assertFalse(backLights.isLightsOn());
    }
    @Test
    public void backLightsOn(){
        backLights.putLightsOn();
        assertTrue(backLights.isLightsOn());

    }

    @Test
    public void warningLightsOff(){
        assertFalse(warningLights.isLightsOn());
    }
    @Test
    public void warningLightsOn(){
        warningLights.putLightsOn();
        assertTrue(warningLights.isLightsOn());
    }

    @Test
    public void brakeLightsOff(){
        assertFalse(brakeLights.isLightsOn());
    }
    @Test
    public void brakeLightsOn(){
        brakeLights.putLightsOn();
        assertTrue(brakeLights.isLightsOn());
    }
}