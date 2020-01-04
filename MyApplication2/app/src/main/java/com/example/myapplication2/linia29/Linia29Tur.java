package com.example.myapplication2.linia29;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia29Tur extends AppCompatActivity {
   Button BartolomeuNord;
   Button CamineIAR;
   Button Posta;
   Button Zlatna;
   Button Cosmesti;
   Button EcTeodoroiu;
   Button Huniade;
   Button Decembrie1918;
   Button PiataTractorul;
   Button BisericaTractorul;
   Button Faget;
   Button GaraBrasov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia29_tur);
    BartolomeuNord= (Button) findViewById(R.id.bartolomeunordTur);
    BartolomeuNord.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29BartolomeuNordTur.class);
            startActivity(i);
        }
    });
    CamineIAR= (Button) findViewById(R.id.camineiarTur);
    CamineIAR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29CamineIARTur.class);
            startActivity(i);
        }
    });
    Posta= (Button) findViewById(R.id.postaTur);
    Posta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29PostaTur.class);
            startActivity(i);
        }
    });
    Zlatna= (Button) findViewById(R.id.zlatnaTur);
    Zlatna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29ZlatnaTur.class);
            startActivity(i);
        }
    });
    Cosmesti= (Button) findViewById(R.id.cosmestiTur);
    Cosmesti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29CosmestiTur.class);
            startActivity(i);
        }
    });
    EcTeodoroiu= (Button) findViewById(R.id.ecteodoroiuTur);
    EcTeodoroiu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29EcTeodoroiuTur.class);
            startActivity(i);
        }
    });
    Huniade= (Button) findViewById(R.id.huniadeTur);
    Huniade.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29HuniadeTur.class);
            startActivity(i);
        }
    });
    Decembrie1918= (Button) findViewById(R.id.decembrie1918Tur);
    Decembrie1918.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29Decembrie1918Tur.class);
            startActivity(i);
        }
    });
    PiataTractorul= (Button) findViewById(R.id.piatatractorulTur);
    PiataTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29PiataTractorulTur.class);
            startActivity(i);
        }
    });
    BisericaTractorul= (Button) findViewById(R.id.bisericatractorulTur);
    BisericaTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29BisericaTractorulTur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetTur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29FagetTur.class);
            startActivity(i);
        }
    });
    GaraBrasov= (Button) findViewById(R.id.garabrasovTur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Tur.this, Linia29GaraBrasovTur.class);
            startActivity(i);
        }
    });
    }
}