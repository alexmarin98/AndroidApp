package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linia1Retur extends AppCompatActivity {


    Button LivadaPostei;
    Button CameraDeComert;
    Button Primarie;
    Button Sanitas;
    Button Mesota;
    Button Cec;
    Button IUS;
    Button Vlahuta;
    Button Autogara3;
    Button Rat;
    Button Triaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia1_retur);
        LivadaPostei = (Button) findViewById(R.id.livadaPostei);
        CameraDeComert = (Button) findViewById(R.id.comert);
        Primarie = (Button) findViewById(R.id.primarie);
        Sanitas = (Button) findViewById(R.id.sanitas);
        Mesota = (Button) findViewById(R.id.mesota);
        Cec = (Button) findViewById(R.id.cec);
        IUS = (Button) findViewById(R.id.ius);
        Vlahuta = (Button) findViewById(R.id.vlahuta);
        Autogara3 = (Button) findViewById(R.id.aut3);
        Rat = (Button) findViewById(R.id.rat);
        Triaj = (Button) findViewById(R.id.triaj);
        LivadaPostei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Linia1LIvadaPosteiTur.class);
                startActivity(i);
            }
        });
        Primarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Lini1PrimarieRetur.class);
                startActivity(i);
            }
        });
        Sanitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Linia1SanitasRetur.class);
                startActivity(i);
            }
        });
        CameraDeComert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Linia1CameraDeComertRetur.class);
                startActivity(i);
            }
        });
        Mesota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Linia1MesotaRetur.class);
                startActivity(i);
            }
        });
        Cec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Linia1CecRetur.class);
                startActivity(i);
            }
        });
        IUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Linia1IusRetur.class);
                startActivity(i);
            }
        });
        Vlahuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Linia1VlahutaRetur.class);
                startActivity(i);
            }
        });
        Autogara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Linia1Autogara3Retur.class);
                startActivity(i);
            }
        });
        Rat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Linia1RatRetur.class);
                startActivity(i);
            }
        });
        Triaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Retur.this, Linia1TriajTur.class);
                startActivity(i);
            }
        });
    }
}
