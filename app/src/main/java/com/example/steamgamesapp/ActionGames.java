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
                Intent i = new Intent(getApplicationContext(), ActionGames.class);
                startActivity(i);
            }
        });

    }
}
