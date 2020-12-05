package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasLightsKataTest {
    @Test
    public void test_initial_lights() {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata(5, 5);
        Light light = christmasLightsKata.getLight(0, 0);
        assertEquals(LightStatus.OFF, light.getStatus());
    }

    @Test
    public void test_turn_on_light() {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata(5, 5);
        christmasLightsKata.turnOn(0, 0, 1, 1);

        assertEquals(LightStatus.ON, christmasLightsKata.getLight(0, 0).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(0, 1).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(1, 0).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(1, 1).getStatus());
    }
}
