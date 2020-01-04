package com.example.myapplication2.linia19;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia19Retur extends AppCompatActivity {
   Button Triaj;
   Button LiceulCFR;
   Button Metabras;
   Button FundaturaHarmanului;
   Button FacultativaTimisTriaj;
   Button CET;
   Button Diversitas;
   Button Silnef;
   Button Energo;
   Button ArteraSudEst;
   Button Poienelor;
   Button Prunului;
   Button Noua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia19_retur);
    Triaj= (Button) findViewById(R.id.triajRetur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19TriajRetur.class);
            startActivity(i);
        }
    });
    LiceulCFR= (Button) findViewById(R.id.liceulcfrRetur);
    LiceulCFR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19LiceulCFRRetur.class);
            startActivity(i);
        }
    });
    Metabras= (Button) findViewById(R.id.metabrasRetur);
    Metabras.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19MetabrasRetur.class);
            startActivity(i);
        }
    });
    FundaturaHarmanului= (Button) findViewById(R.id.fundaturaharmanuluiRetur);
    FundaturaHarmanului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19FundaturaHarmanuluiRetur.class);
            startActivity(i);
        }
    });
    FacultativaTimisTriaj= (Button) findViewById(R.id.facultativatimistriajRetur);
    FacultativaTimisTriaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19FacultativaTimisTriajRetur.class);
            startActivity(i);
        }
    });
    CET= (Button) findViewById(R.id.cetRetur);
    CET.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19CETRetur.class);
            startActivity(i);
        }
    });
    Diversitas= (Button) findViewById(R.id.diversitasRetur);
    Diversitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19DiversitasRetur.class);
            startActivity(i);
        }
    });
    Silnef= (Button) findViewById(R.id.silnefRetur);
    Silnef.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19SilnefRetur.class);
            startActivity(i);
        }
    });
    Energo= (Button) findViewById(R.id.energoRetur);
    Energo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19EnergoRetur.class);
            startActivity(i);
        }
    });
    ArteraSudEst= (Button) findViewById(R.id.arterasudestRetur);
    ArteraSudEst.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19ArteraSudEstRetur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorRetur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19PoienelorRetur.class);
            startActivity(i);
        }
    });
    Prunului= (Button) findViewById(R.id.prunuluiRetur);
    Prunului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19PrunuluiRetur.class);
            startActivity(i);
        }
    });
    Noua= (Button) findViewById(R.id.nouaRetur);
    Noua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia19Retur.this, Linia19NouaRetur.class);
            startActivity(i);
        }
    });
    }
}