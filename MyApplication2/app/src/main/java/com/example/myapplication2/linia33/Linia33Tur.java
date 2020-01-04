package com.example.myapplication2.linia33;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia33Tur extends AppCompatActivity {
   Button Roman;
   Button Poienelor;
   Button Metrom;
   Button Vulturului;
   Button ScGen4;
   Button Muncii;
   Button ScGen20;
   Button ScGen25;
   Button Fragilor;
   Button ValeaCetatii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia33_tur);
    Roman= (Button) findViewById(R.id.romanTur);
    Roman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Tur.this, Linia33RomanTur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorTur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Tur.this, Linia33PoienelorTur.class);
            startActivity(i);
        }
    });
    Metrom= (Button) findViewById(R.id.metromTur);
    Metrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Tur.this, Linia33MetromTur.class);
            startActivity(i);
        }
    });
    Vulturului= (Button) findViewById(R.id.vulturuluiTur);
    Vulturului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Tur.this, Linia33VulturuluiTur.class);
            startActivity(i);
        }
    });
    ScGen4= (Button) findViewById(R.id.scgen4Tur);
    ScGen4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Tur.this, Linia33ScGen4Tur.class);
            startActivity(i);
        }
    });
    Muncii= (Button) findViewById(R.id.munciiTur);
    Muncii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Tur.this, Linia33MunciiTur.class);
            startActivity(i);
        }
    });
    ScGen20= (Button) findViewById(R.id.scgen20Tur);
    ScGen20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Tur.this, Linia33ScGen20Tur.class);
            startActivity(i);
        }
    });
    ScGen25= (Button) findViewById(R.id.scgen25Tur);
    ScGen25.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Tur.this, Linia33ScGen25Tur.class);
            startActivity(i);
        }
    });
    Fragilor= (Button) findViewById(R.id.fragilorTur);
    Fragilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Tur.this, Linia33FragilorTur.class);
            startActivity(i);
        }
    });
    ValeaCetatii= (Button) findViewById(R.id.valeacetatiiTur);
    ValeaCetatii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia33Tur.this, Linia33ValeaCetatiiTur.class);
            startActivity(i);
        }
    });
    }
}