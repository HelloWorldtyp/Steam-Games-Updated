package com.example.steamgamesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RacingGames extends AppCompatActivity {
    Button grandButton;
    Button forizonButton;
    Button snowButton;
    Button truckButton;
    Button homeScreenButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.racing);

        grandButton = findViewById(R.id.grandButton);
        forizonButton = findViewById(R.id.forizonButton);
        snowButton = findViewById(R.id.snowButton);
        truckButton = findViewById(R.id.truckButton);
        homeScreenButton = findViewById(R.id.homeScreenButton);

        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        grandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), GrandTheft.class);
                startActivity(i);
            }
        });

        forizonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), Forizon.class);
                startActivity(j);
            }
        });

        snowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), SnowRunner.class);
                startActivity(k);
            }
        });

        truckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), TruckSimulator.class);
                startActivity(l);
            }
        });

    }
}
