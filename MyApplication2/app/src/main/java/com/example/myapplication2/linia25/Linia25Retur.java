package com.example.myapplication2.linia25;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia25Retur extends AppCompatActivity {
   Button Avantgarden;
   Button Egretei;
   Button Lanurilor;
   Button Vectra;
   Button Agricultorilor;
   Button Zlatna;
   Button ComplexBartolomeu;
   Button StadionulTineretului;
   Button Fartec;
   Button AcademiaHenriCoanda;
   Button Plevnei;
   Button IancuJianu;
   Button Faget;
   Button Caprioara;
   Button Vlahuta;
   Button Branduselor;
   Button Gemenii;
   Button ComplexulMare;
   Button Neptun;
   Button Cometei;
   Button Saturn;
   Button Roman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia25_retur);
    Avantgarden= (Button) findViewById(R.id.avantgardenRetur);
    Avantgarden.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25AvantgardenRetur.class);
            startActivity(i);
        }
    });
    Egretei= (Button) findViewById(R.id.egreteiRetur);
    Egretei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25EgreteiRetur.class);
            startActivity(i);
        }
    });
    Lanurilor= (Button) findViewById(R.id.lanurilorRetur);
    Lanurilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25LanurilorRetur.class);
            startActivity(i);
        }
    });
    Vectra= (Button) findViewById(R.id.vectraRetur);
    Vectra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25VectraRetur.class);
            startActivity(i);
        }
    });
    Agricultorilor= (Button) findViewById(R.id.agricultorilorRetur);
    Agricultorilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25AgricultorilorRetur.class);
            startActivity(i);
        }
    });
    Zlatna= (Button) findViewById(R.id.zlatnaRetur);
    Zlatna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25ZlatnaRetur.class);
            startActivity(i);
        }
    });
    ComplexBartolomeu= (Button) findViewById(R.id.complexbartolomeuRetur);
    ComplexBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25ComplexBartolomeuRetur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiRetur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25StadionulTineretuluiRetur.class);
            startActivity(i);
        }
    });
    Fartec= (Button) findViewById(R.id.fartecRetur);
    Fartec.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25FartecRetur.class);
            startActivity(i);
        }
    });
    AcademiaHenriCoanda= (Button) findViewById(R.id.academiahenricoandaRetur);
    AcademiaHenriCoanda.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25AcademiaHenriCoandaRetur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiRetur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25PlevneiRetur.class);
            startActivity(i);
        }
    });
    IancuJianu= (Button) findViewById(R.id.iancujianuRetur);
    IancuJianu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25IancuJianuRetur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetRetur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25FagetRetur.class);
            startActivity(i);
        }
    });
    Caprioara= (Button) findViewById(R.id.caprioaraRetur);
    Caprioara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25CaprioaraRetur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaRetur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25VlahutaRetur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorRetur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25BranduselorRetur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiRetur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25GemeniiRetur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareRetur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25ComplexulMareRetur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunRetur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25NeptunRetur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiRetur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25CometeiRetur.class);
            startActivity(i);
        }
    });
    Saturn= (Button) findViewById(R.id.saturnRetur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25SaturnRetur.class);
            startActivity(i);
        }
    });
    Roman= (Button) findViewById(R.id.romanRetur);
    Roman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia25Retur.this, Linia25RomanRetur.class);
            startActivity(i);
        }
    });
    }
}