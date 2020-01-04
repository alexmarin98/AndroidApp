package com.example.myapplication2.linia23;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia23Tur extends AppCompatActivity {
   Button StadMunicipal;
   Button ComplexBartolomeu;
   Button StadionulTineretului;
   Button Fartec;
   Button AcademiaHenriCoanda;
   Button Plevnei;
   Button IancuJianu;
   Button Faget;
   Button Caprioara;
   Button Vlahuta;
   Button Branduselor;
   Button Gemenii;
   Button ComplexulMare;
   Button Neptun;
   Button Cometei;
   Button Saturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia23_tur);
    StadMunicipal= (Button) findViewById(R.id.stadmunicipalTur);
    StadMunicipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23StadMunicipalTur.class);
            startActivity(i);
        }
    });
    ComplexBartolomeu= (Button) findViewById(R.id.complexbartolomeuTur);
    ComplexBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23ComplexBartolomeuTur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiTur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23StadionulTineretuluiTur.class);
            startActivity(i);
        }
    });
    Fartec= (Button) findViewById(R.id.fartecTur);
    Fartec.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23FartecTur.class);
            startActivity(i);
        }
    });
    AcademiaHenriCoanda= (Button) findViewById(R.id.academiahenricoandaTur);
    AcademiaHenriCoanda.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23AcademiaHenriCoandaTur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiTur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23PlevneiTur.class);
            startActivity(i);
        }
    });
    IancuJianu= (Button) findViewById(R.id.iancujianuTur);
    IancuJianu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23IancuJianuTur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetTur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23FagetTur.class);
            startActivity(i);
        }
    });
    Caprioara= (Button) findViewById(R.id.caprioaraTur);
    Caprioara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23CaprioaraTur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaTur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23VlahutaTur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorTur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23BranduselorTur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiTur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23GemeniiTur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareTur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23ComplexulMareTur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunTur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23NeptunTur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiTur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23CometeiTur.class);
            startActivity(i);
        }
    });
    Saturn= (Button) findViewById(R.id.saturnTur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Tur.this, Linia23SaturnTur.class);
            startActivity(i);
        }
    });
    }
}