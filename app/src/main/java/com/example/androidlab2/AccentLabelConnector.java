package com.example.androidlab2;

import android.widget.TextView;

import java.util.Locale;

public class AccentLabelConnector {
    private final TextView label;
    private final ColorIndex colorIndex;

    public AccentLabelConnector(TextView label, ColorIndex colorIndex, int initialValue) {
        this.label = label;
        this.colorIndex = colorIndex;
        setValue(initialValue);
    }

    public void setValue(int value) {
        label.setText(
                String.format(Locale.getDefault(), "%c: %d", colorIndex.getChar(), value));
    }
}
