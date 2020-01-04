package com.example.myapplication2.linia28;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia28Retur extends AppCompatActivity {
   Button IARGhimbav;
   Button Case;
   Button ICPC;
   Button FundaturiiCl;
   Button Fundaturii;
   Button Albinelor;
   Button PodBarsa;
   Button BartolomeuNord;
   Button CamineIAR;
   Button Posta;
   Button MolnarJanos;
   Button Facultativa;
   Button Avantgarden;
   Button Roplant;
   Button Hornbach;
   Button Caramidariei;
   Button StadMunicipal;
   Button BisericaBartolomeu;
   Button Carierei;
   Button Memorandului;
   Button BisericiiRomane;
   Button Astra;
   Button LivadaPostei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia28_retur);
    IARGhimbav= (Button) findViewById(R.id.iarghimbavRetur);
    IARGhimbav.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28IARGhimbavRetur.class);
            startActivity(i);
        }
    });
    Case= (Button) findViewById(R.id.caseRetur);
    Case.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28CaseRetur.class);
            startActivity(i);
        }
    });
    ICPC= (Button) findViewById(R.id.icpcRetur);
    ICPC.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28ICPCRetur.class);
            startActivity(i);
        }
    });
    FundaturiiCl= (Button) findViewById(R.id.fundaturiiclRetur);
    FundaturiiCl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28FundaturiiClRetur.class);
            startActivity(i);
        }
    });
    Fundaturii= (Button) findViewById(R.id.fundaturiiRetur);
    Fundaturii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28FundaturiiRetur.class);
            startActivity(i);
        }
    });
    Albinelor= (Button) findViewById(R.id.albinelorRetur);
    Albinelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28AlbinelorRetur.class);
            startActivity(i);
        }
    });
    PodBarsa= (Button) findViewById(R.id.podbarsaRetur);
    PodBarsa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28PodBarsaRetur.class);
            startActivity(i);
        }
    });
    BartolomeuNord= (Button) findViewById(R.id.bartolomeunordRetur);
    BartolomeuNord.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28BartolomeuNordRetur.class);
            startActivity(i);
        }
    });
    CamineIAR= (Button) findViewById(R.id.camineiarRetur);
    CamineIAR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28CamineIARRetur.class);
            startActivity(i);
        }
    });
    Posta= (Button) findViewById(R.id.postaRetur);
    Posta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28PostaRetur.class);
            startActivity(i);
        }
    });
    MolnarJanos= (Button) findViewById(R.id.molnarjanosRetur);
    MolnarJanos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28MolnarJanosRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28FacultativaRetur.class);
            startActivity(i);
        }
    });
    Avantgarden= (Button) findViewById(R.id.avantgardenRetur);
    Avantgarden.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28AvantgardenRetur.class);
            startActivity(i);
        }
    });
    Roplant= (Button) findViewById(R.id.roplantRetur);
    Roplant.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28RoplantRetur.class);
            startActivity(i);
        }
    });
    Hornbach= (Button) findViewById(R.id.hornbachRetur);
    Hornbach.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28HornbachRetur.class);
            startActivity(i);
        }
    });
    Caramidariei= (Button) findViewById(R.id.caramidarieiRetur);
    Caramidariei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28CaramidarieiRetur.class);
            startActivity(i);
        }
    });
    StadMunicipal= (Button) findViewById(R.id.stadmunicipalRetur);
    StadMunicipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28StadMunicipalRetur.class);
            startActivity(i);
        }
    });
    BisericaBartolomeu= (Button) findViewById(R.id.bisericabartolomeuRetur);
    BisericaBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28BisericaBartolomeuRetur.class);
            startActivity(i);
        }
    });
    Carierei= (Button) findViewById(R.id.cariereiRetur);
    Carierei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28CariereiRetur.class);
            startActivity(i);
        }
    });
    Memorandului= (Button) findViewById(R.id.memoranduluiRetur);
    Memorandului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28MemoranduluiRetur.class);
            startActivity(i);
        }
    });
    BisericiiRomane= (Button) findViewById(R.id.bisericiiromaneRetur);
    BisericiiRomane.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28BisericiiRomaneRetur.class);
            startActivity(i);
        }
    });
    Astra= (Button) findViewById(R.id.astraRetur);
    Astra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28AstraRetur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Retur.this, Linia28LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    }
}