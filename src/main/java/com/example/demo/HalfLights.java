package com.example.demo;

public class HalfLights implements Lights{
    private boolean lightsOn;
  /*  public void lightSwitch(){
        if(!isLightsOn()){
            putLightsOn();
        } else putLightsOff();
    }*/

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
