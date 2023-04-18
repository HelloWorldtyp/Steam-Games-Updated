package com.example.steamgamesapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RacingGames extends AppCompatActivity {
    Button grandButton;
    Button forizonButton;
    Button snowButton;
    Button truckButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.racing);

        grandButton = findViewById(R.id.grandButton);
        forizonButton = findViewById(R.id.forizonButton);
        snowButton = findViewById(R.id.snowButton);
        truckButton = findViewById(R.id.truckButton);

    }
}
