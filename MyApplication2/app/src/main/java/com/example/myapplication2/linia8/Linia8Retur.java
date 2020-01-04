package com.example.myapplication2.linia8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia8Retur extends AppCompatActivity {
   Button Saturn;
   Button Cometei;
   Button Neptun;
   Button ComplexulMare;
   Button Gemenii;
   Button PanaitCerna;
   Button Branduselor;
   Button SalaSporturilor;
   Button BdGarii;
   Button Faget;
   Button Tractorul;
   Button LiceulTractorul;
   Button Coresi;
   Button NLabis;
   Button Rulmentul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia8_retur);
    Saturn= (Button) findViewById(R.id.saturnRetur);
    Saturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8SaturnRetur.class);
            startActivity(i);
        }
    });
    Cometei= (Button) findViewById(R.id.cometeiRetur);
    Cometei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8CometeiRetur.class);
            startActivity(i);
        }
    });
    Neptun= (Button) findViewById(R.id.neptunRetur);
    Neptun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8NeptunRetur.class);
            startActivity(i);
        }
    });
    ComplexulMare= (Button) findViewById(R.id.complexulmareRetur);
    ComplexulMare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8ComplexulMareRetur.class);
            startActivity(i);
        }
    });
    Gemenii= (Button) findViewById(R.id.gemeniiRetur);
    Gemenii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8GemeniiRetur.class);
            startActivity(i);
        }
    });
    PanaitCerna= (Button) findViewById(R.id.panaitcernaRetur);
    PanaitCerna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8PanaitCernaRetur.class);
            startActivity(i);
        }
    });
    Branduselor= (Button) findViewById(R.id.branduselorRetur);
    Branduselor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8BranduselorRetur.class);
            startActivity(i);
        }
    });
    SalaSporturilor= (Button) findViewById(R.id.salasporturilorRetur);
    SalaSporturilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8SalaSporturilorRetur.class);
            startActivity(i);
        }
    });
    BdGarii= (Button) findViewById(R.id.bdgariiRetur);
    BdGarii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8BdGariiRetur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetRetur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8FagetRetur.class);
            startActivity(i);
        }
    });
    Tractorul= (Button) findViewById(R.id.tractorulRetur);
    Tractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8TractorulRetur.class);
            startActivity(i);
        }
    });
    LiceulTractorul= (Button) findViewById(R.id.liceultractorulRetur);
    LiceulTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8LiceulTractorulRetur.class);
            startActivity(i);
        }
    });
    Coresi= (Button) findViewById(R.id.coresiRetur);
    Coresi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8CoresiRetur.class);
            startActivity(i);
        }
    });
    NLabis= (Button) findViewById(R.id.nlabisRetur);
    NLabis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8NLabisRetur.class);
            startActivity(i);
        }
    });
    Rulmentul= (Button) findViewById(R.id.rulmentulRetur);
    Rulmentul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia8Retur.this, Linia8RulmentulRetur.class);
            startActivity(i);
        }
    });
    }
}