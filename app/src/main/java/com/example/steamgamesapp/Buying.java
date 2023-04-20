package com.example.steamgamesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Buying extends AppCompatActivity {
    Button completeButton;
    EditText game;
    EditText price;
    EditText CSC;
    EditText numbers;
    EditText experiationDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buying);

        completeButton = findViewById(R.id.ompleteButton);



    }

}
