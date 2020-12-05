package com.company;

public class Light {
    private LightStatus status;

    public Light() {
        this.status = LightStatus.OFF;
    }

    public void turnOn() {
        this.status = LightStatus.ON;
    }

    public LightStatus getStatus() {
        return status;
    }
}
