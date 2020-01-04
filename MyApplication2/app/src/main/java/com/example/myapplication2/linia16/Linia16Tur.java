package com.example.myapplication2.linia16;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia16Tur extends AppCompatActivity {
   Button StadMunicipal;
   Button ComplexBartolomeu;
   Button StadionulTineretului;
   Button Fartec;
   Button AcademiaHenriCoanda;
   Button Plevnei;
   Button Universitate;
   Button Onix;
   Button Sanitas;
   Button Primarie;
   Button LivadaPostei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia16_tur);
    StadMunicipal= (Button) findViewById(R.id.stadmunicipalTur);
    StadMunicipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16StadMunicipalTur.class);
            startActivity(i);
        }
    });
    ComplexBartolomeu= (Button) findViewById(R.id.complexbartolomeuTur);
    ComplexBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16ComplexBartolomeuTur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiTur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16StadionulTineretuluiTur.class);
            startActivity(i);
        }
    });
    Fartec= (Button) findViewById(R.id.fartecTur);
    Fartec.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16FartecTur.class);
            startActivity(i);
        }
    });
    AcademiaHenriCoanda= (Button) findViewById(R.id.academiahenricoandaTur);
    AcademiaHenriCoanda.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16AcademiaHenriCoandaTur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiTur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16PlevneiTur.class);
            startActivity(i);
        }
    });
    Universitate= (Button) findViewById(R.id.universitateTur);
    Universitate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16UniversitateTur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixTur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16OnixTur.class);
            startActivity(i);
        }
    });
    Sanitas= (Button) findViewById(R.id.sanitasTur);
    Sanitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16SanitasTur.class);
            startActivity(i);
        }
    });
    Primarie= (Button) findViewById(R.id.primarieTur);
    Primarie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16PrimarieTur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Tur.this, Linia16LivadaPosteiTur.class);
            startActivity(i);
        }
    });
    }
}