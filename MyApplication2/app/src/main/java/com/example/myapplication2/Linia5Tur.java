package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linia5Tur extends AppCompatActivity {
    Button StadMunicipal;
    Button BisericaBartolomeu;
    Button Carierei;
    Button Memorandului;
    Button BisericiiRomane;
    Button Astra;
    Button Dramatic;
    Button Patria;
    Button HidroA;
    Button HidroB;
    Button SpitalJudetean;
    Button LiceuInfo;
    Button Berzei;
    Button Pompieri;
    Button Metrom;
    Button Poienelor;
    Button Roman;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia5_tur);
        StadMunicipal = (Button) findViewById(R.id.stadion);
        BisericaBartolomeu = (Button) findViewById(R.id.bisericaBartolomeu);
        Carierei = (Button) findViewById(R.id.carierei);
        Memorandului = (Button) findViewById(R.id.memorandului);
        BisericiiRomane = (Button) findViewById(R.id.bisericiiRomane);
        Astra = (Button) findViewById(R.id.astra);
        Dramatic = (Button) findViewById(R.id.dramatic);
        Patria = (Button) findViewById(R.id.patria);
        HidroA = (Button) findViewById(R.id.hidroA);
        HidroB = (Button) findViewById(R.id.hidroB);
        SpitalJudetean = (Button) findViewById(R.id.spitalJudetean);
        LiceuInfo = (Button) findViewById(R.id.liceuInfo);
        Berzei = (Button) findViewById(R.id.berzei);
        Pompieri = (Button) findViewById(R.id.pompieri);
        Metrom = (Button) findViewById(R.id.metrom);
        Poienelor = (Button) findViewById(R.id.poienelor);
        Roman = (Button) findViewById(R.id.roman);
        StadMunicipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5StadionMunicipal.class);
                startActivity(i);
            }
        });
        BisericaBartolomeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5BisericaBartolomeuTur.class);
                startActivity(i);
            }
        });
        Carierei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5CariereiTur.class);
                startActivity(i);
            }
        });
        Memorandului.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5MemoranduluiTur.class);
                startActivity(i);
            }
        });
        BisericiiRomane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5BisericiiRomanerTur.class);
                startActivity(i);
            }
        });
        Astra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5AstraTur.class);
                startActivity(i);
            }
        });
        Dramatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5DramaticTur.class);
                startActivity(i);
            }
        });
        Patria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5PatriaTur.class);
                startActivity(i);
            }
        });
        HidroA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5HidroATur.class);
                startActivity(i);
            }
        });
        HidroB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5HidroBTur.class);
                startActivity(i);
            }
        });
        SpitalJudetean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5spitaljudTur.class);
                startActivity(i);
            }
        });
        LiceuInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5LiceuInfoTur.class);
                startActivity(i);
            }
        });
        Berzei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5BerzeiTur.class);
                startActivity(i);
            }
        });
        Pompieri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5PompieriTur.class);
                startActivity(i);
            }
        });
        Metrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5MetromTur.class);
                startActivity(i);
            }
        });
        Poienelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5PoienelorTur.class);
                startActivity(i);
            }
        });
        Roman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Tur.this,Linia5RomanTur.class);
                startActivity(i);
            }
        });

    }
}
