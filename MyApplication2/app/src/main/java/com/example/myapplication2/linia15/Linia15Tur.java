package com.example.myapplication2.linia15;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia15Tur extends AppCompatActivity {
   Button Avantgarden;
   Button Egretei;
   Button Lanurilor;
   Button Vectra;
   Button Agricultorilor;
   Button Zlatna;
   Button Cosmesti;
   Button EcTeodoroiu;
   Button Huniade;
   Button Decembrie1918;
   Button PiataTractorul;
   Button Tractorul;
   Button LiceulTractorul;
   Button Decembrie13;
   Button Coresi2;
   Button Coresi1;
   Button RATBrasov;
   Button Triaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia15_tur);
    Avantgarden= (Button) findViewById(R.id.avantgardenTur);
    Avantgarden.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15AvantgardenTur.class);
            startActivity(i);
        }
    });
    Egretei= (Button) findViewById(R.id.egreteiTur);
    Egretei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15EgreteiTur.class);
            startActivity(i);
        }
    });
    Lanurilor= (Button) findViewById(R.id.lanurilorTur);
    Lanurilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15LanurilorTur.class);
            startActivity(i);
        }
    });
    Vectra= (Button) findViewById(R.id.vectraTur);
    Vectra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15VectraTur.class);
            startActivity(i);
        }
    });
    Agricultorilor= (Button) findViewById(R.id.agricultorilorTur);
    Agricultorilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15AgricultorilorTur.class);
            startActivity(i);
        }
    });
    Zlatna= (Button) findViewById(R.id.zlatnaTur);
    Zlatna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15ZlatnaTur.class);
            startActivity(i);
        }
    });
    Cosmesti= (Button) findViewById(R.id.cosmestiTur);
    Cosmesti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15CosmestiTur.class);
            startActivity(i);
        }
    });
    EcTeodoroiu= (Button) findViewById(R.id.ecteodoroiuTur);
    EcTeodoroiu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15EcTeodoroiuTur.class);
            startActivity(i);
        }
    });
    Huniade= (Button) findViewById(R.id.huniadeTur);
    Huniade.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15HuniadeTur.class);
            startActivity(i);
        }
    });
    Decembrie1918= (Button) findViewById(R.id.decembrie1918Tur);
    Decembrie1918.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15Decembrie1918Tur.class);
            startActivity(i);
        }
    });
    PiataTractorul= (Button) findViewById(R.id.piatatractorulTur);
    PiataTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15PiataTractorulTur.class);
            startActivity(i);
        }
    });
    Tractorul= (Button) findViewById(R.id.tractorulTur);
    Tractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15TractorulTur.class);
            startActivity(i);
        }
    });
    LiceulTractorul= (Button) findViewById(R.id.liceultractorulTur);
    LiceulTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15LiceulTractorulTur.class);
            startActivity(i);
        }
    });
    Decembrie13= (Button) findViewById(R.id.decembrie13Tur);
    Decembrie13.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15Decembrie13Tur.class);
            startActivity(i);
        }
    });
    Coresi2= (Button) findViewById(R.id.coresi2Tur);
    Coresi2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15Coresi2Tur.class);
            startActivity(i);
        }
    });
    Coresi1= (Button) findViewById(R.id.coresi1Tur);
    Coresi1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15Coresi1Tur.class);
            startActivity(i);
        }
    });
    RATBrasov= (Button) findViewById(R.id.ratbrasovTur);
    RATBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15RATBrasovTur.class);
            startActivity(i);
        }
    });
    Triaj= (Button) findViewById(R.id.triajTur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Tur.this, Linia15TriajTur.class);
            startActivity(i);
        }
    });
    }
}