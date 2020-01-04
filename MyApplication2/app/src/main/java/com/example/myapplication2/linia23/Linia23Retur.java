package com.example.myapplication2.linia23;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia23Retur extends AppCompatActivity {
   Button Saturn;
   Button Cometei;
   Button Neptun;
   Button ComplexulMare;
   Button Gemenii;
   Button PanaitCerna;
   Button Branduselor;
   Button SalaSporturilor;
   Button BdGarii;
   Button IancuJianu;
   Button Plevnei;
   Button TudorVladimirescu;
   Button StadionulTineretului;
   Button BartolomeuGara;
   Button Service;
   Button Brintex;
   Button DepoziteILF;
   Button Caramidariei;
   Button StadMunicipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia23_retur);
    Saturn= (Button) findViewById(R.id.saturnRetur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23SaturnRetur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiRetur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23CometeiRetur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunRetur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23NeptunRetur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareRetur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23ComplexulMareRetur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiRetur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23GemeniiRetur.class);
            startActivity(i);
        }
    });
    PanaitCerna= (Button) findViewById(R.id.panaitcernaRetur);
    PanaitCerna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23PanaitCernaRetur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorRetur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23BranduselorRetur.class);
            startActivity(i);
        }
    });
    SalaSporturilor= (Button) findViewById(R.id.salasporturilorRetur);
    SalaSporturilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23SalaSporturilorRetur.class);
            startActivity(i);
        }
    });
    BdGarii= (Button) findViewById(R.id.bdgariiRetur);
    BdGarii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23BdGariiRetur.class);
            startActivity(i);
        }
    });
    IancuJianu= (Button) findViewById(R.id.iancujianuRetur);
    IancuJianu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23IancuJianuRetur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiRetur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23PlevneiRetur.class);
            startActivity(i);
        }
    });
    TudorVladimirescu= (Button) findViewById(R.id.tudorvladimirescuRetur);
    TudorVladimirescu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23TudorVladimirescuRetur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiRetur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23StadionulTineretuluiRetur.class);
            startActivity(i);
        }
    });
    BartolomeuGara= (Button) findViewById(R.id.bartolomeugaraRetur);
    BartolomeuGara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23BartolomeuGaraRetur.class);
            startActivity(i);
        }
    });
    Service= (Button) findViewById(R.id.serviceRetur);
    Service.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23ServiceRetur.class);
            startActivity(i);
        }
    });
    Brintex= (Button) findViewById(R.id.brintexRetur);
    Brintex.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23BrintexRetur.class);
            startActivity(i);
        }
    });
    DepoziteILF= (Button) findViewById(R.id.depoziteilfRetur);
    DepoziteILF.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23DepoziteILFRetur.class);
            startActivity(i);
        }
    });
    Brintex= (Button) findViewById(R.id.brintexRetur);
    Brintex.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23BrintexRetur.class);
            startActivity(i);
        }
    });
    Caramidariei= (Button) findViewById(R.id.caramidarieiRetur);
    Caramidariei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23CaramidarieiRetur.class);
            startActivity(i);
        }
    });
    StadMunicipal= (Button) findViewById(R.id.stadmunicipalRetur);
    StadMunicipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia23Retur.this, Linia23StadMunicipalRetur.class);
            startActivity(i);
        }
    });
    }
}