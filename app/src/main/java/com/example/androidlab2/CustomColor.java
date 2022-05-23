package com.example.androidlab2;

import android.graphics.Color;

public class CustomColor {
    public static final int MAX_VALUE = 255;

    private int red;
    private int green;
    private int blue;

    public CustomColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int rgb() {
        return Color.rgb(red, green, blue);
    }
}

