package com.example.demo;

public class BackLights implements Lights{
    private boolean lightsOn;

    @Override
    public void putLightsOn() {
        lightsOn=true;
    }
    @Override
    public void putLightsOff() {
        lightsOn=false;
    }
    @Override
    public boolean isLightsOn() {
        return lightsOn;
    }
}
