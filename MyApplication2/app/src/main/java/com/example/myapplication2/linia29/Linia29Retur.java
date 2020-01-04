package com.example.myapplication2.linia29;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia29Retur extends AppCompatActivity {
   Button GaraBrasov;
   Button BdGarii;
   Button Faget;
   Button SpitalTractorul;
   Button PiataTractorul;
   Button Decembrie1918;
   Button Huniade;
   Button EcTeodoroiu;
   Button Cosmesti;
   Button Zlatna;
   Button Posta;
   Button CamineIAR;
   Button BartolomeuNord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia29_retur);
    GaraBrasov= (Button) findViewById(R.id.garabrasovRetur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29GaraBrasovRetur.class);
            startActivity(i);
        }
    });
    BdGarii= (Button) findViewById(R.id.bdgariiRetur);
    BdGarii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29BdGariiRetur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetRetur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29FagetRetur.class);
            startActivity(i);
        }
    });
    SpitalTractorul= (Button) findViewById(R.id.spitaltractorulRetur);
    SpitalTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29SpitalTractorulRetur.class);
            startActivity(i);
        }
    });
    PiataTractorul= (Button) findViewById(R.id.piatatractorulRetur);
    PiataTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29PiataTractorulRetur.class);
            startActivity(i);
        }
    });
    Decembrie1918= (Button) findViewById(R.id.decembrie1918Retur);
    Decembrie1918.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29Decembrie1918Retur.class);
            startActivity(i);
        }
    });
    Huniade= (Button) findViewById(R.id.huniadeRetur);
    Huniade.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29HuniadeRetur.class);
            startActivity(i);
        }
    });
    EcTeodoroiu= (Button) findViewById(R.id.ecteodoroiuRetur);
    EcTeodoroiu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29EcTeodoroiuRetur.class);
            startActivity(i);
        }
    });
    Cosmesti= (Button) findViewById(R.id.cosmestiRetur);
    Cosmesti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29CosmestiRetur.class);
            startActivity(i);
        }
    });
    Zlatna= (Button) findViewById(R.id.zlatnaRetur);
    Zlatna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29ZlatnaRetur.class);
            startActivity(i);
        }
    });
    Posta= (Button) findViewById(R.id.postaRetur);
    Posta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29PostaRetur.class);
            startActivity(i);
        }
    });
    CamineIAR= (Button) findViewById(R.id.camineiarRetur);
    CamineIAR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29CamineIARRetur.class);
            startActivity(i);
        }
    });
    BartolomeuNord= (Button) findViewById(R.id.bartolomeunordRetur);
    BartolomeuNord.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia29Retur.this, Linia29BartolomeuNordRetur.class);
            startActivity(i);
        }
    });
    }
}