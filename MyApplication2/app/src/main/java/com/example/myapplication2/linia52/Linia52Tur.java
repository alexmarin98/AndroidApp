package com.example.myapplication2.linia52;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia52Tur extends AppCompatActivity {
   Button Panselelor;
   Button ParcIndMetrom;
   Button Poienelor;
   Button Roman;
   Button Carrefour;
   Button Cometei;
   Button Neptun;
   Button ComplexulMare;
   Button Gemenii;
   Button Scriitorilor;
   Button LiceulMesota;
   Button Onix;
   Button Sanitas;
   Button Primarie;
   Button BisericaNeagra;
   Button Brancoveanu;
   Button PiataUnirii;
   Button Tocile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia52_tur);
    Panselelor= (Button) findViewById(R.id.panselelorTur);
    Panselelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52PanselelorTur.class);
            startActivity(i);
        }
    });
    ParcIndMetrom= (Button) findViewById(R.id.parcindmetromTur);
    ParcIndMetrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52ParcIndMetromTur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorTur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52PoienelorTur.class);
            startActivity(i);
        }
    });
    Roman= (Button) findViewById(R.id.romanTur);
    Roman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52RomanTur.class);
            startActivity(i);
        }
    });
    Carrefour= (Button) findViewById(R.id.carrefourTur);
    Carrefour.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52CarrefourTur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiTur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52CometeiTur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunTur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52NeptunTur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareTur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52ComplexulMareTur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiTur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52GemeniiTur.class);
            startActivity(i);
        }
    });
    Scriitorilor= (Button) findViewById(R.id.scriitorilorTur);
    Scriitorilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52ScriitorilorTur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaTur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52LiceulMesotaTur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixTur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52OnixTur.class);
            startActivity(i);
        }
    });
    Sanitas= (Button) findViewById(R.id.sanitasTur);
    Sanitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52SanitasTur.class);
            startActivity(i);
        }
    });
    Primarie= (Button) findViewById(R.id.primarieTur);
    Primarie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52PrimarieTur.class);
            startActivity(i);
        }
    });
    BisericaNeagra= (Button) findViewById(R.id.bisericaneagraTur);
    BisericaNeagra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52BisericaNeagraTur.class);
            startActivity(i);
        }
    });
    Brancoveanu= (Button) findViewById(R.id.brancoveanuTur);
    Brancoveanu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52BrancoveanuTur.class);
            startActivity(i);
        }
    });
    PiataUnirii= (Button) findViewById(R.id.piatauniriiTur);
    PiataUnirii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52PiataUniriiTur.class);
            startActivity(i);
        }
    });
    Tocile= (Button) findViewById(R.id.tocileTur);
    Tocile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Tur.this, Linia52TocileTur.class);
            startActivity(i);
        }
    });
    }
}