package com.company;

public class Light {
    private LightStatus status;

    public Light() {
        this.status = LightStatus.OFF;
    }

    public void execute(LightCommand command) {
        switch (command) {
            case ON:
                turnOn();
                break;
            case OFF:
                turnOff();
                break;
            case TOGGLE:
                toggle();
                break;
        }
    }

    public LightStatus getStatus() {
        return status;
    }

    private void turnOn() {
        this.status = LightStatus.ON;
    }

    private void turnOff() {
        this.status = LightStatus.OFF;
    }

    private void toggle() {
        if (this.status == LightStatus.ON) this.status = LightStatus.OFF;
        else if (this.status == LightStatus.OFF) this.status = LightStatus.ON;
    }
}
