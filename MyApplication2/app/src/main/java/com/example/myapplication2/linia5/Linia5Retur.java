package com.example.myapplication2.linia5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication2.R;

public class Linia5Retur extends AppCompatActivity {

    Button StadMunicipal;
    Button BartolomeuGara;
    Button Carierei;
    Button BisericiiRomane;
    Button Memorandului;
    Button Astra;
    Button Primarie;
    Button Sanitas;
    Button CameraDeComert;
    Button LiceulMesota;
    Button Toamnei;
    Button SpitalJudetean;
    Button LiceuInfo;
    Button Berzei;
    Button Soarelui;
    Button Roman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia5_retur);
        StadMunicipal = (Button) findViewById(R.id.stadion);
        Carierei = (Button) findViewById(R.id.carierei);
        Memorandului = (Button) findViewById(R.id.memorandului);
        BisericiiRomane = (Button) findViewById(R.id.bisericiiRomane);
        Astra = (Button) findViewById(R.id.astra);
        BartolomeuGara = (Button) findViewById(R.id.bartolomeuGara);
        Primarie = (Button) findViewById(R.id.primarie);
        Sanitas = (Button) findViewById(R.id.sanitas);
        CameraDeComert = (Button) findViewById(R.id.comert);
        SpitalJudetean = (Button) findViewById(R.id.spital);
        LiceuInfo = (Button) findViewById(R.id.liceuInfo);
        Berzei = (Button) findViewById(R.id.berzei);
        LiceulMesota = (Button) findViewById(R.id.mesota);
        Toamnei = (Button) findViewById(R.id.toamnei);
        Soarelui = (Button) findViewById(R.id.soarelui);
        Roman = (Button) findViewById(R.id.roman);
        StadMunicipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5StadionMunicipal.class);
                startActivity(i);
            }
        });

        Carierei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5CariereiRetur.class);
                startActivity(i);
            }
        });
        Memorandului.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5MemoranduluiRetur.class);
                startActivity(i);
            }
        });
        BisericiiRomane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5BisericiiRoamaneRetur.class);
                startActivity(i);
            }
        });
        Astra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5AstraRetur.class);
                startActivity(i);
            }
        });
        BartolomeuGara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5BartolomeuGaraRetur.class);
                startActivity(i);
            }
        });
        Primarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5primarieRetur.class);
                startActivity(i);
            }
        });
        Sanitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5SanitasRetur.class);
                startActivity(i);
            }
        });
        CameraDeComert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5CameraDeComertRetur.class);
                startActivity(i);
            }
        });
        SpitalJudetean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5SpitalJudeteanRetur.class);
                startActivity(i);
            }
        });
        LiceuInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5LiceulInforamticaretur.class);
                startActivity(i);
            }
        });
        Berzei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5BerzeiRetur.class);
                startActivity(i);
            }
        });
        LiceulMesota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5MesotaRetur.class);
                startActivity(i);
            }
        });
        Toamnei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5ToamneiRetur.class);
                startActivity(i);
            }
        });
        Soarelui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5SoareluiRetur.class);
                startActivity(i);
            }
        });
        Roman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5Retur.this,Linia5RomanTur.class);
                startActivity(i);
            }
        });

    }
}
