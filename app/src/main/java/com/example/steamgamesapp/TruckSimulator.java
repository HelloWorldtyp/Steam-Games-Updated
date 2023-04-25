package com.example.steamgamesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TruckSimulator extends AppCompatActivity {
    Button buyButton;
    Button wishlistButton;
    Button homeScreenButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trucksimulator);

        buyButton = findViewById(R.id.buyButton);
        wishlistButton = findViewById(R.id.wishlistButton);
        homeScreenButton = findViewById(R.id.homeScreenButton);

        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        wishlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WishList.class);
                startActivity(i);
            }
        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), Buying.class);
                startActivity(j);
            }
        });


    }
}
