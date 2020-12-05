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
}
