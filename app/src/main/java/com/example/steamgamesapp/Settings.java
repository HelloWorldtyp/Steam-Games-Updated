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

public class Settings extends AppCompatActivity {

    private int intCard;
    private int intSecurity;
    private int intExperation;

    EditText creditCardNumber;
    EditText cardSecuirtyCode;
    EditText experationDate;
    Button homeScreenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardsettings);

       creditCardNumber = findViewById(R.id.creditCardNumber);
       cardSecuirtyCode = findViewById(R.id.cardSecurity);
       experationDate = findViewById(R.id.experationDate);
       homeScreenButton = findViewById(R.id.homeScreenButton);

        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
            }
        });

    }

    @Override
    public void onPause(){
        super.onPause();
        updateSharedPreferences();
    }
    //
    private void updateSharedPreferences(){
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        intCard = Integer.parseInt(creditCardNumber.getText().toString());
        intSecurity = Integer.parseInt(cardSecuirtyCode.getText().toString());
        intExperation = Integer.parseInt(experationDate.getText().toString());
        editor.putInt("new card", intCard);
        editor.putInt("new security", intSecurity);
        editor.putInt("new expiration", intExperation);
        editor.commit();
    }

    private void updateFinal(){
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        intCard = sp.getInt("new card", 69);
        intSecurity = sp.getInt("new security", 69);
        intExperation = sp.getInt("new expiration", 69);
        creditCardNumber.setText(intCard + "");
        cardSecuirtyCode.setText(intSecurity + "");
        experationDate.setText(intExperation + "");

    }

    @Override
    public void onResume(){
        super.onResume();
        updateFinal();
    }
}
