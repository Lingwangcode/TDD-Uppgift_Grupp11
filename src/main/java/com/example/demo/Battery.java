package com.example.demo;

public class Battery {
    private int batteryLevel;
    private int emergencyBatteryLevel;
    private boolean emergencyActivated;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 100) {
            this.batteryLevel = 100;
        } else if (batteryLevel <= 0) {
            this.batteryLevel = 0;
            setEmergencyActivated(true);
        } else {
            this.batteryLevel = batteryLevel;
        }
    }

    public int getEmergencyBatteryLevel() {
        return emergencyBatteryLevel;
    }

    public void setEmergencyBatteryLevel(int emergencyBatteryLevel) {
        this.emergencyBatteryLevel = emergencyBatteryLevel;
    }

    public boolean isEmergencyActivated() {
        return emergencyActivated;
    }

    public void setEmergencyActivated(boolean emergencyActivated) {
        setEmergencyBatteryLevel(3);
        this.emergencyActivated = emergencyActivated;
    }
}
