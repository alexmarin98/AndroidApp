package com.example.myapplication2.linia17;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia17Retur extends AppCompatActivity {
   Button Noua;
   Button Rozmarinului;
   Button StrandNoua;
   Button PoianaDarste;
   Button Aurora;
   Button Selgros;
   Button Carrefour;
   Button Soarelui;
   Button Berzei;
   Button LiceulInformatica;
   Button SpitalulJudetean;
   Button Toamnei;
   Button LiceulMesota;
   Button CameraDeComert;
   Button Sanitas;
   Button Primarie;
   Button LivadaPostei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia17_retur);
    Noua= (Button) findViewById(R.id.nouaRetur);
    Noua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17NouaRetur.class);
            startActivity(i);
        }
    });
    Rozmarinului= (Button) findViewById(R.id.rozmarinuluiRetur);
    Rozmarinului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17RozmarinuluiRetur.class);
            startActivity(i);
        }
    });
    StrandNoua= (Button) findViewById(R.id.strandnouaRetur);
    StrandNoua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17StrandNouaRetur.class);
            startActivity(i);
        }
    });
    PoianaDarste= (Button) findViewById(R.id.poianadarsteRetur);
    PoianaDarste.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17PoianaDarsteRetur.class);
            startActivity(i);
        }
    });
    Aurora= (Button) findViewById(R.id.auroraRetur);
    Aurora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17AuroraRetur.class);
            startActivity(i);
        }
    });
    Selgros= (Button) findViewById(R.id.selgrosRetur);
    Selgros.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17SelgrosRetur.class);
            startActivity(i);
        }
    });
    Carrefour= (Button) findViewById(R.id.carrefourRetur);
    Carrefour.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17CarrefourRetur.class);
            startActivity(i);
        }
    });
    Soarelui= (Button) findViewById(R.id.soareluiRetur);
    Soarelui.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17SoareluiRetur.class);
            startActivity(i);
        }
    });
    Berzei= (Button) findViewById(R.id.berzeiRetur);
    Berzei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17BerzeiRetur.class);
            startActivity(i);
        }
    });
    LiceulInformatica= (Button) findViewById(R.id.liceulinformaticaRetur);
    LiceulInformatica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17LiceulInformaticaRetur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanRetur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17SpitalulJudeteanRetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17ToamneiRetur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaRetur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17LiceulMesotaRetur.class);
            startActivity(i);
        }
    });
    CameraDeComert= (Button) findViewById(R.id.cameradecomertRetur);
    CameraDeComert.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17CameraDeComertRetur.class);
            startActivity(i);
        }
    });
    Sanitas= (Button) findViewById(R.id.sanitasRetur);
    Sanitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17SanitasRetur.class);
            startActivity(i);
        }
    });
    Primarie= (Button) findViewById(R.id.primarieRetur);
    Primarie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17PrimarieRetur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Retur.this, Linia17LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    }
}