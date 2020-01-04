package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linia4Retur extends AppCompatActivity {

    Button LivadaPostei;
    Button Dramatic;
    Button Patria;
    Button Hidro;
    Button LiceulMesota;
    Button Infostar;
    Button Rapid;
    Button GaraBrasov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia4_retur);
        LivadaPostei = (Button) findViewById(R.id.livada);
        Dramatic = (Button) findViewById(R.id.dramatic);
        Patria = (Button) findViewById(R.id.patria);
        Hidro = (Button) findViewById(R.id.hidro);
        Infostar = (Button) findViewById(R.id.info);
        Rapid = (Button) findViewById(R.id.rapid);
        GaraBrasov = (Button) findViewById(R.id.gara);
        LivadaPostei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia4Retur.this,linia4LivadaPostei.class);
                startActivity(i);
            }
        });
        Dramatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia4Retur.this,Linia4DramaticRetur.class);
                startActivity(i);
            }
        });
        Patria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia4Retur.this,linia4PatriaRetur.class);
                startActivity(i);
            }
        });
        Hidro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia4Retur.this,Linia4HidroARetur.class);
                startActivity(i);
            }
        });
        Infostar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia4Retur.this,Linia4InfostarRetur.class);
                startActivity(i);
            }
        });
        Rapid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia4Retur.this,Linia4RapidRetur.class);
                startActivity(i);
            }
        });
        GaraBrasov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia4Retur.this,Linia4GaraBrasovTur.class);
                startActivity(i);
            }
        });
    }
}
