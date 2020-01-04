package com.example.myapplication2.linia52;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia52Retur extends AppCompatActivity {
   Button Tocile;
   Button PiataUnirii;
   Button LiceulSaguna;
   Button Balcescu;
   Button Star;
   Button Patria;
   Button HidroA;
   Button Toamnei;
   Button Traian;
   Button Gemenii;
   Button ComplexulMare;
   Button Neptun;
   Button Cometei;
   Button Saturn;
   Button Poienelor;
   Button ParcIndMetrom;
   Button Panselelor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia52_retur);
    Tocile= (Button) findViewById(R.id.tocileRetur);
    Tocile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52TocileRetur.class);
            startActivity(i);
        }
    });
    PiataUnirii= (Button) findViewById(R.id.piatauniriiRetur);
    PiataUnirii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52PiataUniriiRetur.class);
            startActivity(i);
        }
    });
    LiceulSaguna= (Button) findViewById(R.id.liceulsagunaRetur);
    LiceulSaguna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52LiceulSagunaRetur.class);
            startActivity(i);
        }
    });
    Balcescu= (Button) findViewById(R.id.balcescuRetur);
    Balcescu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52BalcescuRetur.class);
            startActivity(i);
        }
    });
    Star= (Button) findViewById(R.id.starRetur);
    Star.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52StarRetur.class);
            startActivity(i);
        }
    });
    Patria= (Button) findViewById(R.id.patriaRetur);
    Patria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52PatriaRetur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaRetur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52HidroARetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52ToamneiRetur.class);
            startActivity(i);
        }
    });
    Traian= (Button) findViewById(R.id.traianRetur);
    Traian.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52TraianRetur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiRetur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52GemeniiRetur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareRetur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52ComplexulMareRetur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunRetur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52NeptunRetur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiRetur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52CometeiRetur.class);
            startActivity(i);
        }
    });
    Saturn= (Button) findViewById(R.id.saturnRetur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52SaturnRetur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorRetur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52PoienelorRetur.class);
            startActivity(i);
        }
    });
    ParcIndMetrom= (Button) findViewById(R.id.parcindmetromRetur);
    ParcIndMetrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52ParcIndMetromRetur.class);
            startActivity(i);
        }
    });
    Panselelor= (Button) findViewById(R.id.panselelorRetur);
    Panselelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia52Retur.this, Linia52PanselelorRetur.class);
            startActivity(i);
        }
    });
    }
}