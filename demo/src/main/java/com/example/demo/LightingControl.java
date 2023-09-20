package com.example.demo;

public class LightingControl implements Lights{
    private boolean lightsOn;
    private boolean halfLightsOn;

    @Override
    public void putLightsOn() {
        lightsOn=true;
    } //Highbeam on
    @Override
    public void putLightsOff() {
        lightsOn=false;
    } //Highbeam off
    @Override
    public boolean isLightsOn() {
        return lightsOn;
    }

    public void putHalfLightsOn() {
        lightsOn=true;
    }

    public void putHalfLightsOff() {
        lightsOn=false;
    }

    public boolean isHalfLightsOn() {
        return lightsOn;
    }
}
