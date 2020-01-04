package com.example.myapplication2.linia34b;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia34BTur extends AppCompatActivity {
   Button HidroA;
   Button Infostar;
   Button Rapid;
   Button Caprioara;
   Button Vlahuta;
   Button Branduselor;
   Button Gemenii;
   Button Poligrafie;
   Button Romradiatoare;
   Button Carfil;
   Button Cernatului;
   Button Facultativa;
   Button Energo;
   Button Silnef;
   Button Diversitas;
   Button CET;
   Button PapaReale;
   Button FundaturaHarmanului;
   Button Metabras;
   Button LiceulCFR;
   Button LizieraBrasov;
   Button Triaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia34b_tur);
    HidroA= (Button) findViewById(R.id.hidroaTur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BHidroATur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarTur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BInfostarTur.class);
            startActivity(i);
        }
    });
    Rapid= (Button) findViewById(R.id.rapidTur);
    Rapid.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BRapidTur.class);
            startActivity(i);
        }
    });
    Caprioara= (Button) findViewById(R.id.caprioaraTur);
    Caprioara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BCaprioaraTur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaTur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BVlahutaTur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorTur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BBranduselorTur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiTur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BGemeniiTur.class);
            startActivity(i);
        }
    });
    Poligrafie= (Button) findViewById(R.id.poligrafieTur);
    Poligrafie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BPoligrafieTur.class);
            startActivity(i);
        }
    });
    Romradiatoare= (Button) findViewById(R.id.romradiatoareTur);
    Romradiatoare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BRomradiatoareTur.class);
            startActivity(i);
        }
    });
    Carfil= (Button) findViewById(R.id.carfilTur);
    Carfil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BCarfilTur.class);
            startActivity(i);
        }
    });
    Cernatului= (Button) findViewById(R.id.cernatuluiTur);
    Cernatului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BCernatuluiTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BFacultativaTur.class);
            startActivity(i);
        }
    });
    Energo= (Button) findViewById(R.id.energoTur);
    Energo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BEnergoTur.class);
            startActivity(i);
        }
    });
    Silnef= (Button) findViewById(R.id.silnefTur);
    Silnef.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BSilnefTur.class);
            startActivity(i);
        }
    });
    Diversitas= (Button) findViewById(R.id.diversitasTur);
    Diversitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BDiversitasTur.class);
            startActivity(i);
        }
    });
    CET= (Button) findViewById(R.id.cetTur);
    CET.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BCETTur.class);
            startActivity(i);
        }
    });
    PapaReale= (Button) findViewById(R.id.paparealeTur);
    PapaReale.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BPapaRealeTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BFacultativaTur.class);
            startActivity(i);
        }
    });
    FundaturaHarmanului= (Button) findViewById(R.id.fundaturaharmanuluiTur);
    FundaturaHarmanului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BFundaturaHarmanuluiTur.class);
            startActivity(i);
        }
    });
    Metabras= (Button) findViewById(R.id.metabrasTur);
    Metabras.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BMetabrasTur.class);
            startActivity(i);
        }
    });
    LiceulCFR= (Button) findViewById(R.id.liceulcfrTur);
    LiceulCFR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BLiceulCFRTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BFacultativaTur.class);
            startActivity(i);
        }
    });
    LizieraBrasov= (Button) findViewById(R.id.lizierabrasovTur);
    LizieraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BLizieraBrasovTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BFacultativaTur.class);
            startActivity(i);
        }
    });
    Triaj= (Button) findViewById(R.id.triajTur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34BTur.this, Linia34BTriajTur.class);
            startActivity(i);
        }
    });
    }
}