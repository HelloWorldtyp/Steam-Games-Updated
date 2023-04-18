package com.example.steamgamesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button actionButton;
    Button boomerButton;
    Button racingButton;
    Button platformersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionButton = findViewById(R.id.actionButton);
        boomerButton = findViewById(R.id.boomerButton);
        racingButton = findViewById(R.id.racingButton);
        platformersButton = findViewById(R.id.platformersButton);



        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ActionGames.class);
                startActivity(i);
            }
        });

        boomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), BoomerGames.class);
                startActivity(k);
            }
        });

        racingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), RacingGames.class);
                startActivity(l);
            }
        });

        platformersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), PlatformerGames.class);
                startActivity(m);
            }
        });
    }
}