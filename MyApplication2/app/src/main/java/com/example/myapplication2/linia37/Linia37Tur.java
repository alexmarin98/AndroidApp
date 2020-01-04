package com.example.myapplication2.linia37;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia37Tur extends AppCompatActivity {
   Button HidroA;
   Button Infostar;
   Button Rapid;
   Button Caprioara;
   Button Vlahuta;
   Button Ceferistilor;
   Button IntCeferistilor;
   Button Craiter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia37_tur);
    HidroA= (Button) findViewById(R.id.hidroaTur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Tur.this, Linia37HidroATur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarTur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Tur.this, Linia37InfostarTur.class);
            startActivity(i);
        }
    });
    Rapid= (Button) findViewById(R.id.rapidTur);
    Rapid.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Tur.this, Linia37RapidTur.class);
            startActivity(i);
        }
    });
    Caprioara= (Button) findViewById(R.id.caprioaraTur);
    Caprioara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Tur.this, Linia37CaprioaraTur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaTur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Tur.this, Linia37VlahutaTur.class);
            startActivity(i);
        }
    });
    Ceferistilor= (Button) findViewById(R.id.ceferistilorTur);
    Ceferistilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Tur.this, Linia37CeferistilorTur.class);
            startActivity(i);
        }
    });
    IntCeferistilor= (Button) findViewById(R.id.intceferistilorTur);
    IntCeferistilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Tur.this, Linia37IntCeferistilorTur.class);
            startActivity(i);
        }
    });
    Craiter= (Button) findViewById(R.id.craiterTur);
    Craiter.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia37Tur.this, Linia37CraiterTur.class);
            startActivity(i);
        }
    });
    }
}