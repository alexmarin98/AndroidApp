package com.example.myapplication2.linia31;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia31Retur extends AppCompatActivity {
   Button ValeaCetatii;
   Button Fragilor;
   Button ScGen20;
   Button Muncii;
   Button Carpatilor;
   Button PiataDecebal;
   Button SpitalulJudetean;
   Button Toamnei;
   Button LiceulMesota;
   Button CameraCeComert;
   Button Sanitas;
   Button Primarie;
   Button LivadaPostei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia31_retur);
    ValeaCetatii= (Button) findViewById(R.id.valeacetatiiRetur);
    ValeaCetatii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31ValeaCetatiiRetur.class);
            startActivity(i);
        }
    });
    Fragilor= (Button) findViewById(R.id.fragilorRetur);
    Fragilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31FragilorRetur.class);
            startActivity(i);
        }
    });
    ScGen20= (Button) findViewById(R.id.scgen20Retur);
    ScGen20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31ScGen20Retur.class);
            startActivity(i);
        }
    });
    Muncii= (Button) findViewById(R.id.munciiRetur);
    Muncii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31MunciiRetur.class);
            startActivity(i);
        }
    });
    Carpatilor= (Button) findViewById(R.id.carpatilorRetur);
    Carpatilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31CarpatilorRetur.class);
            startActivity(i);
        }
    });
    PiataDecebal= (Button) findViewById(R.id.piatadecebalRetur);
    PiataDecebal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31PiataDecebalRetur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanRetur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31SpitalulJudeteanRetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31ToamneiRetur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaRetur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31LiceulMesotaRetur.class);
            startActivity(i);
        }
    });
    CameraCeComert= (Button) findViewById(R.id.cameracecomertRetur);
    CameraCeComert.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31CameraCeComertRetur.class);
            startActivity(i);
        }
    });
    Sanitas= (Button) findViewById(R.id.sanitasRetur);
    Sanitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31SanitasRetur.class);
            startActivity(i);
        }
    });
    Primarie= (Button) findViewById(R.id.primarieRetur);
    Primarie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31PrimarieRetur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Retur.this, Linia31LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    }
}