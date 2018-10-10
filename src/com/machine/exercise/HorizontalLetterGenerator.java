package com.machine.exercise;

public class HorizontalLetterGenerator {

    static int gridSize = 9;
    static String[] letters = {"X", "y", "z"};
    static int yGridTotal = gridSize * letters.length;
    static char[][] layout = new char[gridSize][yGridTotal];


    public static void main(String[] args) throws Exception {

        LetterFactory factory = new LetterFactory(gridSize);

        int count = 0;
        for (String s: letters) {
            char[][] c = factory.getLetter(s).buildLetter();
            printHorizontally(c, count);
            count += yGridTotal/letters.length;
        }

        Letter.printVertically(layout);
    }

    static void printHorizontally(char[][] letter, int columnStart) {

        for (int i = 0; i < layout.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                layout[i][j+columnStart] = letter[i][j];
            }
        }
    }
}
