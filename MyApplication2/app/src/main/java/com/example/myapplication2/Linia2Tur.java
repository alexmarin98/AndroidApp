package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Linia2Tur extends AppCompatActivity {

    Button LivadaPostei;
    Button Primarie;
    Button Sanitas;
    Button Onix;
    Button MirceaCelBatran;
    Button BisericaTractorul;
    Button LiceulTractorul;
    Button CineplexCoresi;
    Button AuchanCoresi;
    Button Coresi;
    Button NicolaeLabis;
    Button Rulmentul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia2_tur);
        LivadaPostei = (Button) findViewById(R.id.livadaPostei);
        Primarie = (Button) findViewById(R.id.primarie);
        Sanitas = (Button) findViewById(R.id.sanitas);
        Onix = (Button) findViewById(R.id.onix);
        MirceaCelBatran = (Button) findViewById(R.id.mircea);
        BisericaTractorul = (Button) findViewById(R.id.biserica);
        LiceulTractorul = (Button) findViewById(R.id.liceu);
        CineplexCoresi = (Button) findViewById(R.id.cineplax);
        AuchanCoresi = (Button) findViewById(R.id.auchan);
        Coresi = (Button) findViewById(R.id.coresi);
        NicolaeLabis = (Button) findViewById(R.id.labis);
        Rulmentul = (Button) findViewById(R.id.rulmentul);

        LivadaPostei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2LivadaPosteiTur.class);
                startActivity(i);
            }
        });
        Primarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2PrimarieTur.class);
                startActivity(i);
            }
        });
        Sanitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2SanitasTur.class);
                startActivity(i);
            }
        });
        Onix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2OnixTur.class);
                startActivity(i);
            }
        });
        MirceaCelBatran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2MirceaCelBatranTur.class);
                startActivity(i);
            }
        });
        BisericaTractorul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2BisericaTractorulTur.class);
                startActivity(i);
            }
        });
        LiceulTractorul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2LiceulTractorulTur.class);
                startActivity(i);
            }
        });
        CineplexCoresi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2CineplexCoresiTur.class);
                startActivity(i);
            }
        });
        AuchanCoresi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2AuchanCoresiTur.class);
                startActivity(i);
            }
        });
        Coresi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2CoresiTur.class);
                startActivity(i);
            }
        });
        NicolaeLabis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2NicolarLabisTur.class);
                startActivity(i);
            }
        });
        Rulmentul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Tur.this,Linia2Rulmentul.class);
                startActivity(i);
            }
        });
    }
}
