package com.example.myapplication2.linia32;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia32Tur extends AppCompatActivity {
   Button GaraBrasov;
   Button Dacia;
   Button Infostar;
   Button LiceulMesota;
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
        setContentView(R.layout.activity_linia32_tur);
    GaraBrasov= (Button) findViewById(R.id.garabrasovTur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32GaraBrasovTur.class);
            startActivity(i);
        }
    });
    Dacia= (Button) findViewById(R.id.daciaTur);
    Dacia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32DaciaTur.class);
            startActivity(i);
        }
    });
    Infostar= (Button) findViewById(R.id.infostarTur);
    Infostar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32InfostarTur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaTur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32LiceulMesotaTur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaTur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32HidroATur.class);
            startActivity(i);
        }
    });
    HidroB= (Button) findViewById(R.id.hidrobTur);
    HidroB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32HidroBTur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanTur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32SpitalulJudeteanTur.class);
            startActivity(i);
        }
    });
    PiataDecebal= (Button) findViewById(R.id.piatadecebalTur);
    PiataDecebal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32PiataDecebalTur.class);
            startActivity(i);
        }
    });
    Carpatilor= (Button) findViewById(R.id.carpatilorTur);
    Carpatilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32CarpatilorTur.class);
            startActivity(i);
        }
    });
    Muncii= (Button) findViewById(R.id.munciiTur);
    Muncii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32MunciiTur.class);
            startActivity(i);
        }
    });
    ScGen20= (Button) findViewById(R.id.scgen20Tur);
    ScGen20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32ScGen20Tur.class);
            startActivity(i);
        }
    });
    ScGen25= (Button) findViewById(R.id.scgen25Tur);
    ScGen25.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32ScGen25Tur.class);
            startActivity(i);
        }
    });
    Fragilor= (Button) findViewById(R.id.fragilorTur);
    Fragilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32FragilorTur.class);
            startActivity(i);
        }
    });
    ValeaCetatii= (Button) findViewById(R.id.valeacetatiiTur);
    ValeaCetatii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia32Tur.this, Linia32ValeaCetatiiTur.class);
            startActivity(i);
        }
    });
    }
}