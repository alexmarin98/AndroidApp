package com.example.myapplication2.linia9;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia9Retur extends AppCompatActivity {
   Button StadionulMunicipal;
   Button ComplexBartolomeu;
   Button EcTeodoroiu;
   Button Huniade;
   Button Decembrie1918;
   Button PiataTractorul;
   Button Tractorul;
   Button LiceulTractorul;
   Button Coresi;
   Button NLabis;
   Button Rulmentul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia9_retur);
    StadionulMunicipal= (Button) findViewById(R.id.stadionulmunicipalRetur);
    StadionulMunicipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9StadionulMunicipalRetur.class);
            startActivity(i);
        }
    });
    ComplexBartolomeu= (Button) findViewById(R.id.complexbartolomeuRetur);
    ComplexBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9ComplexBartolomeuRetur.class);
            startActivity(i);
        }
    });
    EcTeodoroiu= (Button) findViewById(R.id.ecteodoroiuRetur);
    EcTeodoroiu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9EcTeodoroiuRetur.class);
            startActivity(i);
        }
    });
    Huniade= (Button) findViewById(R.id.huniadeRetur);
    Huniade.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9HuniadeRetur.class);
            startActivity(i);
        }
    });
    Decembrie1918= (Button) findViewById(R.id.decembrie1918Retur);
    Decembrie1918.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9Decembrie1918Retur.class);
            startActivity(i);
        }
    });
    PiataTractorul= (Button) findViewById(R.id.piatatractorulRetur);
    PiataTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9PiataTractorulRetur.class);
            startActivity(i);
        }
    });
    Tractorul= (Button) findViewById(R.id.tractorulRetur);
    Tractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9TractorulRetur.class);
            startActivity(i);
        }
    });
    LiceulTractorul= (Button) findViewById(R.id.liceultractorulRetur);
    LiceulTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9LiceulTractorulRetur.class);
            startActivity(i);
        }
    });
    Coresi= (Button) findViewById(R.id.coresiRetur);
    Coresi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9CoresiRetur.class);
            startActivity(i);
        }
    });
    NLabis= (Button) findViewById(R.id.nlabisRetur);
    NLabis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9NLabisRetur.class);
            startActivity(i);
        }
    });
    Rulmentul= (Button) findViewById(R.id.rulmentulRetur);
    Rulmentul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Retur.this, Linia9RulmentulRetur.class);
            startActivity(i);
        }
    });
    }
}