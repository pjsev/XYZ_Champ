package com.machine.exercise;

public class LetterFactory {

    int gridSize;

    public LetterFactory(int gridSize) throws Exception {
        this.gridSize = validate(gridSize);
    }

    public Letter getLetter(String s) {
        if (s.equalsIgnoreCase("x")) {
            return new LetterX(gridSize);
        } else if (s.equalsIgnoreCase("y")) {
            return new LetterY(gridSize);
        } else if (s.equalsIgnoreCase("z")) {
            return new LetterZ(gridSize);
        }
        return null;
    }

    public int validate(int size) throws Exception {
        if (size % 2 == 0 || size < 3) {
            throw new Exception("Only odd numbers 3 and above are allowed");
        }
        return size;
    }
}
