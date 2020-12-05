package com.company;

public class ChristmasLightsKata {

    private final Light[][] lights;

    public ChristmasLightsKata(int gridX, int gridY) {
        lights = new Light[gridX][gridY];

        for (int i = 0; i < gridY; i++) {
            for (int j = 0; j < gridX; j++) {
                lights[i][j] = new Light();
            }
        }
    }

    public Light getLight(int x, int y) {
        return lights[x][y];
    }

    public void turnOn(int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                lights[i][j].turnOn();
            }
        }
    }
}
