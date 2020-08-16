package com.techMinions.hotelmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class updateroom extends AppCompatActivity {

    Button uproombtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updateroom);

        uproombtn = findViewById(R.id.rupbtn);
    }

    @Override
    protected void onResume() {
        super.onResume();

        uproombtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myI5 = new Intent(updateroom.this, bookedroomdply.class);
                startActivity(myI5);
            }
        });
    }
}