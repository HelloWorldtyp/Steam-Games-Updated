package com.example.steamgamesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActionGames extends AppCompatActivity {
    Button destinyButton;
    Button apexButton;
    Button dotaButton;
    Button pubgButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_games);

        destinyButton = findViewById(R.id.destinyButton);
        apexButton = findViewById(R.id.apexButton);
        dotaButton = findViewById(R.id.dotaButton);
        pubgButton = findViewById(R.id.pubgButton);

        destinyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Destiny.class);
                startActivity(i);
            }
        });

        apexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), apexlegends.class);
                startActivity(j);
            }
        });

        dotaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), Dota.class);
                startActivity(k);
            }
        });

        pubgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), PUBG.class);
                startActivity(l);
            }
        });

    }
}
