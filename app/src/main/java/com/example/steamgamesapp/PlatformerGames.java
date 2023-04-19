package com.example.steamgamesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class PlatformerGames extends AppCompatActivity {
    Button hatButton;
    Button cupButton;
    Button rainButton;
    Button deadButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.platformers);

        hatButton = findViewById(R.id.hatButton);
        cupButton = findViewById(R.id.cupButton);
        rainButton = findViewById(R.id.rainButon);
        deadButton = findViewById(R.id.deadButton);

        hatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), HatInTime.class);
                startActivity(i);
            }
        });

        cupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), Cuphead.class);
                startActivity(j);
            }
        });

        rainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), RainWorld.class);
                startActivity(k);
            }
        });

        deadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), DeadCells.class);
                startActivity(l);
            }
        });

    }
}
