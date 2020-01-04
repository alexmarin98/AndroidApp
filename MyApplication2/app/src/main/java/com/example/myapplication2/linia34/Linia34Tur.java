package com.example.myapplication2.linia34;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia34Tur extends AppCompatActivity {
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
   Button Scriitorilor;
   Button Toamnei;
   Button LiceulMesota;
   Button CameraDeComert;
   Button Sanitas;
   Button Primarie;
   Button LivadaPostei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia34_tur);
    TimisTriaj= (Button) findViewById(R.id.timistriajTur);
    TimisTriaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34TimisTriajTur.class);
            startActivity(i);
        }
    });
    PapaReale= (Button) findViewById(R.id.paparealeTur);
    PapaReale.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34PapaRealeTur.class);
            startActivity(i);
        }
    });
    CET= (Button) findViewById(R.id.cetTur);
    CET.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34CETTur.class);
            startActivity(i);
        }
    });
    Diversitas= (Button) findViewById(R.id.diversitasTur);
    Diversitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34DiversitasTur.class);
            startActivity(i);
        }
    });
    Silnef= (Button) findViewById(R.id.silnefTur);
    Silnef.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34SilnefTur.class);
            startActivity(i);
        }
    });
    Energo= (Button) findViewById(R.id.energoTur);
    Energo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34EnergoTur.class);
            startActivity(i);
        }
    });
    Cernatului= (Button) findViewById(R.id.cernatuluiTur);
    Cernatului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34CernatuluiTur.class);
            startActivity(i);
        }
    });
    Carfil= (Button) findViewById(R.id.carfilTur);
    Carfil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34CarfilTur.class);
            startActivity(i);
        }
    });
    Romradiatoare= (Button) findViewById(R.id.romradiatoareTur);
    Romradiatoare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34RomradiatoareTur.class);
            startActivity(i);
        }
    });
    Poligrafie= (Button) findViewById(R.id.poligrafieTur);
    Poligrafie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34PoligrafieTur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiTur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34GemeniiTur.class);
            startActivity(i);
        }
    });
    Scriitorilor= (Button) findViewById(R.id.scriitorilorTur);
    Scriitorilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34ScriitorilorTur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiTur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34ToamneiTur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaTur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34LiceulMesotaTur.class);
            startActivity(i);
        }
    });
    CameraDeComert= (Button) findViewById(R.id.cameradecomertTur);
    CameraDeComert.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34CameraDeComertTur.class);
            startActivity(i);
        }
    });
    Sanitas= (Button) findViewById(R.id.sanitasTur);
    Sanitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34SanitasTur.class);
            startActivity(i);
        }
    });
    Primarie= (Button) findViewById(R.id.primarieTur);
    Primarie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34PrimarieTur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Tur.this, Linia34LivadaPosteiTur.class);
            startActivity(i);
        }
    });
    }
}