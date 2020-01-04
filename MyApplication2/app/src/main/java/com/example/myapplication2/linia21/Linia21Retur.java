package com.example.myapplication2.linia21;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia21Retur extends AppCompatActivity {
   Button Triaj;
   Button RATBrasov;
   Button Autogara3;
   Button Vlahuta;
   Button Branduselor;
   Button Gemenii;
   Button ComplexulMare;
   Button Neptun;
   Button Cometei;
   Button Saturn;
   Button Praktiker;
   Button Metro;
   Button Aurora;
   Button PoianaDarste;
   Button StrandNoua;
   Button ScGen9;
   Button Facultativa;
   Button Noua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia21_retur);
    Triaj= (Button) findViewById(R.id.triajRetur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21TriajRetur.class);
            startActivity(i);
        }
    });
    RATBrasov= (Button) findViewById(R.id.ratbrasovRetur);
    RATBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21RATBrasovRetur.class);
            startActivity(i);
        }
    });
    Autogara3= (Button) findViewById(R.id.autogara3Retur);
    Autogara3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21Autogara3Retur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaRetur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21VlahutaRetur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorRetur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21BranduselorRetur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiRetur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21GemeniiRetur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareRetur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21ComplexulMareRetur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunRetur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21NeptunRetur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiRetur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21CometeiRetur.class);
            startActivity(i);
        }
    });
    Saturn= (Button) findViewById(R.id.saturnRetur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21SaturnRetur.class);
            startActivity(i);
        }
    });
    Praktiker= (Button) findViewById(R.id.praktikerRetur);
    Praktiker.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21PraktikerRetur.class);
            startActivity(i);
        }
    });
    Metro= (Button) findViewById(R.id.metroRetur);
    Metro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21MetroRetur.class);
            startActivity(i);
        }
    });
    Aurora= (Button) findViewById(R.id.auroraRetur);
    Aurora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21AuroraRetur.class);
            startActivity(i);
        }
    });
    PoianaDarste= (Button) findViewById(R.id.poianadarsteRetur);
    PoianaDarste.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21PoianaDarsteRetur.class);
            startActivity(i);
        }
    });
    StrandNoua= (Button) findViewById(R.id.strandnouaRetur);
    StrandNoua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21StrandNouaRetur.class);
            startActivity(i);
        }
    });
    ScGen9= (Button) findViewById(R.id.scgen9Retur);
    ScGen9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21ScGen9Retur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21FacultativaRetur.class);
            startActivity(i);
        }
    });
    Noua= (Button) findViewById(R.id.nouaRetur);
    Noua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Retur.this, Linia21NouaRetur.class);
            startActivity(i);
        }
    });
    }
}