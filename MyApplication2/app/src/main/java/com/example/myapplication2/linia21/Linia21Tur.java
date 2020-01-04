package com.example.myapplication2.linia21;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia21Tur extends AppCompatActivity {
   Button Noua;
   Button Rozmarinului;
   Button StrandNoua;
   Button PoianaDarste;
   Button Aurora;
   Button Selgros;
   Button Carrefour;
   Button Saturn;
   Button Cometei;
   Button Neptun;
   Button ComplexulMare;
   Button Gemenii;
   Button PanaitCerna;
   Button Branduselor;
   Button Vlahuta;
   Button Autogara3;
   Button RATBrasov;
   Button Triaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia21_tur);
    Noua= (Button) findViewById(R.id.nouaTur);
    Noua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21NouaTur.class);
            startActivity(i);
        }
    });
    Rozmarinului= (Button) findViewById(R.id.rozmarinuluiTur);
    Rozmarinului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21RozmarinuluiTur.class);
            startActivity(i);
        }
    });
    StrandNoua= (Button) findViewById(R.id.strandnouaTur);
    StrandNoua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21StrandNouaTur.class);
            startActivity(i);
        }
    });
    PoianaDarste= (Button) findViewById(R.id.poianadarsteTur);
    PoianaDarste.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21PoianaDarsteTur.class);
            startActivity(i);
        }
    });
    Aurora= (Button) findViewById(R.id.auroraTur);
    Aurora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21AuroraTur.class);
            startActivity(i);
        }
    });
    Selgros= (Button) findViewById(R.id.selgrosTur);
    Selgros.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21SelgrosTur.class);
            startActivity(i);
        }
    });
    Carrefour= (Button) findViewById(R.id.carrefourTur);
    Carrefour.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21CarrefourTur.class);
            startActivity(i);
        }
    });
    Saturn= (Button) findViewById(R.id.saturnTur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21SaturnTur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiTur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21CometeiTur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunTur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21NeptunTur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareTur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21ComplexulMareTur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiTur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21GemeniiTur.class);
            startActivity(i);
        }
    });
    PanaitCerna= (Button) findViewById(R.id.panaitcernaTur);
    PanaitCerna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21PanaitCernaTur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorTur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21BranduselorTur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaTur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21VlahutaTur.class);
            startActivity(i);
        }
    });
    Autogara3= (Button) findViewById(R.id.autogara3Tur);
    Autogara3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21Autogara3Tur.class);
            startActivity(i);
        }
    });
    RATBrasov= (Button) findViewById(R.id.ratbrasovTur);
    RATBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21RATBrasovTur.class);
            startActivity(i);
        }
    });
    Triaj= (Button) findViewById(R.id.triajTur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia21Tur.this, Linia21TriajTur.class);
            startActivity(i);
        }
    });
    }
}