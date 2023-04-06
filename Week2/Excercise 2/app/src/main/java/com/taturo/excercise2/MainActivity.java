package com.taturo.excercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout buttonLayout;
    private Button redButton, greenButton, blueButton, grayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLayout = findViewById(R.id.button_layout);
        redButton = findViewById(R.id.red_button);
        greenButton = findViewById(R.id.green_button);
        blueButton = findViewById(R.id.blue_button);
        grayButton = findViewById(R.id.gray_button);

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set background color of activity to red
                getWindow().getDecorView().setBackgroundColor(Color.RED);
            }
        });

        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set background color of activity to green
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            }
        });

        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set background color of activity to blue
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            }
        });

        grayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set background color of activity to gray
                getWindow().getDecorView().setBackgroundColor(Color.GRAY);
            }
        });
    }
}