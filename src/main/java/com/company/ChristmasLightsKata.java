package com.company;

public class ChristmasLightsKata {

    private Light[][] lights;

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
}
