package com.example.androidlab2;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class ColorAccentConnector {
    private final ImageView colorDisplay;
    private final CustomColor customColor;
    private final SeekBar bar;
    private final ColorIndex colorIndex;
    private final AccentLabelConnector labelConnector;

    public ColorAccentConnector(CustomColor color,
                                TextView label,
                                SeekBar bar,
                                ColorIndex colorIndex,
                                ImageView colorDisplay) {
        this.customColor = color;
        this.bar = bar;
        this.colorIndex = colorIndex;
        this.colorDisplay = colorDisplay;
        labelConnector = new AccentLabelConnector(label, colorIndex, 0);
        bar.setMax(CustomColor.MAX_VALUE);
        bar.setProgress(0);
        bar.setOnSeekBarChangeListener(getListener());
    }

    public void setValue(int value) {
        labelConnector.setValue(value);
        bar.setProgress(value);
        switch (colorIndex) {
            case RED:
                customColor.setRed(value);
                break;
            case GREEN:
                customColor.setGreen(value);
                break;
            case BLUE:
                customColor.setBlue(value);
                break;
            default:
                break;
        }
    }
    private SeekBar.OnSeekBarChangeListener getListener() {
        return new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setValue(progress);
                colorDisplay.setBackgroundColor(customColor.rgb());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // do nothing
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // do nothing
            }
        };
    }

}
