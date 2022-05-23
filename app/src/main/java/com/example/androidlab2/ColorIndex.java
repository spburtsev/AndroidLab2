package com.example.androidlab2;

public enum ColorIndex {
    RED, GREEN, BLUE;

    public char getChar() {
        switch (this) {
            case RED:
                return 'R';
            case GREEN:
                return 'G';
            case BLUE:
                return 'B';
            default:
                return ' ';
        }
    }
}
