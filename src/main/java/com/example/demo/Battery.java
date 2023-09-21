package com.example.demo;

public class Battery {
    private int batteryLevel;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 100) {
            this.batteryLevel = 100;
        } else if (batteryLevel <= 0) {
            this.batteryLevel = 0;
        } else {
            this.batteryLevel = batteryLevel;
        }
    }
}
