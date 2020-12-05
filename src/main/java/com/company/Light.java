package com.company;

public class Light {
    private LightStatus status;

    public Light() {
        this.status = LightStatus.OFF;
    }

    public LightStatus getStatus() {
        return status;
    }
}
