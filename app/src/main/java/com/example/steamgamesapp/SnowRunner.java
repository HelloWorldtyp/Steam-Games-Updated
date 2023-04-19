package com.example.steamgamesapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SnowRunner extends AppCompatActivity {
    Button buyButton;
    Button wishlistButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boomer);

        buyButton = findViewById(R.id.buyButton);
        wishlistButton = findViewById(R.id.wishlistButton);


    }
}
