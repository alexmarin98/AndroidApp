package com.example.myapplication2.linia28;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia28Tur extends AppCompatActivity {
   Button LivadaPostei;
   Button Astra;
   Button BisericiiRomane;
   Button Memorandului;
   Button Carierei;
   Button BartolomeuGara;
   Button Service;
   Button Caramidariei;
   Button Roplant;
   Button PiataAuto;
   Button Egretei;
   Button Lanurilor;
   Button Vectra;
   Button Agricultorilor;
   Button Posta;
   Button CamineIAR;
   Button BartolomeuNord;
   Button PodBarsa;
   Button Albinelor;
   Button Fundaturii;
   Button Case;
   Button IARGhimbav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia28_tur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28LivadaPosteiTur.class);
            startActivity(i);
        }
    });
    Astra= (Button) findViewById(R.id.astraTur);
    Astra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28AstraTur.class);
            startActivity(i);
        }
    });
    BisericiiRomane= (Button) findViewById(R.id.bisericiiromaneTur);
    BisericiiRomane.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28BisericiiRomaneTur.class);
            startActivity(i);
        }
    });
    Memorandului= (Button) findViewById(R.id.memoranduluiTur);
    Memorandului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28MemoranduluiTur.class);
            startActivity(i);
        }
    });
    Carierei= (Button) findViewById(R.id.cariereiTur);
    Carierei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28CariereiTur.class);
            startActivity(i);
        }
    });
    BartolomeuGara= (Button) findViewById(R.id.bartolomeugaraTur);
    BartolomeuGara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28BartolomeuGaraTur.class);
            startActivity(i);
        }
    });
    Service= (Button) findViewById(R.id.serviceTur);
    Service.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28ServiceTur.class);
            startActivity(i);
        }
    });
    Caramidariei= (Button) findViewById(R.id.caramidarieiTur);
    Caramidariei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28CaramidarieiTur.class);
            startActivity(i);
        }
    });
    Roplant= (Button) findViewById(R.id.roplantTur);
    Roplant.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28RoplantTur.class);
            startActivity(i);
        }
    });
    PiataAuto= (Button) findViewById(R.id.piataautoTur);
    PiataAuto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28PiataAutoTur.class);
            startActivity(i);
        }
    });
    Egretei= (Button) findViewById(R.id.egreteiTur);
    Egretei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28EgreteiTur.class);
            startActivity(i);
        }
    });
    Lanurilor= (Button) findViewById(R.id.lanurilorTur);
    Lanurilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28LanurilorTur.class);
            startActivity(i);
        }
    });
    Vectra= (Button) findViewById(R.id.vectraTur);
    Vectra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28VectraTur.class);
            startActivity(i);
        }
    });
    Agricultorilor= (Button) findViewById(R.id.agricultorilorTur);
    Agricultorilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28AgricultorilorTur.class);
            startActivity(i);
        }
    });
    Posta= (Button) findViewById(R.id.postaTur);
    Posta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28PostaTur.class);
            startActivity(i);
        }
    });
    CamineIAR= (Button) findViewById(R.id.camineiarTur);
    CamineIAR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28CamineIARTur.class);
            startActivity(i);
        }
    });
    BartolomeuNord= (Button) findViewById(R.id.bartolomeunordTur);
    BartolomeuNord.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28BartolomeuNordTur.class);
            startActivity(i);
        }
    });
    PodBarsa= (Button) findViewById(R.id.podbarsaTur);
    PodBarsa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28PodBarsaTur.class);
            startActivity(i);
        }
    });
    Albinelor= (Button) findViewById(R.id.albinelorTur);
    Albinelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28AlbinelorTur.class);
            startActivity(i);
        }
    });
    Fundaturii= (Button) findViewById(R.id.fundaturiiTur);
    Fundaturii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28FundaturiiTur.class);
            startActivity(i);
        }
    });
    Case= (Button) findViewById(R.id.caseTur);
    Case.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28CaseTur.class);
            startActivity(i);
        }
    });
    IARGhimbav= (Button) findViewById(R.id.iarghimbavTur);
    IARGhimbav.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia28Tur.this, Linia28IARGhimbavTur.class);
            startActivity(i);
        }
    });
    }
}