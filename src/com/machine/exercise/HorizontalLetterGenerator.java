package com.machine.exercise;

public class HorizontalLetterGenerator {

    static int gridSize = 5;
    static String[] letters = {"X", "y", "z"};
    static char[][] layout = new char[gridSize][gridSize * letters.length];

    public static void main(String[] args) throws Exception {
        LetterFactory factory = new LetterFactory(gridSize);

        for (String s: letters) {
            char[][] c = factory.getLetter(s).buildLetter();
            printHorizontally(c);
        }
    }

    // TODO
    static void printHorizontally(char[][] letter) {

        for (int i = 0; i < layout.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                layout[i][j] = '*';
            }

        }

        Letter.printVertically(layout);
    }
}
