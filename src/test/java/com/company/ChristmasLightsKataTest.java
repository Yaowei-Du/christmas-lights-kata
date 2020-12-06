package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasLightsKataTest {
    @Test
    public void test_one() {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata();
        assertEquals(1, christmasLightsKata.one());
    }
}
