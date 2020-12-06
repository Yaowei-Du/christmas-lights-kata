package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChristmasLightsKataTest {
    @Test
    public void test_initial_lights() {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata(5, 5);
        Light light = christmasLightsKata.getLight(0, 0);
        assertEquals(LightStatus.OFF, light.getStatus());
    }

    @Test
    public void test_turn_on_range_of_lights() throws ChristmasLightsException {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata(5, 5);
        christmasLightsKata.turnOn(0, 0, 1, 1);

        assertEquals(LightStatus.ON, christmasLightsKata.getLight(0, 0).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(0, 1).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(1, 0).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(1, 1).getStatus());
    }

    @Test
    public void test_turn_off_range_of_lights() throws ChristmasLightsException {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata(5, 5);
        christmasLightsKata.turnOn(0, 0, 1, 1);

        assertEquals(LightStatus.ON, christmasLightsKata.getLight(0, 0).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(0, 1).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(1, 0).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(1, 1).getStatus());

        christmasLightsKata.turnOff(0, 0, 1, 1);

        assertEquals(LightStatus.OFF, christmasLightsKata.getLight(0, 0).getStatus());
        assertEquals(LightStatus.OFF, christmasLightsKata.getLight(0, 1).getStatus());
        assertEquals(LightStatus.OFF, christmasLightsKata.getLight(1, 0).getStatus());
        assertEquals(LightStatus.OFF, christmasLightsKata.getLight(1, 1).getStatus());
    }

    @Test
    public void test_toggle_range_of_lights() throws ChristmasLightsException {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata(5, 5);
        christmasLightsKata.turnOn(0, 0, 0, 0);

        assertEquals(LightStatus.ON, christmasLightsKata.getLight(0, 0).getStatus());

        christmasLightsKata.toggle(0, 0, 1, 1);
        assertEquals(LightStatus.OFF, christmasLightsKata.getLight(0, 0).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(0, 1).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(1, 0).getStatus());
        assertEquals(LightStatus.ON, christmasLightsKata.getLight(1, 1).getStatus());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 5})
    public void should_throw_exception_when_x1_is_out_of_range(int x1) {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata(5, 5);

        Exception exception = assertThrows(ChristmasLightsException.class, () ->
                christmasLightsKata.turnOn(x1, 0, 0, 0));
        assertEquals(String.format("x(%d) is out of range", x1), exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 5})
    public void should_throw_exception_when_y1_is_out_of_range(int y1) {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata(5, 5);

        Exception exception = assertThrows(ChristmasLightsException.class, () ->
                christmasLightsKata.turnOn(0, y1, 0, 0));
        assertEquals(String.format("y(%d) is out of range", y1), exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 5})
    public void should_throw_exception_when_x2_is_out_of_range(int x2) {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata(5, 5);

        Exception exception = assertThrows(ChristmasLightsException.class, () ->
                christmasLightsKata.turnOn(0, 0, x2, 0));
        assertEquals(String.format("x(%d) is out of range", x2), exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 5})
    public void should_throw_exception_when_y2_is_out_of_range(int y2) {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata(5, 5);

        Exception exception = assertThrows(ChristmasLightsException.class, () ->
                christmasLightsKata.turnOn(0, 0, 0, y2));
        assertEquals(String.format("y(%d) is out of range", y2), exception.getMessage());
    }
}
