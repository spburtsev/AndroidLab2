package com.example.androidlab2;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final CustomColor color = new CustomColor(0, 0, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView colorDisplay = findViewById(R.id.color_display);

        SeekBar redBar = findViewById(R.id.red_bar);
        TextView redLabel = findViewById(R.id.red_label);
        new ColorAccentConnector(
                color,
                redLabel,
                redBar,
                ColorIndex.RED,
                colorDisplay);

        SeekBar blueBar = findViewById(R.id.blue_bar);
        blueBar.setMax(CustomColor.MAX_VALUE);
        TextView blueLabel = findViewById(R.id.blue_label);
        new ColorAccentConnector(
                color,
                blueLabel,
                blueBar,
                ColorIndex.BLUE,
                colorDisplay);

        SeekBar greenBar = findViewById(R.id.green_bar);
        greenBar.setMax(CustomColor.MAX_VALUE);
        TextView greenLabel = findViewById(R.id.green_label);
        new ColorAccentConnector(
                color,
                greenLabel,
                greenBar,
                ColorIndex.GREEN,
                colorDisplay);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}