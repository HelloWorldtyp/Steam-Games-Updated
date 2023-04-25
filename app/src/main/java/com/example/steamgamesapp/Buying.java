package com.example.steamgamesapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.security.Security;

public class Buying extends AppCompatActivity {
    private int newCard;
    private int newSecurity;
    private int newExperation;
    private int intPrice;



    Button completeButton;
    Button settingsButton;
    EditText CSC;
    EditText card;
    EditText experiationDate;
    EditText price;
    EditText game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buying);

        completeButton = findViewById(R.id.ompleteButton);
        settingsButton = findViewById(R.id.settingsButton);

        CSC = findViewById(R.id.cardSecurity);
        card = findViewById(R.id.credit);
        experiationDate = findViewById(R.id.experationDate);
        price = findViewById(R.id.price);
        game = findViewById(R.id.nameOfGame);

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Settings.class);
                startActivity(i);
            }
        });

        completeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t;
                t = Toast.makeText(getApplicationContext(), "You Purchased the Game", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                t.show();
            }
        });


    }

    private void updateCreditCard(){
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        newCard = sp.getInt("new tip", 69);
        newSecurity = sp.getInt("new secuirty", 69);
        newExperation = sp.getInt("new experation", 69);
        card.setText(newCard + "");
        CSC.setText(newSecurity + "");
        experiationDate.setText(newExperation + "");

    }
    private void updateSharedPreferences(){
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        intPrice = Integer.parseInt(price.getText().toString());
        String Security = game.getText().toString();
        editor.putInt("new card", intPrice);
        editor.putString("new secuirty", Security);
        editor.commit();
    }

    private void updateFinal(){
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        intPrice = sp.getInt("new price", 69);
        String Security = sp.getString("new secuirty", "string");
        price.setText(intPrice + "");
        game.setText(Security + "");


    }

    @Override
    public void onResume(){
        super.onResume();
        updateCreditCard();
        updateFinal();
    }

}
