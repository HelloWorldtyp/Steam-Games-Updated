package com.example.steamgamesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BoomerGames extends AppCompatActivity {
    Button ultraButton;
    Button culticButton;
    Button doomButton;
    Button doomEternalButton;
    Button homeScreenButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boomer);

        ultraButton = findViewById(R.id.ultraButton);
        culticButton = findViewById(R.id.culticButton);
        doomButton = findViewById(R.id.doomButton);
        doomEternalButton = findViewById(R.id.doomEternalButton);
        homeScreenButton = findViewById(R.id.homeScreenButton);

        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        ultraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UltraKill.class);
                startActivity(i);
            }
        });

        culticButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), cultic.class);
                startActivity(k);
            }
        });

        doomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Doom.class);
                startActivity(l);
            }
        });

        doomEternalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), DoomEternal.class);
                startActivity(m);
            }
        });

    }
}
