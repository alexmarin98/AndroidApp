package com.example.myapplication2.linia3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia3Tur extends AppCompatActivity {
   Button StadionulTineretului;
   Button Fartec;
   Button AcademiaHenriCoanda;
   Button Plevnei;
   Button Universitate;
   Button Onix;
   Button Patria;
   Button HidroA;
   Button HidroB;
   Button SpitalulJudetean;
   Button PiataDecebal;
   Button Carpatilor;
   Button Muncii;
   Button ScGen20;
   Button ScGen25;
   Button Fragilor;
   Button ValeaCetatii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia3_tur);
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiTur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3StadionulTineretuluiTur.class);
            startActivity(i);
        }
    });
    Fartec= (Button) findViewById(R.id.fartecTur);
    Fartec.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3FartecTur.class);
            startActivity(i);
        }
    });
    AcademiaHenriCoanda= (Button) findViewById(R.id.academiahenricoandaTur);
    AcademiaHenriCoanda.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3AcademiaHenriCoandaTur.class);
            startActivity(i);
        }
    });
    Plevnei= (Button) findViewById(R.id.plevneiTur);
    Plevnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3PlevneiTur.class);
            startActivity(i);
        }
    });
    Universitate= (Button) findViewById(R.id.universitateTur);
    Universitate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3UniversitateTur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixTur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3OnixTur.class);
            startActivity(i);
        }
    });
    Patria= (Button) findViewById(R.id.patriaTur);
    Patria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3PatriaTur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaTur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3HidroATur.class);
            startActivity(i);
        }
    });
    HidroB= (Button) findViewById(R.id.hidrobTur);
    HidroB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3HidroBTur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanTur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3SpitalulJudeteanTur.class);
            startActivity(i);
        }
    });
    PiataDecebal= (Button) findViewById(R.id.piatadecebalTur);
    PiataDecebal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3PiataDecebalTur.class);
            startActivity(i);
        }
    });
    Carpatilor= (Button) findViewById(R.id.carpatilorTur);
    Carpatilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3CarpatilorTur.class);
            startActivity(i);
        }
    });
    Muncii= (Button) findViewById(R.id.munciiTur);
    Muncii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3MunciiTur.class);
            startActivity(i);
        }
    });
    ScGen20= (Button) findViewById(R.id.scgen20Tur);
    ScGen20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3ScGen20Tur.class);
            startActivity(i);
        }
    });
    ScGen25= (Button) findViewById(R.id.scgen25Tur);
    ScGen25.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3ScGen25Tur.class);
            startActivity(i);
        }
    });
    Fragilor= (Button) findViewById(R.id.fragilorTur);
    Fragilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3FragilorTur.class);
            startActivity(i);
        }
    });
    ValeaCetatii= (Button) findViewById(R.id.valeacetatiiTur);
    ValeaCetatii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia3Tur.this, Linia3ValeaCetatiiTur.class);
            startActivity(i);
        }
    });
    }
}