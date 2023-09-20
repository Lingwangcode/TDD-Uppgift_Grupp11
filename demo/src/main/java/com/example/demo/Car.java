package com.example.demo;

public class Car {
    private Lights lights;

    public Car (){
        lights = new Lights();
    }

    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }
}
