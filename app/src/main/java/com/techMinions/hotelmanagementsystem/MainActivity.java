package com.techMinions.hotelmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton roomBtn;
    ImageButton tableBtn;
    ImageButton deliBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roomBtn = findViewById(R.id.roomBtn);
        tableBtn = findViewById(R.id.tableBtn);
        deliBtn = findViewById(R.id.deliBtn);
    }

    @Override
    protected void onResume() {
        super.onResume();

        roomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myI = new Intent(MainActivity.this, rooms.class);
                startActivity(myI);
            }
        });

        tableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myI = new Intent(MainActivity.this, tables.class);
                startActivity(myI);
            }
        });

        deliBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent deli = new Intent(MainActivity.this, deliverylanding.class);
                startActivity(deli);
            }
        });
    }
}