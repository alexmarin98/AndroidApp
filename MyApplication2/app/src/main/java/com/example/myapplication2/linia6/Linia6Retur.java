package com.example.myapplication2.linia6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia6Retur extends AppCompatActivity {
   Button LivadaPostei;
   Button Dramatic;
   Button Patria;
   Button HidroA;
   Button Toamnei;
   Button Traian;
   Button Gemenii;
   Button ComplexulMare;
   Button Neptun;
   Button Cometei;
   Button Saturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia6_retur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    Dramatic= (Button) findViewById(R.id.dramaticRetur);
    Dramatic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6DramaticRetur.class);
            startActivity(i);
        }
    });
    Patria= (Button) findViewById(R.id.patriaRetur);
    Patria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6PatriaRetur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaRetur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6HidroARetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6ToamneiRetur.class);
            startActivity(i);
        }
    });
    Traian= (Button) findViewById(R.id.traianRetur);
    Traian.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6TraianRetur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiRetur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6GemeniiRetur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareRetur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6ComplexulMareRetur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunRetur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6NeptunRetur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiRetur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6CometeiRetur.class);
            startActivity(i);
        }
    });
    Saturn= (Button) findViewById(R.id.saturnRetur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia6Retur.this, Linia6SaturnRetur.class);
            startActivity(i);
        }
    });
    }
}