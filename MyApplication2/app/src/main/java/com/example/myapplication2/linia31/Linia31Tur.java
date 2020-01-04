package com.example.myapplication2.linia31;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia31Tur extends AppCompatActivity {
   Button LivadaPostei;
   Button Dramatic;
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
        setContentView(R.layout.activity_linia31_tur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31LivadaPosteiTur.class);
            startActivity(i);
        }
    });
    Dramatic= (Button) findViewById(R.id.dramaticTur);
    Dramatic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31DramaticTur.class);
            startActivity(i);
        }
    });
    Patria= (Button) findViewById(R.id.patriaTur);
    Patria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31PatriaTur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaTur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31HidroATur.class);
            startActivity(i);
        }
    });
    HidroB= (Button) findViewById(R.id.hidrobTur);
    HidroB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31HidroBTur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanTur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31SpitalulJudeteanTur.class);
            startActivity(i);
        }
    });
    PiataDecebal= (Button) findViewById(R.id.piatadecebalTur);
    PiataDecebal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31PiataDecebalTur.class);
            startActivity(i);
        }
    });
    Carpatilor= (Button) findViewById(R.id.carpatilorTur);
    Carpatilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31CarpatilorTur.class);
            startActivity(i);
        }
    });
    Muncii= (Button) findViewById(R.id.munciiTur);
    Muncii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31MunciiTur.class);
            startActivity(i);
        }
    });
    ScGen20= (Button) findViewById(R.id.scgen20Tur);
    ScGen20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31ScGen20Tur.class);
            startActivity(i);
        }
    });
    ScGen25= (Button) findViewById(R.id.scgen25Tur);
    ScGen25.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31ScGen25Tur.class);
            startActivity(i);
        }
    });
    Fragilor= (Button) findViewById(R.id.fragilorTur);
    Fragilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31FragilorTur.class);
            startActivity(i);
        }
    });
    ValeaCetatii= (Button) findViewById(R.id.valeacetatiiTur);
    ValeaCetatii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia31Tur.this, Linia31ValeaCetatiiTur.class);
            startActivity(i);
        }
    });
    }
}