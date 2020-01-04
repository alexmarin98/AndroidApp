package com.example.myapplication2.linia10;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia10Tur extends AppCompatActivity {
   Button Triaj;
   Button RATBrasov;
   Button Autogara3;
   Button Vlahuta;
   Button IUS;
   Button CEC;
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
        setContentView(R.layout.activity_linia10_tur);
    Triaj= (Button) findViewById(R.id.triajTur);
    Triaj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10TriajTur.class);
            startActivity(i);
        }
    });
    RATBrasov= (Button) findViewById(R.id.ratbrasovTur);
    RATBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10RATBrasovTur.class);
            startActivity(i);
        }
    });
    Autogara3= (Button) findViewById(R.id.autogara3Tur);
    Autogara3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10Autogara3Tur.class);
            startActivity(i);
        }
    });
    Vlahuta= (Button) findViewById(R.id.vlahutaTur);
    Vlahuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10VlahutaTur.class);
            startActivity(i);
        }
    });
    IUS= (Button) findViewById(R.id.iusTur);
    IUS.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10IUSTur.class);
            startActivity(i);
        }
    });
    CEC= (Button) findViewById(R.id.cecTur);
    CEC.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10CECTur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaTur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10LiceulMesotaTur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaTur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10HidroATur.class);
            startActivity(i);
        }
    });
    HidroB= (Button) findViewById(R.id.hidrobTur);
    HidroB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10HidroBTur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanTur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10SpitalulJudeteanTur.class);
            startActivity(i);
        }
    });
    PiataDecebal= (Button) findViewById(R.id.piatadecebalTur);
    PiataDecebal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10PiataDecebalTur.class);
            startActivity(i);
        }
    });
    Carpatilor= (Button) findViewById(R.id.carpatilorTur);
    Carpatilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10CarpatilorTur.class);
            startActivity(i);
        }
    });
    Muncii= (Button) findViewById(R.id.munciiTur);
    Muncii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10MunciiTur.class);
            startActivity(i);
        }
    });
    ScGen20= (Button) findViewById(R.id.scgen20Tur);
    ScGen20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10ScGen20Tur.class);
            startActivity(i);
        }
    });
    ScGen25= (Button) findViewById(R.id.scgen25Tur);
    ScGen25.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10ScGen25Tur.class);
            startActivity(i);
        }
    });
    Fragilor= (Button) findViewById(R.id.fragilorTur);
    Fragilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10FragilorTur.class);
            startActivity(i);
        }
    });
    ValeaCetatii= (Button) findViewById(R.id.valeacetatiiTur);
    ValeaCetatii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia10Tur.this, Linia10ValeaCetatiiTur.class);
            startActivity(i);
        }
    });
    }
}