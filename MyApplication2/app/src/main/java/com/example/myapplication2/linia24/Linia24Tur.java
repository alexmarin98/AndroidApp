package com.example.myapplication2.linia24;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia24Tur extends AppCompatActivity {
   Button BaciuluiCL;
   Button Facultativa;
   Button StrBaciului;
   Button StupiniiNoi;
   Button StrFagurului;
   Button StrIzvorului;
   Button FacultativaIzv;
   Button StupiniIzvorului;
   Button StupiniCentru;
   Button Surlasului;
   Button FacultativaII;
   Button Fundaturii;
   Button FundaturiiCl;
   Button FacultativaFundaturii;
   Button ICPC;
   Button CampusGenius;
   Button TargAuto;
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
        setContentView(R.layout.activity_linia24_tur);
    BaciuluiCL= (Button) findViewById(R.id.baciuluiclTur);
    BaciuluiCL.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24BaciuluiCLTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24FacultativaTur.class);
            startActivity(i);
        }
    });
    StrBaciului= (Button) findViewById(R.id.strbaciuluiTur);
    StrBaciului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24StrBaciuluiTur.class);
            startActivity(i);
        }
    });
    StupiniiNoi= (Button) findViewById(R.id.stupiniinoiTur);
    StupiniiNoi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24StupiniiNoiTur.class);
            startActivity(i);
        }
    });
    StrFagurului= (Button) findViewById(R.id.strfaguruluiTur);
    StrFagurului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24StrFaguruluiTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24FacultativaTur.class);
            startActivity(i);
        }
    });
    StrIzvorului= (Button) findViewById(R.id.strizvoruluiTur);
    StrIzvorului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24StrIzvoruluiTur.class);
            startActivity(i);
        }
    });
    FacultativaIzv= (Button) findViewById(R.id.facultativaizvTur);
    FacultativaIzv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24FacultativaIzvTur.class);
            startActivity(i);
        }
    });
    StupiniIzvorului= (Button) findViewById(R.id.stupiniizvoruluiTur);
    StupiniIzvorului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24StupiniIzvoruluiTur.class);
            startActivity(i);
        }
    });
    StupiniCentru= (Button) findViewById(R.id.stupinicentruTur);
    StupiniCentru.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24StupiniCentruTur.class);
            startActivity(i);
        }
    });
    Surlasului= (Button) findViewById(R.id.surlasuluiTur);
    Surlasului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24SurlasuluiTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24FacultativaTur.class);
            startActivity(i);
        }
    });
    FacultativaII= (Button) findViewById(R.id.facultativaiiTur);
    FacultativaII.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24FacultativaIITur.class);
            startActivity(i);
        }
    });
    Fundaturii= (Button) findViewById(R.id.fundaturiiTur);
    Fundaturii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24FundaturiiTur.class);
            startActivity(i);
        }
    });
    FundaturiiCl= (Button) findViewById(R.id.fundaturiiclTur);
    FundaturiiCl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24FundaturiiClTur.class);
            startActivity(i);
        }
    });
    FacultativaFundaturii= (Button) findViewById(R.id.facultativafundaturiiTur);
    FacultativaFundaturii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24FacultativaFundaturiiTur.class);
            startActivity(i);
        }
    });
    ICPC= (Button) findViewById(R.id.icpcTur);
    ICPC.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24ICPCTur.class);
            startActivity(i);
        }
    });
    CampusGenius= (Button) findViewById(R.id.campusgeniusTur);
    CampusGenius.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24CampusGeniusTur.class);
            startActivity(i);
        }
    });
    TargAuto= (Button) findViewById(R.id.targautoTur);
    TargAuto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24TargAutoTur.class);
            startActivity(i);
        }
    });
    Roplant= (Button) findViewById(R.id.roplantTur);
    Roplant.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24RoplantTur.class);
            startActivity(i);
        }
    });
    Hornbach= (Button) findViewById(R.id.hornbachTur);
    Hornbach.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24HornbachTur.class);
            startActivity(i);
        }
    });
    Caramidariei= (Button) findViewById(R.id.caramidarieiTur);
    Caramidariei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24CaramidarieiTur.class);
            startActivity(i);
        }
    });
    StadMunicipal= (Button) findViewById(R.id.stadmunicipalTur);
    StadMunicipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24StadMunicipalTur.class);
            startActivity(i);
        }
    });
    BisericaBartolomeu= (Button) findViewById(R.id.bisericabartolomeuTur);
    BisericaBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24BisericaBartolomeuTur.class);
            startActivity(i);
        }
    });
    Carierei= (Button) findViewById(R.id.cariereiTur);
    Carierei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24CariereiTur.class);
            startActivity(i);
        }
    });
    Memorandului= (Button) findViewById(R.id.memoranduluiTur);
    Memorandului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24MemoranduluiTur.class);
            startActivity(i);
        }
    });
    BisericiiRomane= (Button) findViewById(R.id.bisericiiromaneTur);
    BisericiiRomane.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24BisericiiRomaneTur.class);
            startActivity(i);
        }
    });
    Astra= (Button) findViewById(R.id.astraTur);
    Astra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24AstraTur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Tur.this, Linia24LivadaPosteiTur.class);
            startActivity(i);
        }
    });
    }
}