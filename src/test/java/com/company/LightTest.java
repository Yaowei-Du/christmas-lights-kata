package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightTest {
    @Test
    public void should_be_off_when_init_light_by_default() {
        Light light = new Light();
        assertEquals(LightStatus.OFF, light.getStatus());
    }

    @Test
    public void should_be_on_when_turn_on() {
        Light light = new Light();
        light.execute(LightCommand.ON);
        assertEquals(LightStatus.ON, light.getStatus());
    }

    @Test
    public void should_be_off_when_turn_off() {
        Light light = new Light(LightStatus.ON);
        light.execute(LightCommand.OFF);
        assertEquals(LightStatus.OFF, light.getStatus());
    }

    @Test
    public void should_be_on_when_toggle_an_off_light() {
        Light light = new Light(LightStatus.OFF);
        light.execute(LightCommand.TOGGLE);
        assertEquals(LightStatus.ON, light.getStatus());
    }

    @Test
    public void should_be_off_when_toggle_an_on_light() {
        Light light = new Light(LightStatus.ON);
        light.execute(LightCommand.TOGGLE);
        assertEquals(LightStatus.OFF, light.getStatus());
    }
}
