package com.example.myapplication2.linia37;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia37Retur extends AppCompatActivity {
   Button Craiter;
   Button PavilioaneleCFR;
   Button Autogara3;
   Button SalaSporturilor;
   Button GaraBrasov;
   Button Dacia;
   Button Infostar;
   Button LiceulMesota;
   Button HidroA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia37_retur);
    Craiter= (Button) findViewById(R.id.craiterRetur);
    Craiter.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Retur.this, Linia37CraiterRetur.class);
            startActivity(i);
        }
    });
    PavilioaneleCFR= (Button) findViewById(R.id.pavilioanelecfrRetur);
    PavilioaneleCFR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Retur.this, Linia37PavilioaneleCFRRetur.class);
            startActivity(i);
        }
    });
    Autogara3= (Button) findViewById(R.id.autogara3Retur);
    Autogara3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Retur.this, Linia37Autogara3Retur.class);
            startActivity(i);
        }
    });
    SalaSporturilor= (Button) findViewById(R.id.salasporturilorRetur);
    SalaSporturilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Retur.this, Linia37SalaSporturilorRetur.class);
            startActivity(i);
        }
    });
    GaraBrasov= (Button) findViewById(R.id.garabrasovRetur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Retur.this, Linia37GaraBrasovRetur.class);
            startActivity(i);
        }
    });
    Dacia= (Button) findViewById(R.id.daciaRetur);
    Dacia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Retur.this, Linia37DaciaRetur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarRetur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Retur.this, Linia37InfostarRetur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaRetur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Retur.this, Linia37LiceulMesotaRetur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaRetur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Retur.this, Linia37HidroARetur.class);
            startActivity(i);
        }
    });
    }
}