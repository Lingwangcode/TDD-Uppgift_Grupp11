package com.example.demo;

public enum Gear {
    DRIVE,
    REVERSE;

    public static boolean contains(Gear gear) {
        for (Gear enumValue : values()) {
            if (enumValue == gear) {
                return true;
            }
        }
        return false;
    }
}
