package com.example.myapplication2.linia19;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia19Tur extends AppCompatActivity {
   Button Noua;
   Button Prunului;
   Button Poienelor;
   Button ArteraSudEst;
   Button Facultativa;
   Button Energo;
   Button Silnef;
   Button Diversitas;
   Button CET;
   Button FacultativaTimisTriaj;
   Button FundaturaHarmanului;
   Button Metabras;
   Button LiceulCFR;
   Button Triaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia19_tur);
    Noua= (Button) findViewById(R.id.nouaTur);
    Noua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19NouaTur.class);
            startActivity(i);
        }
    });
    Prunului= (Button) findViewById(R.id.prunuluiTur);
    Prunului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19PrunuluiTur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorTur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19PoienelorTur.class);
            startActivity(i);
        }
    });
    ArteraSudEst= (Button) findViewById(R.id.arterasudestTur);
    ArteraSudEst.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19ArteraSudEstTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19FacultativaTur.class);
            startActivity(i);
        }
    });
    Energo= (Button) findViewById(R.id.energoTur);
    Energo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19EnergoTur.class);
            startActivity(i);
        }
    });
    Silnef= (Button) findViewById(R.id.silnefTur);
    Silnef.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19SilnefTur.class);
            startActivity(i);
        }
    });
    Diversitas= (Button) findViewById(R.id.diversitasTur);
    Diversitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19DiversitasTur.class);
            startActivity(i);
        }
    });
    CET= (Button) findViewById(R.id.cetTur);
    CET.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19CETTur.class);
            startActivity(i);
        }
    });
    FacultativaTimisTriaj= (Button) findViewById(R.id.facultativatimistriajTur);
    FacultativaTimisTriaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19FacultativaTimisTriajTur.class);
            startActivity(i);
        }
    });
    FundaturaHarmanului= (Button) findViewById(R.id.fundaturaharmanuluiTur);
    FundaturaHarmanului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19FundaturaHarmanuluiTur.class);
            startActivity(i);
        }
    });
    Metabras= (Button) findViewById(R.id.metabrasTur);
    Metabras.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19MetabrasTur.class);
            startActivity(i);
        }
    });
    LiceulCFR= (Button) findViewById(R.id.liceulcfrTur);
    LiceulCFR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19LiceulCFRTur.class);
            startActivity(i);
        }
    });
    Triaj= (Button) findViewById(R.id.triajTur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Tur.this, Linia19TriajTur.class);
            startActivity(i);
        }
    });
    }
}