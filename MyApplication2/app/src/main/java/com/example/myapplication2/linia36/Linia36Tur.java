package com.example.myapplication2.linia36;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia36Tur extends AppCompatActivity {
   Button Independentei;
   Button Decembrie1918;
   Button PiataTractorul;
   Button BisericaTractorul;
   Button MirceaCelBatran;
   Button Onix;
   Button Sanitas;
   Button Primarie;
   Button LivadaPostei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia36_tur);
    Independentei= (Button) findViewById(R.id.independenteiTur);
    Independentei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Tur.this, Linia36IndependenteiTur.class);
            startActivity(i);
        }
    });
    Decembrie1918= (Button) findViewById(R.id.decembrie1918Tur);
    Decembrie1918.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Tur.this, Linia36Decembrie1918Tur.class);
            startActivity(i);
        }
    });
    PiataTractorul= (Button) findViewById(R.id.piatatractorulTur);
    PiataTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Tur.this, Linia36PiataTractorulTur.class);
            startActivity(i);
        }
    });
    BisericaTractorul= (Button) findViewById(R.id.bisericatractorulTur);
    BisericaTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Tur.this, Linia36BisericaTractorulTur.class);
            startActivity(i);
        }
    });
    MirceaCelBatran= (Button) findViewById(R.id.mirceacelbatranTur);
    MirceaCelBatran.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Tur.this, Linia36MirceaCelBatranTur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixTur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Tur.this, Linia36OnixTur.class);
            startActivity(i);
        }
    });
    Sanitas= (Button) findViewById(R.id.sanitasTur);
    Sanitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Tur.this, Linia36SanitasTur.class);
            startActivity(i);
        }
    });
    Primarie= (Button) findViewById(R.id.primarieTur);
    Primarie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Tur.this, Linia36PrimarieTur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Tur.this, Linia36LivadaPosteiTur.class);
            startActivity(i);
        }
    });
    }
}