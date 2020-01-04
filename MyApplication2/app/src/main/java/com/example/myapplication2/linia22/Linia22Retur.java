package com.example.myapplication2.linia22;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia22Retur extends AppCompatActivity {
   Button Saturn;
   Button Cometei;
   Button Neptun;
   Button ComplexulMare;
   Button Gemenii;
   Button Scriitorilor;
   Button Toamnei;
   Button LiceulMesota;
   Button CameraDeComert;
   Button Sanitas;
   Button SpitalMarzescu;
   Button OperaBrasov;
   Button Morii;
   Button Autogara2;
   Button StadionulTineretului;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia22_retur);
    Saturn= (Button) findViewById(R.id.saturnRetur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22SaturnRetur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiRetur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22CometeiRetur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunRetur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22NeptunRetur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareRetur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22ComplexulMareRetur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiRetur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22GemeniiRetur.class);
            startActivity(i);
        }
    });
    Scriitorilor= (Button) findViewById(R.id.scriitorilorRetur);
    Scriitorilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22ScriitorilorRetur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiRetur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22ToamneiRetur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaRetur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22LiceulMesotaRetur.class);
            startActivity(i);
        }
    });
    CameraDeComert= (Button) findViewById(R.id.cameradecomertRetur);
    CameraDeComert.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22CameraDeComertRetur.class);
            startActivity(i);
        }
    });
    Sanitas= (Button) findViewById(R.id.sanitasRetur);
    Sanitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22SanitasRetur.class);
            startActivity(i);
        }
    });
    SpitalMarzescu= (Button) findViewById(R.id.spitalmarzescuRetur);
    SpitalMarzescu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22SpitalMarzescuRetur.class);
            startActivity(i);
        }
    });
    OperaBrasov= (Button) findViewById(R.id.operabrasovRetur);
    OperaBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22OperaBrasovRetur.class);
            startActivity(i);
        }
    });
    Morii= (Button) findViewById(R.id.moriiRetur);
    Morii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22MoriiRetur.class);
            startActivity(i);
        }
    });
    Autogara2= (Button) findViewById(R.id.autogara2Retur);
    Autogara2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22Autogara2Retur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiRetur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Retur.this, Linia22StadionulTineretuluiRetur.class);
            startActivity(i);
        }
    });
    }
}