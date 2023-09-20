package com.example.demo;

public class Lights {
    private boolean lightsOn;

    public void putLightsOn(){
        lightsOn = true;
    }
    public void putLightsOff(){
        lightsOn = false;
    }

    public boolean isLightsOn(){
        return lightsOn;
    }
}
