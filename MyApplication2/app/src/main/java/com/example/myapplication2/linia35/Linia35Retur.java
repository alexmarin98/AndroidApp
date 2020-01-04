package com.example.myapplication2.linia35;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia35Retur extends AppCompatActivity {
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
   Button Infostar;
   Button Rapid;
   Button GaraBrasov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia35_retur);
    Noua= (Button) findViewById(R.id.nouaRetur);
    Noua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35NouaRetur.class);
            startActivity(i);
        }
    });
    Rozmarinului= (Button) findViewById(R.id.rozmarinuluiRetur);
    Rozmarinului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35RozmarinuluiRetur.class);
            startActivity(i);
        }
    });
    StrandNoua= (Button) findViewById(R.id.strandnouaRetur);
    StrandNoua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35StrandNouaRetur.class);
            startActivity(i);
        }
    });
    PoianaDarste= (Button) findViewById(R.id.poianadarsteRetur);
    PoianaDarste.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35PoianaDarsteRetur.class);
            startActivity(i);
        }
    });
    Aurora= (Button) findViewById(R.id.auroraRetur);
    Aurora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35AuroraRetur.class);
            startActivity(i);
        }
    });
    Selgros= (Button) findViewById(R.id.selgrosRetur);
    Selgros.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35SelgrosRetur.class);
            startActivity(i);
        }
    });
    Carrefour= (Button) findViewById(R.id.carrefourRetur);
    Carrefour.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35CarrefourRetur.class);
            startActivity(i);
        }
    });
    Soarelui= (Button) findViewById(R.id.soareluiRetur);
    Soarelui.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35SoareluiRetur.class);
            startActivity(i);
        }
    });
    Berzei= (Button) findViewById(R.id.berzeiRetur);
    Berzei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35BerzeiRetur.class);
            startActivity(i);
        }
    });
    LiceulInformatica= (Button) findViewById(R.id.liceulinformaticaRetur);
    LiceulInformatica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35LiceulInformaticaRetur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanRetur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35SpitalulJudeteanRetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35ToamneiRetur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarRetur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35InfostarRetur.class);
            startActivity(i);
        }
    });
    Rapid= (Button) findViewById(R.id.rapidRetur);
    Rapid.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35RapidRetur.class);
            startActivity(i);
        }
    });
    GaraBrasov= (Button) findViewById(R.id.garabrasovRetur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Retur.this, Linia35GaraBrasovRetur.class);
            startActivity(i);
        }
    });
    }
}