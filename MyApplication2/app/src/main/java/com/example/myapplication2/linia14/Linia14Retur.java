package com.example.myapplication2.linia14;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia14Retur extends AppCompatActivity {
   Button LivadaPostei;
   Button Astra;
   Button BisericiiRomane;
   Button Memorandului;
   Button Carierei;
   Button BisericaBartolomeu;
   Button Facultativa;
   Button Marasesti;
   Button Rasaritul;
   Button Ignis;
   Button Atelier;
   Button FabricaDeVar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia14_retur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    Astra= (Button) findViewById(R.id.astraRetur);
    Astra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14AstraRetur.class);
            startActivity(i);
        }
    });
    BisericiiRomane= (Button) findViewById(R.id.bisericiiromaneRetur);
    BisericiiRomane.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14BisericiiRomaneRetur.class);
            startActivity(i);
        }
    });
    Memorandului= (Button) findViewById(R.id.memoranduluiRetur);
    Memorandului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14MemoranduluiRetur.class);
            startActivity(i);
        }
    });
    Carierei= (Button) findViewById(R.id.cariereiRetur);
    Carierei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14CariereiRetur.class);
            startActivity(i);
        }
    });
    BisericaBartolomeu= (Button) findViewById(R.id.bisericabartolomeuRetur);
    BisericaBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14BisericaBartolomeuRetur.class);
            startActivity(i);
        }
    });
    Carierei= (Button) findViewById(R.id.cariereiRetur);
    Carierei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14CariereiRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14FacultativaRetur.class);
            startActivity(i);
        }
    });
    Marasesti= (Button) findViewById(R.id.marasestiRetur);
    Marasesti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14MarasestiRetur.class);
            startActivity(i);
        }
    });
    Rasaritul= (Button) findViewById(R.id.rasaritulRetur);
    Rasaritul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14RasaritulRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14FacultativaRetur.class);
            startActivity(i);
        }
    });
    Ignis= (Button) findViewById(R.id.ignisRetur);
    Ignis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14IgnisRetur.class);
            startActivity(i);
        }
    });
    Atelier= (Button) findViewById(R.id.atelierRetur);
    Atelier.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14AtelierRetur.class);
            startActivity(i);
        }
    });
    FabricaDeVar= (Button) findViewById(R.id.fabricadevarRetur);
    FabricaDeVar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Retur.this, Linia14FabricaDeVarRetur.class);
            startActivity(i);
        }
    });
    }
}