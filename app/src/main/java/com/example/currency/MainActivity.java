package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText input,output;
    RadioButton usd,euro,pound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.india);
        output = findViewById(R.id.other);

        usd = findViewById(R.id.usd);
        usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                double b;
                b = a/72.9;
                output.setText(String.valueOf(b));
            }
        });
        euro = findViewById(R.id.euro);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                double b;
                b = a/88.04;
                output.setText(String.valueOf(b));
            }
        });
        pound = findViewById(R.id.pound);
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(input.getText().toString());
                double b;
                b = a/100.41;
                output.setText(String.valueOf(b));
            }
        });


    }
}