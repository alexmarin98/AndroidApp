package com.example.myapplication2.linia53;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia53Tur extends AppCompatActivity {
   Button FacultateConstructii;
   Button UnivSpiruHaret;
   Button BisericaTractorul;
   Button Faget;
   Button Dacia;
   Button Infostar;
   Button LiceulMesota;
   Button HidroA;
   Button HidroB;
   Button SpitalulJudetean;
   Button LiceulInformatica;
   Button Berzei;
   Button Pompieri;
   Button Metrom;
   Button ParcIndMetrom;
   Button Panselelor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia53_tur);
    FacultateConstructii= (Button) findViewById(R.id.facultateconstructiiTur);
    FacultateConstructii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53FacultateConstructiiTur.class);
            startActivity(i);
        }
    });
    UnivSpiruHaret= (Button) findViewById(R.id.univspiruharetTur);
    UnivSpiruHaret.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53UnivSpiruHaretTur.class);
            startActivity(i);
        }
    });
    BisericaTractorul= (Button) findViewById(R.id.bisericatractorulTur);
    BisericaTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53BisericaTractorulTur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetTur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53FagetTur.class);
            startActivity(i);
        }
    });
    Dacia= (Button) findViewById(R.id.daciaTur);
    Dacia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53DaciaTur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarTur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53InfostarTur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaTur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53LiceulMesotaTur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaTur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53HidroATur.class);
            startActivity(i);
        }
    });
    HidroB= (Button) findViewById(R.id.hidrobTur);
    HidroB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53HidroBTur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanTur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53SpitalulJudeteanTur.class);
            startActivity(i);
        }
    });
    LiceulInformatica= (Button) findViewById(R.id.liceulinformaticaTur);
    LiceulInformatica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53LiceulInformaticaTur.class);
            startActivity(i);
        }
    });
    Berzei= (Button) findViewById(R.id.berzeiTur);
    Berzei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53BerzeiTur.class);
            startActivity(i);
        }
    });
    Pompieri= (Button) findViewById(R.id.pompieriTur);
    Pompieri.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53PompieriTur.class);
            startActivity(i);
        }
    });
    Metrom= (Button) findViewById(R.id.metromTur);
    Metrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53MetromTur.class);
            startActivity(i);
        }
    });
    ParcIndMetrom= (Button) findViewById(R.id.parcindmetromTur);
    ParcIndMetrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53ParcIndMetromTur.class);
            startActivity(i);
        }
    });
    Panselelor= (Button) findViewById(R.id.panselelorTur);
    Panselelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia53Tur.this, Linia53PanselelorTur.class);
            startActivity(i);
        }
    });
    }
}