package com.example.myapplication2.linia23b;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia23BTur extends AppCompatActivity {
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
   Button Autogara3;
   Button RATBrasov;
   Button Triaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia23b_tur);
    StadMunicipal= (Button) findViewById(R.id.stadmunicipalTur);
    StadMunicipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BStadMunicipalTur.class);
            startActivity(i);
        }
    });
    ComplexBartolomeu= (Button) findViewById(R.id.complexbartolomeuTur);
    ComplexBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BComplexBartolomeuTur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiTur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BStadionulTineretuluiTur.class);
            startActivity(i);
        }
    });
    Fartec= (Button) findViewById(R.id.fartecTur);
    Fartec.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BFartecTur.class);
            startActivity(i);
        }
    });
    AcademiaHenriCoanda= (Button) findViewById(R.id.academiahenricoandaTur);
    AcademiaHenriCoanda.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BAcademiaHenriCoandaTur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiTur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BPlevneiTur.class);
            startActivity(i);
        }
    });
    IancuJianu= (Button) findViewById(R.id.iancujianuTur);
    IancuJianu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BIancuJianuTur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetTur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BFagetTur.class);
            startActivity(i);
        }
    });
    Caprioara= (Button) findViewById(R.id.caprioaraTur);
    Caprioara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BCaprioaraTur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaTur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BVlahutaTur.class);
            startActivity(i);
        }
    });
    Autogara3= (Button) findViewById(R.id.autogara3Tur);
    Autogara3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BAutogara3Tur.class);
            startActivity(i);
        }
    });
    RATBrasov= (Button) findViewById(R.id.ratbrasovTur);
    RATBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BRATBrasovTur.class);
            startActivity(i);
        }
    });
    Triaj= (Button) findViewById(R.id.triajTur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23BTur.this, Linia23BTriajTur.class);
            startActivity(i);
        }
    });
    }
}