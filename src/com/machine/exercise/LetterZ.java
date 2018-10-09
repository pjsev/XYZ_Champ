package com.machine.exercise;

public class LetterZ implements Letter {

    char[][] zGrid;
    int gridSize;

    public LetterZ(int gridSize) {
        this.gridSize = gridSize;
        this.zGrid = new char[gridSize][gridSize];
    }

    @Override
    public char[][] buildLetter() {
        for (int i = 0; i < zGrid.length; i++) {
            if (i == 0 || i == zGrid.length - 1) {
                for (int j = 0; j < zGrid.length; j++) {
                    zGrid[i][j] = '*';
                }
            } else {
                zGrid[i][zGrid.length - i - 1] = '*';
            }
        }
        return zGrid;
    }

    @Override
    public char[][] getLetter() {
        return zGrid;
    }
}
