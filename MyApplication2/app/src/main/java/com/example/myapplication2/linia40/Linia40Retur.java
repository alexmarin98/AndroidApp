package com.example.myapplication2.linia40;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia40Retur extends AppCompatActivity {
   Button StupiniIzvorului;
   Button StupiniCentru;
   Button Facultativa;
   Button Fagurului;
   Button Fantanii;
   Button Feldioarei;
   Button Mondotrans;
   Button TipografiaBrastar;
   Button Agetaps;
   Button Mol;
   Button Metabras;
   Button HotelTrifan;
   Button Plevnei;
   Button IancuJianu;
   Button Faget;
   Button GaraBrasov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia40_retur);
    StupiniIzvorului= (Button) findViewById(R.id.stupiniizvoruluiRetur);
    StupiniIzvorului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40StupiniIzvoruluiRetur.class);
            startActivity(i);
        }
    });
    StupiniCentru= (Button) findViewById(R.id.stupinicentruRetur);
    StupiniCentru.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40StupiniCentruRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40FacultativaRetur.class);
            startActivity(i);
        }
    });
    Fagurului= (Button) findViewById(R.id.faguruluiRetur);
    Fagurului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40FaguruluiRetur.class);
            startActivity(i);
        }
    });
    Fantanii= (Button) findViewById(R.id.fantaniiRetur);
    Fantanii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40FantaniiRetur.class);
            startActivity(i);
        }
    });
    Feldioarei= (Button) findViewById(R.id.feldioareiRetur);
    Feldioarei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40FeldioareiRetur.class);
            startActivity(i);
        }
    });
    Mondotrans= (Button) findViewById(R.id.mondotransRetur);
    Mondotrans.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40MondotransRetur.class);
            startActivity(i);
        }
    });
    TipografiaBrastar= (Button) findViewById(R.id.tipografiabrastarRetur);
    TipografiaBrastar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40TipografiaBrastarRetur.class);
            startActivity(i);
        }
    });
    Agetaps= (Button) findViewById(R.id.agetapsRetur);
    Agetaps.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40AgetapsRetur.class);
            startActivity(i);
        }
    });
    Mol= (Button) findViewById(R.id.molRetur);
    Mol.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40MolRetur.class);
            startActivity(i);
        }
    });
    Metabras= (Button) findViewById(R.id.metabrasRetur);
    Metabras.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40MetabrasRetur.class);
            startActivity(i);
        }
    });
    HotelTrifan= (Button) findViewById(R.id.hoteltrifanRetur);
    HotelTrifan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40HotelTrifanRetur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiRetur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40PlevneiRetur.class);
            startActivity(i);
        }
    });
    IancuJianu= (Button) findViewById(R.id.iancujianuRetur);
    IancuJianu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40IancuJianuRetur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetRetur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40FagetRetur.class);
            startActivity(i);
        }
    });
    GaraBrasov= (Button) findViewById(R.id.garabrasovRetur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Retur.this, Linia40GaraBrasovRetur.class);
            startActivity(i);
        }
    });
    }
}