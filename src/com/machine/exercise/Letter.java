package com.machine.exercise;

public interface Letter {

    char[][] buildLetter();

    char[][] getLetter();

    static void printGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void plotHorizontally(char[][] letter, int columnStart, char[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                grid[i][j + columnStart] = letter[i][j];
            }
        }
    }
}
