package com.example.myapplication2.linia53;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia53Retur extends AppCompatActivity {
   Button Panselelor;
   Button ParcIndMetrom;
   Button Poienelor;
   Button Roman;
   Button Soarelui;
   Button Berzei;
   Button LiceulInformatica;
   Button SpitalulJudetean;
   Button Toamnei;
   Button Infostar;
   Button Rapid;
   Button BdGarii;
   Button Faget;
   Button Turnului;
   Button PatinoarulOlimpic;
   Button FacultateConstructii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia53_retur);
    Panselelor= (Button) findViewById(R.id.panselelorRetur);
    Panselelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53PanselelorRetur.class);
            startActivity(i);
        }
    });
    ParcIndMetrom= (Button) findViewById(R.id.parcindmetromRetur);
    ParcIndMetrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53ParcIndMetromRetur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorRetur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53PoienelorRetur.class);
            startActivity(i);
        }
    });
    Roman= (Button) findViewById(R.id.romanRetur);
    Roman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53RomanRetur.class);
            startActivity(i);
        }
    });
    Soarelui= (Button) findViewById(R.id.soareluiRetur);
    Soarelui.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53SoareluiRetur.class);
            startActivity(i);
        }
    });
    Berzei= (Button) findViewById(R.id.berzeiRetur);
    Berzei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53BerzeiRetur.class);
            startActivity(i);
        }
    });
    LiceulInformatica= (Button) findViewById(R.id.liceulinformaticaRetur);
    LiceulInformatica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53LiceulInformaticaRetur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanRetur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53SpitalulJudeteanRetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53ToamneiRetur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarRetur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53InfostarRetur.class);
            startActivity(i);
        }
    });
    Rapid= (Button) findViewById(R.id.rapidRetur);
    Rapid.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53RapidRetur.class);
            startActivity(i);
        }
    });
    BdGarii= (Button) findViewById(R.id.bdgariiRetur);
    BdGarii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53BdGariiRetur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetRetur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53FagetRetur.class);
            startActivity(i);
        }
    });
    Turnului= (Button) findViewById(R.id.turnuluiRetur);
    Turnului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53TurnuluiRetur.class);
            startActivity(i);
        }
    });
    PatinoarulOlimpic= (Button) findViewById(R.id.patinoarulolimpicRetur);
    PatinoarulOlimpic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53PatinoarulOlimpicRetur.class);
            startActivity(i);
        }
    });
    FacultateConstructii= (Button) findViewById(R.id.facultateconstructiiRetur);
    FacultateConstructii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Retur.this, Linia53FacultateConstructiiRetur.class);
            startActivity(i);
        }
    });
    }
}