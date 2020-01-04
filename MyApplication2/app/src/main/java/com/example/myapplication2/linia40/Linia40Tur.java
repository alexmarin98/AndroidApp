package com.example.myapplication2.linia40;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia40Tur extends AppCompatActivity {
   Button GaraBrasov;
   Button BdGarii;
   Button IancuJianu;
   Button Plevnei;
   Button HotelTrifan;
   Button Baumax;
   Button Dedeman;
   Button Iveco;
   Button Elmas;
   Button PiataAgroalimentara;
   Button TipografiaBrastar;
   Button Mondotrans;
   Button Feldioarei;
   Button Fantanii;
   Button Fagurului;
   Button Facultativa;
   Button StupiniCentru;
   Button StupiniIzvorului;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia40_tur);
    GaraBrasov= (Button) findViewById(R.id.garabrasovTur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40GaraBrasovTur.class);
            startActivity(i);
        }
    });
    BdGarii= (Button) findViewById(R.id.bdgariiTur);
    BdGarii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40BdGariiTur.class);
            startActivity(i);
        }
    });
    IancuJianu= (Button) findViewById(R.id.iancujianuTur);
    IancuJianu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40IancuJianuTur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiTur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40PlevneiTur.class);
            startActivity(i);
        }
    });
    HotelTrifan= (Button) findViewById(R.id.hoteltrifanTur);
    HotelTrifan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40HotelTrifanTur.class);
            startActivity(i);
        }
    });
    Baumax= (Button) findViewById(R.id.baumaxTur);
    Baumax.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40BaumaxTur.class);
            startActivity(i);
        }
    });
    Dedeman= (Button) findViewById(R.id.dedemanTur);
    Dedeman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40DedemanTur.class);
            startActivity(i);
        }
    });
    Iveco= (Button) findViewById(R.id.ivecoTur);
    Iveco.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40IvecoTur.class);
            startActivity(i);
        }
    });
    Elmas= (Button) findViewById(R.id.elmasTur);
    Elmas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40ElmasTur.class);
            startActivity(i);
        }
    });
    PiataAgroalimentara= (Button) findViewById(R.id.piataagroalimentaraTur);
    PiataAgroalimentara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40PiataAgroalimentaraTur.class);
            startActivity(i);
        }
    });
    TipografiaBrastar= (Button) findViewById(R.id.tipografiabrastarTur);
    TipografiaBrastar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40TipografiaBrastarTur.class);
            startActivity(i);
        }
    });
    Mondotrans= (Button) findViewById(R.id.mondotransTur);
    Mondotrans.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40MondotransTur.class);
            startActivity(i);
        }
    });
    Feldioarei= (Button) findViewById(R.id.feldioareiTur);
    Feldioarei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40FeldioareiTur.class);
            startActivity(i);
        }
    });
    Fantanii= (Button) findViewById(R.id.fantaniiTur);
    Fantanii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40FantaniiTur.class);
            startActivity(i);
        }
    });
    Fagurului= (Button) findViewById(R.id.faguruluiTur);
    Fagurului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40FaguruluiTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40FacultativaTur.class);
            startActivity(i);
        }
    });
    StupiniCentru= (Button) findViewById(R.id.stupinicentruTur);
    StupiniCentru.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40StupiniCentruTur.class);
            startActivity(i);
        }
    });
    StupiniIzvorului= (Button) findViewById(R.id.stupiniizvoruluiTur);
    StupiniIzvorului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia40Tur.this, Linia40StupiniIzvoruluiTur.class);
            startActivity(i);
        }
    });
    }
}