package com.example.myapplication2.linia25;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia25Tur extends AppCompatActivity {
   Button Roman;
   Button Carrefour;
   Button Cometei;
   Button Neptun;
   Button ComplexulMare;
   Button Gemenii;
   Button PanaitCerna;
   Button Branduselor;
   Button SalaSporturilor;
   Button GaraBrasov;
   Button BdGarii;
   Button IancuJianu;
   Button Plevnei;
   Button TudorVladimirescu;
   Button StadionulTineretului;
   Button Cosmesti;
   Button Zlatna;
   Button MolnarJanos;
   Button Facultativa;
   Button Avantgarden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia25_tur);
    Roman= (Button) findViewById(R.id.romanTur);
    Roman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25RomanTur.class);
            startActivity(i);
        }
    });
    Carrefour= (Button) findViewById(R.id.carrefourTur);
    Carrefour.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25CarrefourTur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiTur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25CometeiTur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunTur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25NeptunTur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareTur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25ComplexulMareTur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiTur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25GemeniiTur.class);
            startActivity(i);
        }
    });
    PanaitCerna= (Button) findViewById(R.id.panaitcernaTur);
    PanaitCerna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25PanaitCernaTur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorTur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25BranduselorTur.class);
            startActivity(i);
        }
    });
    SalaSporturilor= (Button) findViewById(R.id.salasporturilorTur);
    SalaSporturilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25SalaSporturilorTur.class);
            startActivity(i);
        }
    });
    GaraBrasov= (Button) findViewById(R.id.garabrasovTur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25GaraBrasovTur.class);
            startActivity(i);
        }
    });
    BdGarii= (Button) findViewById(R.id.bdgariiTur);
    BdGarii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25BdGariiTur.class);
            startActivity(i);
        }
    });
    IancuJianu= (Button) findViewById(R.id.iancujianuTur);
    IancuJianu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25IancuJianuTur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiTur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25PlevneiTur.class);
            startActivity(i);
        }
    });
    TudorVladimirescu= (Button) findViewById(R.id.tudorvladimirescuTur);
    TudorVladimirescu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25TudorVladimirescuTur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiTur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25StadionulTineretuluiTur.class);
            startActivity(i);
        }
    });
    Cosmesti= (Button) findViewById(R.id.cosmestiTur);
    Cosmesti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25CosmestiTur.class);
            startActivity(i);
        }
    });
    Zlatna= (Button) findViewById(R.id.zlatnaTur);
    Zlatna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25ZlatnaTur.class);
            startActivity(i);
        }
    });
    MolnarJanos= (Button) findViewById(R.id.molnarjanosTur);
    MolnarJanos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25MolnarJanosTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25FacultativaTur.class);
            startActivity(i);
        }
    });
    Avantgarden= (Button) findViewById(R.id.avantgardenTur);
    Avantgarden.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Tur.this, Linia25AvantgardenTur.class);
            startActivity(i);
        }
    });
    }
}