package com.example.steamgamesapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BoomerGames extends AppCompatActivity {
    Button ultraButton;
    Button culticButton;
    Button doomButton;
    Button doomEternalButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boomer);

        ultraButton = findViewById(R.id.ultraButton);
        culticButton = findViewById(R.id.culticButton);
        doomButton = findViewById(R.id.doomButton);
        doomEternalButton = findViewById(R.id.doomEternalButton);

    }
}
