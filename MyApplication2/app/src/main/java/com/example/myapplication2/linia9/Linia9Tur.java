package com.example.myapplication2.linia9;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia9Tur extends AppCompatActivity {
   Button Rulmentul;
   Button NLabis;
   Button AuchanCoresi;
   Button CineplexCoresi;
   Button Coresi;
   Button LiceulTractorul;
   Button SpitalTractorul;
   Button PiataTractorul;
   Button Decembrie1918;
   Button Huniade;
   Button EcTeodoroiu;
   Button BartolomeuGara;
   Button StadionulMunicipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia9_tur);
    Rulmentul= (Button) findViewById(R.id.rulmentulTur);
    Rulmentul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9RulmentulTur.class);
            startActivity(i);
        }
    });
    NLabis= (Button) findViewById(R.id.nlabisTur);
    NLabis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9NLabisTur.class);
            startActivity(i);
        }
    });
    AuchanCoresi= (Button) findViewById(R.id.auchancoresiTur);
    AuchanCoresi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9AuchanCoresiTur.class);
            startActivity(i);
        }
    });
    CineplexCoresi= (Button) findViewById(R.id.cineplexcoresiTur);
    CineplexCoresi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9CineplexCoresiTur.class);
            startActivity(i);
        }
    });
    Coresi= (Button) findViewById(R.id.coresiTur);
    Coresi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9CoresiTur.class);
            startActivity(i);
        }
    });
    LiceulTractorul= (Button) findViewById(R.id.liceultractorulTur);
    LiceulTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9LiceulTractorulTur.class);
            startActivity(i);
        }
    });
    SpitalTractorul= (Button) findViewById(R.id.spitaltractorulTur);
    SpitalTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9SpitalTractorulTur.class);
            startActivity(i);
        }
    });
    PiataTractorul= (Button) findViewById(R.id.piatatractorulTur);
    PiataTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9PiataTractorulTur.class);
            startActivity(i);
        }
    });
    Decembrie1918= (Button) findViewById(R.id.decembrie1918Tur);
    Decembrie1918.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9Decembrie1918Tur.class);
            startActivity(i);
        }
    });
    Huniade= (Button) findViewById(R.id.huniadeTur);
    Huniade.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9HuniadeTur.class);
            startActivity(i);
        }
    });
    EcTeodoroiu= (Button) findViewById(R.id.ecteodoroiuTur);
    EcTeodoroiu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9EcTeodoroiuTur.class);
            startActivity(i);
        }
    });
    BartolomeuGara= (Button) findViewById(R.id.bartolomeugaraTur);
    BartolomeuGara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9BartolomeuGaraTur.class);
            startActivity(i);
        }
    });
    StadionulMunicipal= (Button) findViewById(R.id.stadionulmunicipalTur);
    StadionulMunicipal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia9Tur.this, Linia9StadionulMunicipalTur.class);
            startActivity(i);
        }
    });
    }
}