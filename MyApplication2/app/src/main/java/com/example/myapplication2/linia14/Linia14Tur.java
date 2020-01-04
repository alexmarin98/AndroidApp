package com.example.myapplication2.linia14;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia14Tur extends AppCompatActivity {
   Button FabricaDeVar;
   Button Atelier;
   Button Ignis;
   Button Facultativa;
   Button Rasaritul;
   Button Marasesti;
   Button Carierei;
   Button Memorandului;
   Button BisericiiRomane;
   Button Astra;
   Button LivadaPostei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia14_tur);
    FabricaDeVar= (Button) findViewById(R.id.fabricadevarTur);
    FabricaDeVar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14FabricaDeVarTur.class);
            startActivity(i);
        }
    });
    Atelier= (Button) findViewById(R.id.atelierTur);
    Atelier.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14AtelierTur.class);
            startActivity(i);
        }
    });
    Ignis= (Button) findViewById(R.id.ignisTur);
    Ignis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14IgnisTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14FacultativaTur.class);
            startActivity(i);
        }
    });
    Rasaritul= (Button) findViewById(R.id.rasaritulTur);
    Rasaritul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14RasaritulTur.class);
            startActivity(i);
        }
    });
    Marasesti= (Button) findViewById(R.id.marasestiTur);
    Marasesti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14MarasestiTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14FacultativaTur.class);
            startActivity(i);
        }
    });
    Carierei= (Button) findViewById(R.id.cariereiTur);
    Carierei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14CariereiTur.class);
            startActivity(i);
        }
    });
    Memorandului= (Button) findViewById(R.id.memoranduluiTur);
    Memorandului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14MemoranduluiTur.class);
            startActivity(i);
        }
    });
    BisericiiRomane= (Button) findViewById(R.id.bisericiiromaneTur);
    BisericiiRomane.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14BisericiiRomaneTur.class);
            startActivity(i);
        }
    });
    Astra= (Button) findViewById(R.id.astraTur);
    Astra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14AstraTur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia14Tur.this, Linia14LivadaPosteiTur.class);
            startActivity(i);
        }
    });
    }
}