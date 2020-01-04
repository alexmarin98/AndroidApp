package com.example.myapplication2.linia10;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia10Retur extends AppCompatActivity {
   Button ValeaCetatii;
   Button Fragilor;
   Button ScGen20;
   Button Muncii;
   Button Carpatilor;
   Button PiataDecebal;
   Button Judetean;
   Button Toamnei;
   Button IUS;
   Button Vlahuta;
   Button Autogara3;
   Button RATBrasov;
   Button Triaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia10_retur);
    ValeaCetatii= (Button) findViewById(R.id.valeacetatiiRetur);
    ValeaCetatii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10ValeaCetatiiRetur.class);
            startActivity(i);
        }
    });
    Fragilor= (Button) findViewById(R.id.fragilorRetur);
    Fragilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10FragilorRetur.class);
            startActivity(i);
        }
    });
    ScGen20= (Button) findViewById(R.id.scgen20Retur);
    ScGen20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10ScGen20Retur.class);
            startActivity(i);
        }
    });
    Muncii= (Button) findViewById(R.id.munciiRetur);
    Muncii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10MunciiRetur.class);
            startActivity(i);
        }
    });
    Carpatilor= (Button) findViewById(R.id.carpatilorRetur);
    Carpatilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10CarpatilorRetur.class);
            startActivity(i);
        }
    });
    PiataDecebal= (Button) findViewById(R.id.piatadecebalRetur);
    PiataDecebal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10PiataDecebalRetur.class);
            startActivity(i);
        }
    });
    Judetean= (Button) findViewById(R.id.judeteanRetur);
    Judetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10JudeteanRetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10ToamneiRetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10ToamneiRetur.class);
            startActivity(i);
        }
    });
    IUS= (Button) findViewById(R.id.iusRetur);
    IUS.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10IUSRetur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaRetur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10VlahutaRetur.class);
            startActivity(i);
        }
    });
    Autogara3= (Button) findViewById(R.id.autogara3Retur);
    Autogara3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10Autogara3Retur.class);
            startActivity(i);
        }
    });
    RATBrasov= (Button) findViewById(R.id.ratbrasovRetur);
    RATBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10RATBrasovRetur.class);
            startActivity(i);
        }
    });
    Triaj= (Button) findViewById(R.id.triajRetur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Retur.this, Linia10TriajRetur.class);
            startActivity(i);
        }
    });
    }
}