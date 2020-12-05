package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChristmasLightsKataTest {
    @Test
    public void test_one() {
        ChristmasLightsKata christmasLightsKata = new ChristmasLightsKata();
        assertEquals(1, christmasLightsKata.one());
    }
}
