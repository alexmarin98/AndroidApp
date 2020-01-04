package com.example.myapplication2.linia17b;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia17BTur extends AppCompatActivity {
   Button BenzinariaPetrom;
   Button HaltaTimisulDeJos;
   Button Facultativa;
   Button DambulMorii;
   Button Pantex;
   Button Aurora;
   Button Selgros;
   Button Carrefour;
   Button Saturn;
   Button Cometei;
   Button Neptun;
   Button ComplexulMare;
   Button Gemenii;
   Button PanaitCerna;
   Button Branduselor;
   Button SalaSporturilor;
   Button GaraBrasov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia17b_tur);
    BenzinariaPetrom= (Button) findViewById(R.id.benzinariapetromTur);
    BenzinariaPetrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BBenzinariaPetromTur.class);
            startActivity(i);
        }
    });
    HaltaTimisulDeJos= (Button) findViewById(R.id.haltatimisuldejosTur);
    HaltaTimisulDeJos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BHaltaTimisulDeJosTur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BFacultativaTur.class);
            startActivity(i);
        }
    });
    DambulMorii= (Button) findViewById(R.id.dambulmoriiTur);
    DambulMorii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BDambulMoriiTur.class);
            startActivity(i);
        }
    });
    Pantex= (Button) findViewById(R.id.pantexTur);
    Pantex.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BPantexTur.class);
            startActivity(i);
        }
    });
    Aurora= (Button) findViewById(R.id.auroraTur);
    Aurora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BAuroraTur.class);
            startActivity(i);
        }
    });
    Selgros= (Button) findViewById(R.id.selgrosTur);
    Selgros.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BSelgrosTur.class);
            startActivity(i);
        }
    });
    Carrefour= (Button) findViewById(R.id.carrefourTur);
    Carrefour.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BCarrefourTur.class);
            startActivity(i);
        }
    });
    Saturn= (Button) findViewById(R.id.saturnTur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BSaturnTur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiTur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BCometeiTur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunTur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BNeptunTur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareTur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BComplexulMareTur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiTur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BGemeniiTur.class);
            startActivity(i);
        }
    });
    PanaitCerna= (Button) findViewById(R.id.panaitcernaTur);
    PanaitCerna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BPanaitCernaTur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorTur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BBranduselorTur.class);
            startActivity(i);
        }
    });
    SalaSporturilor= (Button) findViewById(R.id.salasporturilorTur);
    SalaSporturilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BSalaSporturilorTur.class);
            startActivity(i);
        }
    });
    GaraBrasov= (Button) findViewById(R.id.garabrasovTur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia17BTur.this, Linia17BGaraBrasovTur.class);
            startActivity(i);
        }
    });
    }
}