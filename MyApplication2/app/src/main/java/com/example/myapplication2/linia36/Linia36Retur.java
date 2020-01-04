package com.example.myapplication2.linia36;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia36Retur extends AppCompatActivity {
   Button LivadaPostei;
   Button Dramatic;
   Button Castanilor;
   Button Onix;
   Button MirceaCelBatran;
   Button Faget;
   Button SpitalTractorul;
   Button PiataTractorul;
   Button Decembrie1918;
   Button Bronzului;
   Button Independentei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia36_retur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    Dramatic= (Button) findViewById(R.id.dramaticRetur);
    Dramatic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36DramaticRetur.class);
            startActivity(i);
        }
    });
    Castanilor= (Button) findViewById(R.id.castanilorRetur);
    Castanilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36CastanilorRetur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixRetur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36OnixRetur.class);
            startActivity(i);
        }
    });
    MirceaCelBatran= (Button) findViewById(R.id.mirceacelbatranRetur);
    MirceaCelBatran.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36MirceaCelBatranRetur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetRetur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36FagetRetur.class);
            startActivity(i);
        }
    });
    SpitalTractorul= (Button) findViewById(R.id.spitaltractorulRetur);
    SpitalTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36SpitalTractorulRetur.class);
            startActivity(i);
        }
    });
    PiataTractorul= (Button) findViewById(R.id.piatatractorulRetur);
    PiataTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36PiataTractorulRetur.class);
            startActivity(i);
        }
    });
    Decembrie1918= (Button) findViewById(R.id.decembrie1918Retur);
    Decembrie1918.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36Decembrie1918Retur.class);
            startActivity(i);
        }
    });
    Bronzului= (Button) findViewById(R.id.bronzuluiRetur);
    Bronzului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36BronzuluiRetur.class);
            startActivity(i);
        }
    });
    Independentei= (Button) findViewById(R.id.independenteiRetur);
    Independentei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia36Retur.this, Linia36IndependenteiRetur.class);
            startActivity(i);
        }
    });
    }
}