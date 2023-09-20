package com.example.demo;

public class Car {
    private HighBeam highBeam;
    private HalfLights halfLights;
    private BackLights backLights;
    private boolean isRunning;

    public Car (){
        highBeam = new HighBeam();
        halfLights = new HalfLights();
        backLights = new BackLights();
    }

    public HighBeam getHighBeam() {
        return highBeam;
    }
    public HalfLights getHalfLights(){
        return halfLights;
    }
    public BackLights getBackLights(){
        return backLights;
    }
    public void setHighBeam(HighBeam highBeam) {
        this.highBeam = highBeam;
    }

    public void setHalfLights(HalfLights halfLights){
        this.halfLights = halfLights;
    }
    public void setBackLights(BackLights backLights){
        this.backLights = backLights;
    }
    public void startEngine(){
        isRunning = true;
    }
    public void stopEngine(){
        isRunning = false;
    }
    public boolean getIsRunning(){
        return isRunning;
    }
}
