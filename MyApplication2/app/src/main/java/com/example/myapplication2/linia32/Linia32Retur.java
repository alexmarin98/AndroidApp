package com.example.myapplication2.linia32;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia32Retur extends AppCompatActivity {
   Button ValeaCetatii;
   Button Fragilor;
   Button ScGen20;
   Button Muncii;
   Button Carpatilor;
   Button PiataDecebal;
   Button SpitalulJudetean;
   Button Toamnei;
   Button Infostar;
   Button Rapid;
   Button GaraBrasov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia32_retur);
    ValeaCetatii= (Button) findViewById(R.id.valeacetatiiRetur);
    ValeaCetatii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32ValeaCetatiiRetur.class);
            startActivity(i);
        }
    });
    Fragilor= (Button) findViewById(R.id.fragilorRetur);
    Fragilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32FragilorRetur.class);
            startActivity(i);
        }
    });
    ScGen20= (Button) findViewById(R.id.scgen20Retur);
    ScGen20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32ScGen20Retur.class);
            startActivity(i);
        }
    });
    Muncii= (Button) findViewById(R.id.munciiRetur);
    Muncii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32MunciiRetur.class);
            startActivity(i);
        }
    });
    Carpatilor= (Button) findViewById(R.id.carpatilorRetur);
    Carpatilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32CarpatilorRetur.class);
            startActivity(i);
        }
    });
    PiataDecebal= (Button) findViewById(R.id.piatadecebalRetur);
    PiataDecebal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32PiataDecebalRetur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanRetur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32SpitalulJudeteanRetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32ToamneiRetur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarRetur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32InfostarRetur.class);
            startActivity(i);
        }
    });
    Rapid= (Button) findViewById(R.id.rapidRetur);
    Rapid.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32RapidRetur.class);
            startActivity(i);
        }
    });
    GaraBrasov= (Button) findViewById(R.id.garabrasovRetur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Retur.this, Linia32GaraBrasovRetur.class);
            startActivity(i);
        }
    });
    }
}