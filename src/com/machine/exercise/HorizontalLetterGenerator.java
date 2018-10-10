package com.machine.exercise;

public class HorizontalLetterGenerator {

    static int gridSize = 9;
    static String[] letters = {"X", "y", "z", "x", "Y"};
    static int yGridTotal = gridSize * letters.length;
    static char[][] layout = new char[gridSize][yGridTotal];

    public static void main(String[] args) throws Exception {

        LetterFactory factory = new LetterFactory(gridSize);

        int count = 0;
        for (String s: letters) {
            char[][] c = factory.getLetter(s).buildLetter();
            Letter.plotHorizontally(c, count, layout);
            count += yGridTotal/letters.length;
        }

        printHorizontally(layout);
    }

    public static void printHorizontally(char[][] grid) {
        Letter.printGrid(layout);
    }
}
