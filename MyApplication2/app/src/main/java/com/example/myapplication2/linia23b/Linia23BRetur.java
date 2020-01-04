package com.example.myapplication2.linia23b;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia23BRetur extends AppCompatActivity {
   Button Triaj;
   Button RATBrasov;
   Button Autogara3;
   Button SalaSporturilor;
   Button BdGarii;
   Button IancuJianu;
   Button Plevnei;
   Button TudorVladimirescu;
   Button StadionulTineretului;
   Button BartolomeuGara;
   Button StadMunicipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia23b_retur);
    Triaj= (Button) findViewById(R.id.triajRetur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BTriajRetur.class);
            startActivity(i);
        }
    });
    RATBrasov= (Button) findViewById(R.id.ratbrasovRetur);
    RATBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BRATBrasovRetur.class);
            startActivity(i);
        }
    });
    Autogara3= (Button) findViewById(R.id.autogara3Retur);
    Autogara3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BAutogara3Retur.class);
            startActivity(i);
        }
    });
    SalaSporturilor= (Button) findViewById(R.id.salasporturilorRetur);
    SalaSporturilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BSalaSporturilorRetur.class);
            startActivity(i);
        }
    });
    BdGarii= (Button) findViewById(R.id.bdgariiRetur);
    BdGarii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BBdGariiRetur.class);
            startActivity(i);
        }
    });
    IancuJianu= (Button) findViewById(R.id.iancujianuRetur);
    IancuJianu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BIancuJianuRetur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiRetur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BPlevneiRetur.class);
            startActivity(i);
        }
    });
    TudorVladimirescu= (Button) findViewById(R.id.tudorvladimirescuRetur);
    TudorVladimirescu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BTudorVladimirescuRetur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiRetur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BStadionulTineretuluiRetur.class);
            startActivity(i);
        }
    });
    BartolomeuGara= (Button) findViewById(R.id.bartolomeugaraRetur);
    BartolomeuGara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BBartolomeuGaraRetur.class);
            startActivity(i);
        }
    });
    StadMunicipal= (Button) findViewById(R.id.stadmunicipalRetur);
    StadMunicipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BRetur.this, Linia23BStadMunicipalRetur.class);
            startActivity(i);
        }
    });
    }
}