package com.example.myapplication2.linia34;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia34Retur extends AppCompatActivity {
   Button LivadaPostei;
   Button Dramatic;
   Button Patria;
   Button HidroA;
   Button Toamnei;
   Button Traian;
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
   Button TimisTriaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia34_retur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    Dramatic= (Button) findViewById(R.id.dramaticRetur);
    Dramatic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34DramaticRetur.class);
            startActivity(i);
        }
    });
    Patria= (Button) findViewById(R.id.patriaRetur);
    Patria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34PatriaRetur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaRetur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34HidroARetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34ToamneiRetur.class);
            startActivity(i);
        }
    });
    Traian= (Button) findViewById(R.id.traianRetur);
    Traian.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34TraianRetur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiRetur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34GemeniiRetur.class);
            startActivity(i);
        }
    });
    Poligrafie= (Button) findViewById(R.id.poligrafieRetur);
    Poligrafie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34PoligrafieRetur.class);
            startActivity(i);
        }
    });
    Romradiatoare= (Button) findViewById(R.id.romradiatoareRetur);
    Romradiatoare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34RomradiatoareRetur.class);
            startActivity(i);
        }
    });
    Carfil= (Button) findViewById(R.id.carfilRetur);
    Carfil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34CarfilRetur.class);
            startActivity(i);
        }
    });
    Cernatului= (Button) findViewById(R.id.cernatuluiRetur);
    Cernatului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34CernatuluiRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34FacultativaRetur.class);
            startActivity(i);
        }
    });
    Energo= (Button) findViewById(R.id.energoRetur);
    Energo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34EnergoRetur.class);
            startActivity(i);
        }
    });
    Silnef= (Button) findViewById(R.id.silnefRetur);
    Silnef.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34SilnefRetur.class);
            startActivity(i);
        }
    });
    Diversitas= (Button) findViewById(R.id.diversitasRetur);
    Diversitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34DiversitasRetur.class);
            startActivity(i);
        }
    });
    CET= (Button) findViewById(R.id.cetRetur);
    CET.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34CETRetur.class);
            startActivity(i);
        }
    });
    PapaReale= (Button) findViewById(R.id.paparealeRetur);
    PapaReale.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34PapaRealeRetur.class);
            startActivity(i);
        }
    });
    TimisTriaj= (Button) findViewById(R.id.timistriajRetur);
    TimisTriaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia34Retur.this, Linia34TimisTriajRetur.class);
            startActivity(i);
        }
    });
    }
}