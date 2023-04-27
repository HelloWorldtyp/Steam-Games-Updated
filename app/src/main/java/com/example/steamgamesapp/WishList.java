package com.example.steamgamesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class WishList  extends AppCompatActivity {
    EditText priceEdit;
    Spinner spinner;
    Button addButton;
    Button getPriceButton;
    Button deleteButton;
    Button homeScreenButton;
    DatabaseControl control;
    TextView resultView;
    RecyclerView recycle;
    public String[] getNames;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wishlist);

        addButton = findViewById(R.id.addButton);
        getPriceButton = findViewById(R.id.getButton);
        deleteButton = findViewById(R.id.deleteButton);
        homeScreenButton = findViewById(R.id.homeScreenButton);
        recycle = findViewById(R.id.recycle);
        spinner = findViewById(R.id.spinner);
        priceEdit = findViewById(R.id.editPrice);
        resultView = findViewById(R.id.resultView);

        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        getPriceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.open();
                String price = control.getPrice((String) spinner.getSelectedItem());
                control.close();
                resultView.setText(price+spinner.getSelectedItem());
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = (String) spinner.getSelectedItem();
                control.open();
                control.delete(name);
                control.close();
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = (String) spinner.getSelectedItem();
                String price = priceEdit.getText().toString();
                control.open();
                boolean itWorked = control.insert(name, price);
                control.close();
                if(itWorked){
                    Toast.makeText(getApplicationContext(), "Added "+name+" "+price, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "FAILED "+name+" "+price, Toast.LENGTH_SHORT).show();
                }
            }
        });

        control = new DatabaseControl(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.games, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onResume(){
        super.onResume();
        recycle.setLayoutManager(new LinearLayoutManager(this));
        control.open();
        getNames = control.getAllNamesArray();
        control.close();
        CustomAdapter adapter = new CustomAdapter(getNames);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomAdapter.ViewHolder viewHolder = (CustomAdapter.ViewHolder) view.getTag();
                TextView textView = viewHolder.getTextView();
                String name = textView.getText().toString();
                control.open();
                String price = control.getPrice(name);
                control.close();
                resultView.setText(price);
            }
        });
        recycle.setAdapter(adapter);
        Toast.makeText(this,adapter.getItemCount()+ "", Toast.LENGTH_SHORT).show();

    }
}
