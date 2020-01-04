package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LInia4Tur extends AppCompatActivity {
    Button LivadaPostei;
    Button Primarie;
    Button Sanitas;
    Button CameraDeComert;
    Button LiceulMesota;
    Button Infostar;
    Button Dacia;
    Button GaraBrasov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia4_tur);
        LivadaPostei = (Button) findViewById(R.id.livadaPostei);
        Primarie = (Button) findViewById(R.id.primarie);
        Sanitas = (Button) findViewById(R.id.sanitas);
        CameraDeComert = (Button) findViewById(R.id.comert);
        LiceulMesota = (Button) findViewById(R.id.mesota);
        Infostar = (Button) findViewById(R.id.info);
        Dacia = (Button) findViewById(R.id.dacia);
        GaraBrasov = (Button) findViewById(R.id.gara);
        LivadaPostei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LInia4Tur.this,linia4LivadaPostei.class);
                startActivity(i);
            }
        });
        Primarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LInia4Tur.this,Linia4PrimarieTur.class);
                startActivity(i);
            }
        });
        Sanitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LInia4Tur.this,Linia4SanitasTur.class);
                startActivity(i);
            }
        });
        CameraDeComert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LInia4Tur.this,Linia4CameraDeComertTur.class);
                startActivity(i);
            }
        });
        LiceulMesota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LInia4Tur.this,Linia4MesotaTur.class);
                startActivity(i);
            }
        });
        Infostar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LInia4Tur.this,Linia4InfoStarTur.class);
                startActivity(i);
            }
        });
        Dacia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LInia4Tur.this,Linia4DaciaTur.class);
                startActivity(i);
            }
        });
        GaraBrasov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LInia4Tur.this,Linia4GaraBrasovTur.class);
                startActivity(i);
            }
        });
    }
}
