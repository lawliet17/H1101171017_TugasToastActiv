package com.example.h1101171017_tugastoastactiv;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int naik = 17;
    Button toast, countu, countd;
    TextView angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast = (Button) findViewById(R.id.button_toast);
        countu = (Button) findViewById(R.id.button_countu);
        countd = (Button) findViewById(R.id.button_countd);
        angka = (TextView) findViewById(R.id.angka);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Rino Ramadhan", Toast.LENGTH_SHORT).show();
            }
        });


        countu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik++;
                angka.setText(Integer.toString(naik));
            }
        });

        countd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik--;
                angka.setText(Integer.toString(naik));

            }
        });
    }}
