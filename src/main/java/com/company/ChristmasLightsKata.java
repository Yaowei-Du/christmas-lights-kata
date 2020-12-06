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

    public void turnOn(int x1, int y1, int x2, int y2) throws ChristmasLightsException {
        executeRangeOf(x1, y1, x2, y2, LightCommand.ON);
    }

    public void turnOff(int x1, int y1, int x2, int y2) throws ChristmasLightsException {
        executeRangeOf(x1, y1, x2, y2, LightCommand.OFF);
    }

    public void toggle(int x1, int y1, int x2, int y2) throws ChristmasLightsException {
        executeRangeOf(x1, y1, x2, y2, LightCommand.TOGGLE);
    }

    private void executeRangeOf(int x1, int y1, int x2, int y2, LightCommand command) throws ChristmasLightsException {
        isInGrid(x1, y1);
        isInGrid(x2, y2);
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                lights[i][j].execute(command);
            }
        }
    }

    private void isInGrid(int x, int y) throws ChristmasLightsException {
        if (x < 0 || x >= lights.length) {
            throw new ChristmasLightsException(String.format("x(%d) is out of range", x));
        }
        if (y < 0 || y >= lights[0].length) {
            throw new ChristmasLightsException(String.format("y(%d) is out of range", y));
        }
    }
}
