package com.example.myapplication2.linia18;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia18Retur extends AppCompatActivity {
   Button IARGhimbav;
   Button Case;
   Button Fundaturiicl;
   Button Fundaturii;
   Button FacultativaII;
   Button Facultativa;
   Button Surlasului;
   Button StupiniCentru;
   Button Fagurului;
   Button Fantanii;
   Button Feldioarei;
   Button Mondotrans;
   Button TipografiaBrastar;
   Button Agetaps;
   Button Oligopol;
   Button UnitateMilitara;
   Button Conforest;
   Button GhDoja;
   Button BarieraBartolomeu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia18_retur);
    IARGhimbav= (Button) findViewById(R.id.iarghimbavRetur);
    IARGhimbav.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18IARGhimbavRetur.class);
            startActivity(i);
        }
    });
    Case= (Button) findViewById(R.id.caseRetur);
    Case.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18CaseRetur.class);
            startActivity(i);
        }
    });
    Fundaturiicl= (Button) findViewById(R.id.fundaturiiclRetur);
    Fundaturiicl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18FundaturiiclRetur.class);
            startActivity(i);
        }
    });
    Fundaturii= (Button) findViewById(R.id.fundaturiiRetur);
    Fundaturii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18FundaturiiRetur.class);
            startActivity(i);
        }
    });
    FacultativaII= (Button) findViewById(R.id.facultativaiiRetur);
    FacultativaII.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18FacultativaIIRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18FacultativaRetur.class);
            startActivity(i);
        }
    });
    Surlasului= (Button) findViewById(R.id.surlasuluiRetur);
    Surlasului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18SurlasuluiRetur.class);
            startActivity(i);
        }
    });
    StupiniCentru= (Button) findViewById(R.id.stupinicentruRetur);
    StupiniCentru.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18StupiniCentruRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18FacultativaRetur.class);
            startActivity(i);
        }
    });
    Fagurului= (Button) findViewById(R.id.faguruluiRetur);
    Fagurului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18FaguruluiRetur.class);
            startActivity(i);
        }
    });
    Fantanii= (Button) findViewById(R.id.fantaniiRetur);
    Fantanii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18FantaniiRetur.class);
            startActivity(i);
        }
    });
    Feldioarei= (Button) findViewById(R.id.feldioareiRetur);
    Feldioarei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18FeldioareiRetur.class);
            startActivity(i);
        }
    });
    Mondotrans= (Button) findViewById(R.id.mondotransRetur);
    Mondotrans.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18MondotransRetur.class);
            startActivity(i);
        }
    });
    TipografiaBrastar= (Button) findViewById(R.id.tipografiabrastarRetur);
    TipografiaBrastar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18TipografiaBrastarRetur.class);
            startActivity(i);
        }
    });
    Agetaps= (Button) findViewById(R.id.agetapsRetur);
    Agetaps.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18AgetapsRetur.class);
            startActivity(i);
        }
    });
    Oligopol= (Button) findViewById(R.id.oligopolRetur);
    Oligopol.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18OligopolRetur.class);
            startActivity(i);
        }
    });
    UnitateMilitara= (Button) findViewById(R.id.unitatemilitaraRetur);
    UnitateMilitara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18UnitateMilitaraRetur.class);
            startActivity(i);
        }
    });
    Conforest= (Button) findViewById(R.id.conforestRetur);
    Conforest.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18ConforestRetur.class);
            startActivity(i);
        }
    });
    GhDoja= (Button) findViewById(R.id.ghdojaRetur);
    GhDoja.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18GhDojaRetur.class);
            startActivity(i);
        }
    });
    BarieraBartolomeu= (Button) findViewById(R.id.barierabartolomeuRetur);
    BarieraBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia18Retur.this, Linia18BarieraBartolomeuRetur.class);
            startActivity(i);
        }
    });
    }
}