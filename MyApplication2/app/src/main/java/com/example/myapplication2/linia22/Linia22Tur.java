package com.example.myapplication2.linia22;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia22Tur extends AppCompatActivity {
   Button StadionulTineretului;
   Button Autogara2;
   Button Morii;
   Button OperaBrasov;
   Button Rial;
   Button IuliuManiu;
   Button Patria;
   Button HidroA;
   Button Toamnei;
   Button Traian;
   Button Gemenii;
   Button ComplexulMare;
   Button Neptun;
   Button Cometei;
   Button Saturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia22_tur);
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiTur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22StadionulTineretuluiTur.class);
            startActivity(i);
        }
    });
    Autogara2= (Button) findViewById(R.id.autogara2Tur);
    Autogara2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22Autogara2Tur.class);
            startActivity(i);
        }
    });
    Morii= (Button) findViewById(R.id.moriiTur);
    Morii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22MoriiTur.class);
            startActivity(i);
        }
    });
    OperaBrasov= (Button) findViewById(R.id.operabrasovTur);
    OperaBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22OperaBrasovTur.class);
            startActivity(i);
        }
    });
    Rial= (Button) findViewById(R.id.rialTur);
    Rial.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22RialTur.class);
            startActivity(i);
        }
    });
    IuliuManiu= (Button) findViewById(R.id.iuliumaniuTur);
    IuliuManiu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22IuliuManiuTur.class);
            startActivity(i);
        }
    });
    Patria= (Button) findViewById(R.id.patriaTur);
    Patria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22PatriaTur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaTur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22HidroATur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiTur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22ToamneiTur.class);
            startActivity(i);
        }
    });
    Traian= (Button) findViewById(R.id.traianTur);
    Traian.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22TraianTur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiTur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22GemeniiTur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareTur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22ComplexulMareTur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunTur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22NeptunTur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiTur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22CometeiTur.class);
            startActivity(i);
        }
    });
    Saturn= (Button) findViewById(R.id.saturnTur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia22Tur.this, Linia22SaturnTur.class);
            startActivity(i);
        }
    });
    }
}