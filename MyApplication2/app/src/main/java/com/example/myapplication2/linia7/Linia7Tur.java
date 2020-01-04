package com.example.myapplication2.linia7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia7Tur extends AppCompatActivity {
   Button Roman;
   Button Poienelor;
   Button Metrom;
   Button Vulturului;
   Button PiataDecebal;
   Button SpitalulJudetean;
   Button Toamnei;
   Button LiceulMesota;
   Button Onix;
   Button MirceaCelBatran;
   Button Faget;
   Button Tractorul;
   Button LiceulTractorul;
   Button Coresi;
   Button NLabis;
   Button Rulmentul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia7_tur);
    Roman= (Button) findViewById(R.id.romanTur);
    Roman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7RomanTur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorTur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7PoienelorTur.class);
            startActivity(i);
        }
    });
    Metrom= (Button) findViewById(R.id.metromTur);
    Metrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7MetromTur.class);
            startActivity(i);
        }
    });
    Vulturului= (Button) findViewById(R.id.vulturuluiTur);
    Vulturului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7VulturuluiTur.class);
            startActivity(i);
        }
    });
    PiataDecebal= (Button) findViewById(R.id.piatadecebalTur);
    PiataDecebal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7PiataDecebalTur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanTur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7SpitalulJudeteanTur.class);
            startActivity(i);
        }
    });
    Toamnei= (Button) findViewById(R.id.toamneiTur);
    Toamnei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7ToamneiTur.class);
            startActivity(i);
        }
    });
    LiceulMesota= (Button) findViewById(R.id.liceulmesotaTur);
    LiceulMesota.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7LiceulMesotaTur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixTur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7OnixTur.class);
            startActivity(i);
        }
    });
    MirceaCelBatran= (Button) findViewById(R.id.mirceacelbatranTur);
    MirceaCelBatran.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7MirceaCelBatranTur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetTur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7FagetTur.class);
            startActivity(i);
        }
    });
    Tractorul= (Button) findViewById(R.id.tractorulTur);
    Tractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7TractorulTur.class);
            startActivity(i);
        }
    });
    LiceulTractorul= (Button) findViewById(R.id.liceultractorulTur);
    LiceulTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7LiceulTractorulTur.class);
            startActivity(i);
        }
    });
    Coresi= (Button) findViewById(R.id.coresiTur);
    Coresi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7CoresiTur.class);
            startActivity(i);
        }
    });
    NLabis= (Button) findViewById(R.id.nlabisTur);
    NLabis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7NLabisTur.class);
            startActivity(i);
        }
    });
    Rulmentul= (Button) findViewById(R.id.rulmentulTur);
    Rulmentul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Tur.this, Linia7RulmentulTur.class);
            startActivity(i);
        }
    });
    }
}