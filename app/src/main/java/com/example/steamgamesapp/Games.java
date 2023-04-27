package com.example.steamgamesapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Games extends AppCompatActivity {

    private int newPrice;
    private String newGame;
    Button homeScreenButton;
    TextView games;
    TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games);

        games = findViewById(R.id.theGame);
        price = findViewById(R.id.thePrice);
        homeScreenButton = findViewById(R.id.homeScreenButton);

        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
            }
        });

    }



    private void updateGames(){
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        newPrice = sp.getInt("new price", 69);
        newGame = sp.getString("new game", "Game");
        games.setText(newGame + "");
        price.setText(newPrice + "");
//
    }
    //
    @Override
    public void onResume(){
        super.onResume();
        updateGames();
    }

}
