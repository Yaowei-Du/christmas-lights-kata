package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test_one() {
        Main main = new Main();
        assertEquals(1, main.one());
    }
}
