package com.example.demo;

public class Car {
    private Lights highBeam1;
    private HighBeam highBeam;
    private HalfLights halfLights;

    public Car (){
        highBeam = new HighBeam();
        halfLights = new HalfLights();
    }

    public HighBeam getHighBeam() {
        return highBeam;
    }
    public HalfLights getHalfLights(){
        return halfLights;
    }
    public void setHighBeam(HighBeam highBeam) {
        this.highBeam = highBeam;
    }

    public void setHalfLights(HalfLights halfLights){
        this.halfLights = halfLights;
    }

}
