package com.example.myapplication2.linia16;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia16Retur extends AppCompatActivity {
   Button LivadaPostei;
   Button Dramatic;
   Button Castanilor;
   Button Onix;
   Button Universitate;
   Button Plevnei;
   Button TudorVladimirescu;
   Button StadionulTineretului;
   Button BartolomeuGara;
   Button Service;
   Button Caramidariei;
   Button StadMunicipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia16_retur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    Dramatic= (Button) findViewById(R.id.dramaticRetur);
    Dramatic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16DramaticRetur.class);
            startActivity(i);
        }
    });
    Castanilor= (Button) findViewById(R.id.castanilorRetur);
    Castanilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16CastanilorRetur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixRetur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16OnixRetur.class);
            startActivity(i);
        }
    });
    Universitate= (Button) findViewById(R.id.universitateRetur);
    Universitate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16UniversitateRetur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiRetur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16PlevneiRetur.class);
            startActivity(i);
        }
    });
    TudorVladimirescu= (Button) findViewById(R.id.tudorvladimirescuRetur);
    TudorVladimirescu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16TudorVladimirescuRetur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiRetur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16StadionulTineretuluiRetur.class);
            startActivity(i);
        }
    });
    BartolomeuGara= (Button) findViewById(R.id.bartolomeugaraRetur);
    BartolomeuGara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16BartolomeuGaraRetur.class);
            startActivity(i);
        }
    });
    Service= (Button) findViewById(R.id.serviceRetur);
    Service.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16ServiceRetur.class);
            startActivity(i);
        }
    });
    Caramidariei= (Button) findViewById(R.id.caramidarieiRetur);
    Caramidariei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16CaramidarieiRetur.class);
            startActivity(i);
        }
    });
    StadMunicipal= (Button) findViewById(R.id.stadmunicipalRetur);
    StadMunicipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia16Retur.this, Linia16StadMunicipalRetur.class);
            startActivity(i);
        }
    });
    }
}