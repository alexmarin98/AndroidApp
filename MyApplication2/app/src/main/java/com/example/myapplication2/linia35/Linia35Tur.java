package com.example.myapplication2.linia35;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia35Tur extends AppCompatActivity {
   Button GaraBrasov;
   Button Dacia;
   Button Infostar;
   Button LiceulMesota;
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
        setContentView(R.layout.activity_linia35_tur);
    GaraBrasov= (Button) findViewById(R.id.garabrasovTur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35GaraBrasovTur.class);
            startActivity(i);
        }
    });
    Dacia= (Button) findViewById(R.id.daciaTur);
    Dacia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35DaciaTur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarTur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35InfostarTur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaTur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35LiceulMesotaTur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaTur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35HidroATur.class);
            startActivity(i);
        }
    });
    HidroB= (Button) findViewById(R.id.hidrobTur);
    HidroB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35HidroBTur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanTur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35SpitalulJudeteanTur.class);
            startActivity(i);
        }
    });
    LiceulInformatica= (Button) findViewById(R.id.liceulinformaticaTur);
    LiceulInformatica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35LiceulInformaticaTur.class);
            startActivity(i);
        }
    });
    Berzei= (Button) findViewById(R.id.berzeiTur);
    Berzei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35BerzeiTur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorTur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35PoienelorTur.class);
            startActivity(i);
        }
    });
    Praktiker= (Button) findViewById(R.id.praktikerTur);
    Praktiker.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35PraktikerTur.class);
            startActivity(i);
        }
    });
    Metro= (Button) findViewById(R.id.metroTur);
    Metro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35MetroTur.class);
            startActivity(i);
        }
    });
    Aurora= (Button) findViewById(R.id.auroraTur);
    Aurora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35AuroraTur.class);
            startActivity(i);
        }
    });
    PoianaDarste= (Button) findViewById(R.id.poianadarsteTur);
    PoianaDarste.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35PoianaDarsteTur.class);
            startActivity(i);
        }
    });
    StrandNoua= (Button) findViewById(R.id.strandnouaTur);
    StrandNoua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35StrandNouaTur.class);
            startActivity(i);
        }
    });
    ScGen9= (Button) findViewById(R.id.scgen9Tur);
    ScGen9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35ScGen9Tur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35FacultativaTur.class);
            startActivity(i);
        }
    });
    Noua= (Button) findViewById(R.id.nouaTur);
    Noua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia35Tur.this, Linia35NouaTur.class);
            startActivity(i);
        }
    });
    }
}