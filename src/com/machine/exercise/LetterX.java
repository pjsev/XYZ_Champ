package com.machine.exercise;

public class LetterX implements Letter {

    char[][] xGrid;
    int gridSize;

    public LetterX(int gridSize) {
        this.gridSize = gridSize;
        this.xGrid = new char[gridSize][gridSize];
    }

    @Override
    public char[][] buildLetter() {
        for (int i = 0; i < xGrid.length; i++) {
            xGrid[i][i] = '*';
            xGrid[i][xGrid.length - i - 1] = '*';
        }
        return xGrid;
    }

    @Override
    public char[][] getLetter() {
        return xGrid;
    }
}
