package com.example.myapplication2.linia51;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia51Tur extends AppCompatActivity {
   Button GaraBrasov;
   Button Dacia;
   Button Infostar;
   Button Onix;
   Button Sanitas;
   Button Primarie;
   Button BisericaNeagra;
   Button Brancoveanu;
   Button PiataUnirii;
   Button Tocile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia51_tur);
    GaraBrasov= (Button) findViewById(R.id.garabrasovTur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Tur.this, Linia51GaraBrasovTur.class);
            startActivity(i);
        }
    });
    Dacia= (Button) findViewById(R.id.daciaTur);
    Dacia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Tur.this, Linia51DaciaTur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarTur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Tur.this, Linia51InfostarTur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixTur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Tur.this, Linia51OnixTur.class);
            startActivity(i);
        }
    });
    Sanitas= (Button) findViewById(R.id.sanitasTur);
    Sanitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Tur.this, Linia51SanitasTur.class);
            startActivity(i);
        }
    });
    Primarie= (Button) findViewById(R.id.primarieTur);
    Primarie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Tur.this, Linia51PrimarieTur.class);
            startActivity(i);
        }
    });
    BisericaNeagra= (Button) findViewById(R.id.bisericaneagraTur);
    BisericaNeagra.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Tur.this, Linia51BisericaNeagraTur.class);
            startActivity(i);
        }
    });
    Brancoveanu= (Button) findViewById(R.id.brancoveanuTur);
    Brancoveanu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Tur.this, Linia51BrancoveanuTur.class);
            startActivity(i);
        }
    });
    PiataUnirii= (Button) findViewById(R.id.piatauniriiTur);
    PiataUnirii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Tur.this, Linia51PiataUniriiTur.class);
            startActivity(i);
        }
    });
    Tocile= (Button) findViewById(R.id.tocileTur);
    Tocile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Tur.this, Linia51TocileTur.class);
            startActivity(i);
        }
    });
    }
}