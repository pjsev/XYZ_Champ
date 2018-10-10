package com.machine.exercise;

public class VerticalLetterGenerator {

    static int gridSize = 5;
    static String[] letters = {"X", "y", "z", "z"};

    public static void main(String[] args) throws Exception {

        LetterFactory factory = new LetterFactory(gridSize);

        for (String s: letters) {
            char[][] c = factory.getLetter(s).buildLetter();
            printVertically(c);
        }

        /*
        Letter letterX = factory.getLetter("x");
        letterX.buildLetter();
        Letter.printVertically(letterX.getLetter());

        Letter letterY = factory.getLetter("y");
        letterY.buildLetter();
        Letter.printVertically(letterY.getLetter());

        Letter letterZ = factory.getLetter("z");
        letterZ.buildLetter();
        Letter.printVertically(letterZ.getLetter());
        */
    }

    public static void printVertically(char[][] grid) {
        Letter.printGrid(grid);
    }
}
