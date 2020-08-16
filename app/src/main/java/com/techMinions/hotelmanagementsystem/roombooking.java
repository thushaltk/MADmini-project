package com.techMinions.hotelmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class roombooking extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    Spinner rlist;
    Button btnbnwrb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roombooking);
        EditText date_picker = findViewById(R.id.chiinput);
        EditText date_picker2 = findViewById(R.id.choinput);


        btnbnwrb = findViewById(R.id.rbbtn);



        date_picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });

        date_picker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });


        rlist = findViewById(R.id.roomlist);
        ArrayAdapter<String> radp = new ArrayAdapter<String>(roombooking.this,
                android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.rolist));
        radp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rlist.setAdapter(radp);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, day);
        String currentDate = DateFormat.getDateInstance().format(c.getTime());

        EditText date_picker = findViewById(R.id.chiinput);
        date_picker.setText(currentDate);
        EditText date_picker2 = findViewById(R.id.choinput);
        date_picker2.setText(currentDate);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btnbnwrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myI2 = new Intent(roombooking.this, bookedroomdply.class);

                //Toast Message for reacting to button click
                Context context = getApplicationContext();
                CharSequence message = "Syncing with Database...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();
                startActivity(myI2);
            }
        });
    }

}