package com.example.demo;

public class Car {
    private HighBeam highBeam;
    private HalfLights halfLights;
    private BackLights backLights;
    private WarningLights warningLights;
    private boolean gasOn;
    private boolean brakeOn;
    private int speed;
    private int reverseSpeed;
    private boolean isRunning;

    public Car (){
        highBeam = new HighBeam();
        halfLights = new HalfLights();
        backLights = new BackLights();
        warningLights = new WarningLights();
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
    public WarningLights getWarningLights(){
        return warningLights;
    }

    public int getSpeed() {
        return speed;
    }
    public boolean getGasOn(){
        return gasOn;
    }
    public void setSpeed(int speed){
        if(speed >= 0 && speed <= 180) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Must be between 0 and 180!");
        }
    }

    public void setGasOn() {
        gasOn=true;
    }
    public void setGasOff() {
        gasOn=false;
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

    public void setWarningLights(WarningLights warningLights) {
        this.warningLights = warningLights;
    }

    public boolean isBrakeOn() {
        return brakeOn;
    }

    public void setBrakeOn() {
        this.brakeOn = true;
    }
    public void setBrakeOff() {
        this.brakeOn = false;
    }

    public int getReverseSpeed() {
        return reverseSpeed;
    }

    public void setReverseSpeed(int reverseSpeed) {
        this.reverseSpeed = reverseSpeed;
    }

    public void startEngine(){
        isRunning = true;
    }
    public void stopEngine(){
        isRunning = false;
        halfLights.putLightsOff();
        highBeam.putLightsOff();
        backLights.putLightsOff();
    }
    public boolean getIsRunning(){
        return isRunning;
    }
    public void brake(){
        if (!brakeOn) {
            setGasOff();
            setSpeed(0);
            setBrakeOn();
        }else {
            setReverseSpeed(1);
        }
    }
}
