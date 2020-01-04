package com.example.myapplication2.linia3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia3Retur extends AppCompatActivity {
   Button ValeaCetatii;
   Button Fragilor;
   Button ScGen20;
   Button Muncii;
   Button Carpatilor;
   Button PiataDecebal;
   Button SpitalulJudetean;
   Button Toamnei;
   Button LiceulMesota;
   Button Onix;
   Button Universitate;
   Button Plevnei;
   Button TudorVladimirescu;
   Button StadionulTineretului;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia3_retur);
    ValeaCetatii= (Button) findViewById(R.id.valeacetatiiRetur);
    ValeaCetatii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3ValeaCetatiiRetur.class);
            startActivity(i);
        }
    });
    Fragilor= (Button) findViewById(R.id.fragilorRetur);
    Fragilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3FragilorRetur.class);
            startActivity(i);
        }
    });
    ScGen20= (Button) findViewById(R.id.scgen20Retur);
    ScGen20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3ScGen20Retur.class);
            startActivity(i);
        }
    });
    Muncii= (Button) findViewById(R.id.munciiRetur);
    Muncii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3MunciiRetur.class);
            startActivity(i);
        }
    });
    Carpatilor= (Button) findViewById(R.id.carpatilorRetur);
    Carpatilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3CarpatilorRetur.class);
            startActivity(i);
        }
    });
    PiataDecebal= (Button) findViewById(R.id.piatadecebalRetur);
    PiataDecebal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3PiataDecebalRetur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanRetur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3SpitalulJudeteanRetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3ToamneiRetur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaRetur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3LiceulMesotaRetur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixRetur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3OnixRetur.class);
            startActivity(i);
        }
    });
    Universitate= (Button) findViewById(R.id.universitateRetur);
    Universitate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3UniversitateRetur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiRetur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3PlevneiRetur.class);
            startActivity(i);
        }
    });
    TudorVladimirescu= (Button) findViewById(R.id.tudorvladimirescuRetur);
    TudorVladimirescu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3TudorVladimirescuRetur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiRetur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Retur.this, Linia3StadionulTineretuluiRetur.class);
            startActivity(i);
        }
    });
    }
}