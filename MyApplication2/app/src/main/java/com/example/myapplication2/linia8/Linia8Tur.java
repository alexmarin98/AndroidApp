package com.example.myapplication2.linia8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia8Tur extends AppCompatActivity {
   Button Rulmentul;
   Button NLabis;
   Button Coresi;
   Button LiceulTractorul;
   Button BisericaTractorul;
   Button Faget;
   Button Caprioara;
   Button Vlahuta;
   Button Branduselor;
   Button Gemenii;
   Button ComplexulMare;
   Button Neptun;
   Button Cometei;
   Button Saturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia8_tur);
    Rulmentul= (Button) findViewById(R.id.rulmentulTur);
    Rulmentul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8RulmentulTur.class);
            startActivity(i);
        }
    });
    NLabis= (Button) findViewById(R.id.nlabisTur);
    NLabis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8NLabisTur.class);
            startActivity(i);
        }
    });
    Coresi= (Button) findViewById(R.id.coresiTur);
    Coresi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8CoresiTur.class);
            startActivity(i);
        }
    });
    LiceulTractorul= (Button) findViewById(R.id.liceultractorulTur);
    LiceulTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8LiceulTractorulTur.class);
            startActivity(i);
        }
    });
    BisericaTractorul= (Button) findViewById(R.id.bisericatractorulTur);
    BisericaTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8BisericaTractorulTur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetTur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8FagetTur.class);
            startActivity(i);
        }
    });
    Caprioara= (Button) findViewById(R.id.caprioaraTur);
    Caprioara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8CaprioaraTur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaTur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8VlahutaTur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorTur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8BranduselorTur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiTur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8GemeniiTur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareTur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8ComplexulMareTur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunTur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8NeptunTur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiTur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8CometeiTur.class);
            startActivity(i);
        }
    });
    Saturn= (Button) findViewById(R.id.saturnTur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Tur.this, Linia8SaturnTur.class);
            startActivity(i);
        }
    });
    }
}