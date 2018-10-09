package com.machine.exercise;

public class LetterY implements Letter {

    char[][] yGrid;
    int gridSize;

    public LetterY(int gridSize) {
        this.gridSize = gridSize;
        this.yGrid = new char[gridSize][gridSize];
    }

    @Override
    public char[][] buildLetter() {
        for (int i = 0; i < yGrid.length; i++) {
            if (i <= yGrid.length/2 ) {
                yGrid[i][i] = '*';
                yGrid[i][gridSize - i - 1] = '*';
            } else {
                yGrid[i][yGrid.length/2] = '*';
            }
        }
        return yGrid;
    }

    @Override
    public char[][] getLetter() {
        return yGrid;
    }
}
