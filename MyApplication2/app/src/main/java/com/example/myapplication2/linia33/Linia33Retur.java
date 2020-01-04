package com.example.myapplication2.linia33;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia33Retur extends AppCompatActivity {
   Button ValeaCetatii;
   Button Fragilor;
   Button ScGen20;
   Button ScGen4;
   Button Biserica;
   Button Vulturului;
   Button Metrom;
   Button Poienelor;
   Button Roman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia33_retur);
    ValeaCetatii= (Button) findViewById(R.id.valeacetatiiRetur);
    ValeaCetatii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Retur.this, Linia33ValeaCetatiiRetur.class);
            startActivity(i);
        }
    });
    Fragilor= (Button) findViewById(R.id.fragilorRetur);
    Fragilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Retur.this, Linia33FragilorRetur.class);
            startActivity(i);
        }
    });
    ScGen20= (Button) findViewById(R.id.scgen20Retur);
    ScGen20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Retur.this, Linia33ScGen20Retur.class);
            startActivity(i);
        }
    });
    ScGen4= (Button) findViewById(R.id.scgen4Retur);
    ScGen4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Retur.this, Linia33ScGen4Retur.class);
            startActivity(i);
        }
    });
    Biserica= (Button) findViewById(R.id.bisericaRetur);
    Biserica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Retur.this, Linia33BisericaRetur.class);
            startActivity(i);
        }
    });
    Vulturului= (Button) findViewById(R.id.vulturuluiRetur);
    Vulturului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Retur.this, Linia33VulturuluiRetur.class);
            startActivity(i);
        }
    });
    Metrom= (Button) findViewById(R.id.metromRetur);
    Metrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Retur.this, Linia33MetromRetur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorRetur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Retur.this, Linia33PoienelorRetur.class);
            startActivity(i);
        }
    });
    Roman= (Button) findViewById(R.id.romanRetur);
    Roman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Retur.this, Linia33RomanRetur.class);
            startActivity(i);
        }
    });
    }
}