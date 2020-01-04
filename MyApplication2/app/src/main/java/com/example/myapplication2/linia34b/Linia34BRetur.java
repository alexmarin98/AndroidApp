package com.example.myapplication2.linia34b;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia34BRetur extends AppCompatActivity {
   Button Triaj;
   Button LiceulCFR;
   Button Metabras;
   Button FundaturaHarmanului;
   Button Facultativa;
   Button TimisTriaj;
   Button PapaReale;
   Button CET;
   Button Diversitas;
   Button Silnef;
   Button Energo;
   Button Cernatului;
   Button Carfil;
   Button Romradiatoare;
   Button Poligrafie;
   Button Gemenii;
   Button PanaitCerna;
   Button Branduselor;
   Button SalaSporturilor;
   Button GaraBrasov;
   Button Dacia;
   Button Infostar;
   Button LiceulMesota;
   Button HidroA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia34b_retur);
    Triaj= (Button) findViewById(R.id.triajRetur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BTriajRetur.class);
            startActivity(i);
        }
    });
    LiceulCFR= (Button) findViewById(R.id.liceulcfrRetur);
    LiceulCFR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BLiceulCFRRetur.class);
            startActivity(i);
        }
    });
    Metabras= (Button) findViewById(R.id.metabrasRetur);
    Metabras.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BMetabrasRetur.class);
            startActivity(i);
        }
    });
    FundaturaHarmanului= (Button) findViewById(R.id.fundaturaharmanuluiRetur);
    FundaturaHarmanului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BFundaturaHarmanuluiRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BFacultativaRetur.class);
            startActivity(i);
        }
    });
    TimisTriaj= (Button) findViewById(R.id.timistriajRetur);
    TimisTriaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BTimisTriajRetur.class);
            startActivity(i);
        }
    });
    PapaReale= (Button) findViewById(R.id.paparealeRetur);
    PapaReale.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BPapaRealeRetur.class);
            startActivity(i);
        }
    });
    CET= (Button) findViewById(R.id.cetRetur);
    CET.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BCETRetur.class);
            startActivity(i);
        }
    });
    Diversitas= (Button) findViewById(R.id.diversitasRetur);
    Diversitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BDiversitasRetur.class);
            startActivity(i);
        }
    });
    Silnef= (Button) findViewById(R.id.silnefRetur);
    Silnef.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BSilnefRetur.class);
            startActivity(i);
        }
    });
    Energo= (Button) findViewById(R.id.energoRetur);
    Energo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BEnergoRetur.class);
            startActivity(i);
        }
    });
    Cernatului= (Button) findViewById(R.id.cernatuluiRetur);
    Cernatului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BCernatuluiRetur.class);
            startActivity(i);
        }
    });
    Carfil= (Button) findViewById(R.id.carfilRetur);
    Carfil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BCarfilRetur.class);
            startActivity(i);
        }
    });
    Romradiatoare= (Button) findViewById(R.id.romradiatoareRetur);
    Romradiatoare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BRomradiatoareRetur.class);
            startActivity(i);
        }
    });
    Poligrafie= (Button) findViewById(R.id.poligrafieRetur);
    Poligrafie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BPoligrafieRetur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiRetur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BGemeniiRetur.class);
            startActivity(i);
        }
    });
    PanaitCerna= (Button) findViewById(R.id.panaitcernaRetur);
    PanaitCerna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BPanaitCernaRetur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorRetur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BBranduselorRetur.class);
            startActivity(i);
        }
    });
    SalaSporturilor= (Button) findViewById(R.id.salasporturilorRetur);
    SalaSporturilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BSalaSporturilorRetur.class);
            startActivity(i);
        }
    });
    GaraBrasov= (Button) findViewById(R.id.garabrasovRetur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BGaraBrasovRetur.class);
            startActivity(i);
        }
    });
    Dacia= (Button) findViewById(R.id.daciaRetur);
    Dacia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BDaciaRetur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarRetur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BInfostarRetur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaRetur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BLiceulMesotaRetur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaRetur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BRetur.this, Linia34BHidroARetur.class);
            startActivity(i);
        }
    });
    }
}