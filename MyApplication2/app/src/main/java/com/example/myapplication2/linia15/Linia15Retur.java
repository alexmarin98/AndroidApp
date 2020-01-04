package com.example.myapplication2.linia15;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia15Retur extends AppCompatActivity {
   Button Triaj;
   Button RATBrasov;
   Button Coresi1;
   Button Coresi2;
   Button Decembrie13;
   Button LiceulTractorul;
   Button SpitalTractorul;
   Button PiataTractorul;
   Button Decembrie1918;
   Button Huniade;
   Button EcTeodoroiu;
   Button Cosmesti;
   Button Zlatna;
   Button MolnarJanos;
   Button Facultativa;
   Button Avantgarden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia15_retur);
    Triaj= (Button) findViewById(R.id.triajRetur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15TriajRetur.class);
            startActivity(i);
        }
    });
    RATBrasov= (Button) findViewById(R.id.ratbrasovRetur);
    RATBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15RATBrasovRetur.class);
            startActivity(i);
        }
    });
    Coresi1= (Button) findViewById(R.id.coresi1Retur);
    Coresi1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15Coresi1Retur.class);
            startActivity(i);
        }
    });
    Coresi2= (Button) findViewById(R.id.coresi2Retur);
    Coresi2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15Coresi2Retur.class);
            startActivity(i);
        }
    });
    Decembrie13= (Button) findViewById(R.id.decembrie13Retur);
    Decembrie13.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15Decembrie13Retur.class);
            startActivity(i);
        }
    });
    LiceulTractorul= (Button) findViewById(R.id.liceultractorulRetur);
    LiceulTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15LiceulTractorulRetur.class);
            startActivity(i);
        }
    });
    SpitalTractorul= (Button) findViewById(R.id.spitaltractorulRetur);
    SpitalTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15SpitalTractorulRetur.class);
            startActivity(i);
        }
    });
    PiataTractorul= (Button) findViewById(R.id.piatatractorulRetur);
    PiataTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15PiataTractorulRetur.class);
            startActivity(i);
        }
    });
    Decembrie1918= (Button) findViewById(R.id.decembrie1918Retur);
    Decembrie1918.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15Decembrie1918Retur.class);
            startActivity(i);
        }
    });
    Huniade= (Button) findViewById(R.id.huniadeRetur);
    Huniade.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15HuniadeRetur.class);
            startActivity(i);
        }
    });
    EcTeodoroiu= (Button) findViewById(R.id.ecteodoroiuRetur);
    EcTeodoroiu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15EcTeodoroiuRetur.class);
            startActivity(i);
        }
    });
    Cosmesti= (Button) findViewById(R.id.cosmestiRetur);
    Cosmesti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15CosmestiRetur.class);
            startActivity(i);
        }
    });
    Zlatna= (Button) findViewById(R.id.zlatnaRetur);
    Zlatna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15ZlatnaRetur.class);
            startActivity(i);
        }
    });
    MolnarJanos= (Button) findViewById(R.id.molnarjanosRetur);
    MolnarJanos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15MolnarJanosRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15FacultativaRetur.class);
            startActivity(i);
        }
    });
    Avantgarden= (Button) findViewById(R.id.avantgardenRetur);
    Avantgarden.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia15Retur.this, Linia15AvantgardenRetur.class);
            startActivity(i);
        }
    });
    }
}