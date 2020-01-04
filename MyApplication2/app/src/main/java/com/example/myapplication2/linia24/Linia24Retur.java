package com.example.myapplication2.linia24;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia24Retur extends AppCompatActivity {
   Button LivadaPostei;
   Button Astra;
   Button BisericiiRomane;
   Button Memorandului;
   Button Carierei;
   Button BartolomeuGara;
   Button Service;
   Button Caramidariei;
   Button Roplant;
   Button TargAuto;
   Button CampusGenius;
   Button ICPC;
   Button FacultativaFundaturii;
   Button FundaturiiCl;
   Button Fundaturii;
   Button FacultativaII;
   Button Facultativa;
   Button Surlasului;
   Button StupiniCentru;
   Button IzvoruluiSpreBaciului;
   Button StrIzvorului;
   Button StrFagurului;
   Button StrBaciului;
   Button BaciuluiCL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia24_retur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    Astra= (Button) findViewById(R.id.astraRetur);
    Astra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24AstraRetur.class);
            startActivity(i);
        }
    });
    BisericiiRomane= (Button) findViewById(R.id.bisericiiromaneRetur);
    BisericiiRomane.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24BisericiiRomaneRetur.class);
            startActivity(i);
        }
    });
    Memorandului= (Button) findViewById(R.id.memoranduluiRetur);
    Memorandului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24MemoranduluiRetur.class);
            startActivity(i);
        }
    });
    Carierei= (Button) findViewById(R.id.cariereiRetur);
    Carierei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24CariereiRetur.class);
            startActivity(i);
        }
    });
    BartolomeuGara= (Button) findViewById(R.id.bartolomeugaraRetur);
    BartolomeuGara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24BartolomeuGaraRetur.class);
            startActivity(i);
        }
    });
    Service= (Button) findViewById(R.id.serviceRetur);
    Service.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24ServiceRetur.class);
            startActivity(i);
        }
    });
    Caramidariei= (Button) findViewById(R.id.caramidarieiRetur);
    Caramidariei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24CaramidarieiRetur.class);
            startActivity(i);
        }
    });
    Roplant= (Button) findViewById(R.id.roplantRetur);
    Roplant.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24RoplantRetur.class);
            startActivity(i);
        }
    });
    TargAuto= (Button) findViewById(R.id.targautoRetur);
    TargAuto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24TargAutoRetur.class);
            startActivity(i);
        }
    });
    CampusGenius= (Button) findViewById(R.id.campusgeniusRetur);
    CampusGenius.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24CampusGeniusRetur.class);
            startActivity(i);
        }
    });
    ICPC= (Button) findViewById(R.id.icpcRetur);
    ICPC.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24ICPCRetur.class);
            startActivity(i);
        }
    });
    FacultativaFundaturii= (Button) findViewById(R.id.facultativafundaturiiRetur);
    FacultativaFundaturii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24FacultativaFundaturiiRetur.class);
            startActivity(i);
        }
    });
    FundaturiiCl= (Button) findViewById(R.id.fundaturiiclRetur);
    FundaturiiCl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24FundaturiiClRetur.class);
            startActivity(i);
        }
    });
    Fundaturii= (Button) findViewById(R.id.fundaturiiRetur);
    Fundaturii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24FundaturiiRetur.class);
            startActivity(i);
        }
    });
    FacultativaII= (Button) findViewById(R.id.facultativaiiRetur);
    FacultativaII.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24FacultativaIIRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24FacultativaRetur.class);
            startActivity(i);
        }
    });
    Surlasului= (Button) findViewById(R.id.surlasuluiRetur);
    Surlasului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24SurlasuluiRetur.class);
            startActivity(i);
        }
    });
    StupiniCentru= (Button) findViewById(R.id.stupinicentruRetur);
    StupiniCentru.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24StupiniCentruRetur.class);
            startActivity(i);
        }
    });
    IzvoruluiSpreBaciului= (Button) findViewById(R.id.izvoruluisprebaciuluiRetur);
    IzvoruluiSpreBaciului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24IzvoruluiSpreBaciuluiRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24FacultativaRetur.class);
            startActivity(i);
        }
    });
    StrIzvorului= (Button) findViewById(R.id.strizvoruluiRetur);
    StrIzvorului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24StrIzvoruluiRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24FacultativaRetur.class);
            startActivity(i);
        }
    });
    StrFagurului= (Button) findViewById(R.id.strfaguruluiRetur);
    StrFagurului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24StrFaguruluiRetur.class);
            startActivity(i);
        }
    });
    StrBaciului= (Button) findViewById(R.id.strbaciuluiRetur);
    StrBaciului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24StrBaciuluiRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24FacultativaRetur.class);
            startActivity(i);
        }
    });
    BaciuluiCL= (Button) findViewById(R.id.baciuluiclRetur);
    BaciuluiCL.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia24Retur.this, Linia24BaciuluiCLRetur.class);
            startActivity(i);
        }
    });
    }
}