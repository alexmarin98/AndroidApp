package com.example.myapplication2.linia17b;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia17BRetur extends AppCompatActivity {
   Button GaraBrasov;
   Button Caprioara;
   Button Vlahuta;
   Button Branduselor;
   Button Gemenii;
   Button ComplexulMare;
   Button Neptun;
   Button Cometei;
   Button Saturn;
   Button Praktiker;
   Button Metro;
   Button Aurora;
   Button Pantex;
   Button DambulMorii;
   Button Facultativa;
   Button HaltaTimisulDeJos;
   Button BenzinariaPetrom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia17b_retur);
    GaraBrasov= (Button) findViewById(R.id.garabrasovRetur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BGaraBrasovRetur.class);
            startActivity(i);
        }
    });
    Caprioara= (Button) findViewById(R.id.caprioaraRetur);
    Caprioara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BCaprioaraRetur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaRetur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BVlahutaRetur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorRetur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BBranduselorRetur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiRetur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BGemeniiRetur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareRetur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BComplexulMareRetur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunRetur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BNeptunRetur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiRetur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BCometeiRetur.class);
            startActivity(i);
        }
    });
    Saturn= (Button) findViewById(R.id.saturnRetur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BSaturnRetur.class);
            startActivity(i);
        }
    });
    Praktiker= (Button) findViewById(R.id.praktikerRetur);
    Praktiker.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BPraktikerRetur.class);
            startActivity(i);
        }
    });
    Metro= (Button) findViewById(R.id.metroRetur);
    Metro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BMetroRetur.class);
            startActivity(i);
        }
    });
    Aurora= (Button) findViewById(R.id.auroraRetur);
    Aurora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BAuroraRetur.class);
            startActivity(i);
        }
    });
    Pantex= (Button) findViewById(R.id.pantexRetur);
    Pantex.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BPantexRetur.class);
            startActivity(i);
        }
    });
    DambulMorii= (Button) findViewById(R.id.dambulmoriiRetur);
    DambulMorii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BDambulMoriiRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BFacultativaRetur.class);
            startActivity(i);
        }
    });
    HaltaTimisulDeJos= (Button) findViewById(R.id.haltatimisuldejosRetur);
    HaltaTimisulDeJos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BHaltaTimisulDeJosRetur.class);
            startActivity(i);
        }
    });
    BenzinariaPetrom= (Button) findViewById(R.id.benzinariapetromRetur);
    BenzinariaPetrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BRetur.this, Linia17BBenzinariaPetromRetur.class);
            startActivity(i);
        }
    });
    }
}