package com.example.myapplication2.linia18;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia18Tur extends AppCompatActivity {
   Button BarieraBartolomeu;
   Button GhDoja;
   Button Conforest;
   Button UnitateMilitara;
   Button Oligopol;
   Button Elmas;
   Button PiataAgroalimentara;
   Button TipografiaBrastar;
   Button Mondotrans;
   Button Feldioarei;
   Button Fantanii;
   Button Fagurului;
   Button Facultativa;
   Button StupiniCentru;
   Button Surlasului;
   Button FacultativaII;
   Button Fundaturii;
   Button Case;
   Button IARGhimbav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia18_tur);
    BarieraBartolomeu= (Button) findViewById(R.id.barierabartolomeuTur);
    BarieraBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18BarieraBartolomeuTur.class);
            startActivity(i);
        }
    });
    GhDoja= (Button) findViewById(R.id.ghdojaTur);
    GhDoja.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18GhDojaTur.class);
            startActivity(i);
        }
    });
    Conforest= (Button) findViewById(R.id.conforestTur);
    Conforest.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18ConforestTur.class);
            startActivity(i);
        }
    });
    UnitateMilitara= (Button) findViewById(R.id.unitatemilitaraTur);
    UnitateMilitara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18UnitateMilitaraTur.class);
            startActivity(i);
        }
    });
    Oligopol= (Button) findViewById(R.id.oligopolTur);
    Oligopol.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18OligopolTur.class);
            startActivity(i);
        }
    });
    Elmas= (Button) findViewById(R.id.elmasTur);
    Elmas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18ElmasTur.class);
            startActivity(i);
        }
    });
    PiataAgroalimentara= (Button) findViewById(R.id.piataagroalimentaraTur);
    PiataAgroalimentara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18PiataAgroalimentaraTur.class);
            startActivity(i);
        }
    });
    TipografiaBrastar= (Button) findViewById(R.id.tipografiabrastarTur);
    TipografiaBrastar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18TipografiaBrastarTur.class);
            startActivity(i);
        }
    });
    Mondotrans= (Button) findViewById(R.id.mondotransTur);
    Mondotrans.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18MondotransTur.class);
            startActivity(i);
        }
    });
    Feldioarei= (Button) findViewById(R.id.feldioareiTur);
    Feldioarei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18FeldioareiTur.class);
            startActivity(i);
        }
    });
    Fantanii= (Button) findViewById(R.id.fantaniiTur);
    Fantanii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18FantaniiTur.class);
            startActivity(i);
        }
    });
    Fagurului= (Button) findViewById(R.id.faguruluiTur);
    Fagurului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18FaguruluiTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18FacultativaTur.class);
            startActivity(i);
        }
    });
    StupiniCentru= (Button) findViewById(R.id.stupinicentruTur);
    StupiniCentru.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18StupiniCentruTur.class);
            startActivity(i);
        }
    });
    Surlasului= (Button) findViewById(R.id.surlasuluiTur);
    Surlasului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18SurlasuluiTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18FacultativaTur.class);
            startActivity(i);
        }
    });
    FacultativaII= (Button) findViewById(R.id.facultativaiiTur);
    FacultativaII.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18FacultativaIITur.class);
            startActivity(i);
        }
    });
    Fundaturii= (Button) findViewById(R.id.fundaturiiTur);
    Fundaturii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18FundaturiiTur.class);
            startActivity(i);
        }
    });
    Case= (Button) findViewById(R.id.caseTur);
    Case.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18CaseTur.class);
            startActivity(i);
        }
    });
    IARGhimbav= (Button) findViewById(R.id.iarghimbavTur);
    IARGhimbav.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Tur.this, Linia18IARGhimbavTur.class);
            startActivity(i);
        }
    });
    }
}