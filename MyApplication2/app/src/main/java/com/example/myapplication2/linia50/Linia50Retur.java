package com.example.myapplication2.linia50;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia50Retur extends AppCompatActivity {
   Button LivadaPostei;
   Button BisericaNeagra;
   Button Brancoveanu;
   Button PiataUnirii;
   Button Tocile;
   Button Facultativa;
   Button Varistei;
   Button Invatatorilor;
   Button PodulCretului;
   Button LaMoara;
   Button FacultativaII;
   Button Solomon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia50_retur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    BisericaNeagra= (Button) findViewById(R.id.bisericaneagraRetur);
    BisericaNeagra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50BisericaNeagraRetur.class);
            startActivity(i);
        }
    });
    Brancoveanu= (Button) findViewById(R.id.brancoveanuRetur);
    Brancoveanu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50BrancoveanuRetur.class);
            startActivity(i);
        }
    });
    PiataUnirii= (Button) findViewById(R.id.piatauniriiRetur);
    PiataUnirii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50PiataUniriiRetur.class);
            startActivity(i);
        }
    });
    Tocile= (Button) findViewById(R.id.tocileRetur);
    Tocile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50TocileRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50FacultativaRetur.class);
            startActivity(i);
        }
    });
    Varistei= (Button) findViewById(R.id.varisteiRetur);
    Varistei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50VaristeiRetur.class);
            startActivity(i);
        }
    });
    Invatatorilor= (Button) findViewById(R.id.invatatorilorRetur);
    Invatatorilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50InvatatorilorRetur.class);
            startActivity(i);
        }
    });
    PodulCretului= (Button) findViewById(R.id.podulcretuluiRetur);
    PodulCretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50PodulCretuluiRetur.class);
            startActivity(i);
        }
    });
    LaMoara= (Button) findViewById(R.id.lamoaraRetur);
    LaMoara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50LaMoaraRetur.class);
            startActivity(i);
        }
    });
    FacultativaII= (Button) findViewById(R.id.facultativaiiRetur);
    FacultativaII.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50FacultativaIIRetur.class);
            startActivity(i);
        }
    });
    Solomon= (Button) findViewById(R.id.solomonRetur);
    Solomon.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Retur.this, Linia50SolomonRetur.class);
            startActivity(i);
        }
    });
    }
}