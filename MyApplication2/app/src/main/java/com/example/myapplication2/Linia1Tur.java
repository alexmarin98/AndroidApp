package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Linia1Tur extends AppCompatActivity {

    Button LivadaPostei;
    Button Dramatic;
    Button Patria;
    Button Hidro;
    Button Toamnei;
    Button ToamneiCec;
    Button IUS;
    Button Vlahuta;
    Button Autogara3;
    Button Rat;
    Button Triaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia1_tur);
        LivadaPostei = (Button) findViewById(R.id.livadaPosteiTur);
        Dramatic = (Button) findViewById(R.id.dramaticTur);
        Patria = (Button) findViewById(R.id.patria);
        Hidro = (Button) findViewById(R.id.hidro);
        Toamnei = (Button) findViewById(R.id.toamnei);
        ToamneiCec = (Button) findViewById(R.id.toamneiCec);
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
                Intent i = new Intent(Linia1Tur.this, Linia1LIvadaPosteiTur.class);
                startActivity(i);
            }
        });
        Dramatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Tur.this, Linia1DramaticTur.class);
                startActivity(i);
            }
        });
        Patria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Tur.this, Linia1PatriaTur.class);
                startActivity(i);
            }
        });
        Hidro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Tur.this, Linia1HidroATur.class);
                startActivity(i);
            }
        });
        Toamnei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Tur.this, Linia1ToamneiTur.class);
                startActivity(i);
            }
        });
        ToamneiCec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Tur.this, Linia1ToamneiCecTur.class);
                startActivity(i);
            }
        });
        IUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Tur.this, Linia1IusTur.class);
                startActivity(i);
            }
        });
        Vlahuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Tur.this, Linia1VlahutaTur.class);
                startActivity(i);
            }
        });
        Autogara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Tur.this, Linia1Autogara3Tur.class);
                startActivity(i);
            }
        });
        Rat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Tur.this, Linia1RatTur.class);
                startActivity(i);
            }
        });
        Triaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(Linia1Tur.this, Linia1TriajTur.class);
                startActivity(i);
            }
        });
    }
}
