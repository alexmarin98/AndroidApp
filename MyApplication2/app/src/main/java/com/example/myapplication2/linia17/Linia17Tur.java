package com.example.myapplication2.linia17;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia17Tur extends AppCompatActivity {
   Button LivadaPostei;
   Button Dramatic;
   Button Patria;
   Button HidroA;
   Button HidroB;
   Button SpitalulJudetean;
   Button LiceulInformatica;
   Button Berzei;
   Button Poienelor;
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
        setContentView(R.layout.activity_linia17_tur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17LivadaPosteiTur.class);
            startActivity(i);
        }
    });
    Dramatic= (Button) findViewById(R.id.dramaticTur);
    Dramatic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17DramaticTur.class);
            startActivity(i);
        }
    });
    Patria= (Button) findViewById(R.id.patriaTur);
    Patria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17PatriaTur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaTur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17HidroATur.class);
            startActivity(i);
        }
    });
    HidroB= (Button) findViewById(R.id.hidrobTur);
    HidroB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17HidroBTur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanTur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17SpitalulJudeteanTur.class);
            startActivity(i);
        }
    });
    LiceulInformatica= (Button) findViewById(R.id.liceulinformaticaTur);
    LiceulInformatica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17LiceulInformaticaTur.class);
            startActivity(i);
        }
    });
    Berzei= (Button) findViewById(R.id.berzeiTur);
    Berzei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17BerzeiTur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorTur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17PoienelorTur.class);
            startActivity(i);
        }
    });
    Praktiker= (Button) findViewById(R.id.praktikerTur);
    Praktiker.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17PraktikerTur.class);
            startActivity(i);
        }
    });
    Metro= (Button) findViewById(R.id.metroTur);
    Metro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17MetroTur.class);
            startActivity(i);
        }
    });
    Aurora= (Button) findViewById(R.id.auroraTur);
    Aurora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17AuroraTur.class);
            startActivity(i);
        }
    });
    PoianaDarste= (Button) findViewById(R.id.poianadarsteTur);
    PoianaDarste.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17PoianaDarsteTur.class);
            startActivity(i);
        }
    });
    StrandNoua= (Button) findViewById(R.id.strandnouaTur);
    StrandNoua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17StrandNouaTur.class);
            startActivity(i);
        }
    });
    ScGen9= (Button) findViewById(R.id.scgen9Tur);
    ScGen9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17ScGen9Tur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17FacultativaTur.class);
            startActivity(i);
        }
    });
    Noua= (Button) findViewById(R.id.nouaTur);
    Noua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17Tur.this, Linia17NouaTur.class);
            startActivity(i);
        }
    });
    }
}