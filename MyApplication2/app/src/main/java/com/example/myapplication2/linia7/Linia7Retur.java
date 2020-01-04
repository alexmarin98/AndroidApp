package com.example.myapplication2.linia7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia7Retur extends AppCompatActivity {
   Button Rulmentul;
   Button NLabis;
   Button Coresi;
   Button LiceulTractorul;
   Button BisericaTractorul;
   Button MirceaCelBatran;
   Button Onix;
   Button Patria;
   Button HidroA;
   Button HidroB;
   Button SpitalulJudetean;
   Button PiataDecebal;
   Button Vulturului;
   Button Metrom;
   Button Poienelor;
   Button Roman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia7_retur);
    Rulmentul= (Button) findViewById(R.id.rulmentulRetur);
    Rulmentul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7RulmentulRetur.class);
            startActivity(i);
        }
    });
    NLabis= (Button) findViewById(R.id.nlabisRetur);
    NLabis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7NLabisRetur.class);
            startActivity(i);
        }
    });
    Coresi= (Button) findViewById(R.id.coresiRetur);
    Coresi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7CoresiRetur.class);
            startActivity(i);
        }
    });
    LiceulTractorul= (Button) findViewById(R.id.liceultractorulRetur);
    LiceulTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7LiceulTractorulRetur.class);
            startActivity(i);
        }
    });
    BisericaTractorul= (Button) findViewById(R.id.bisericatractorulRetur);
    BisericaTractorul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7BisericaTractorulRetur.class);
            startActivity(i);
        }
    });
    MirceaCelBatran= (Button) findViewById(R.id.mirceacelbatranRetur);
    MirceaCelBatran.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7MirceaCelBatranRetur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixRetur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7OnixRetur.class);
            startActivity(i);
        }
    });
    Patria= (Button) findViewById(R.id.patriaRetur);
    Patria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7PatriaRetur.class);
            startActivity(i);
        }
    });
    HidroA= (Button) findViewById(R.id.hidroaRetur);
    HidroA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7HidroARetur.class);
            startActivity(i);
        }
    });
    HidroB= (Button) findViewById(R.id.hidrobRetur);
    HidroB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7HidroBRetur.class);
            startActivity(i);
        }
    });
    SpitalulJudetean= (Button) findViewById(R.id.spitaluljudeteanRetur);
    SpitalulJudetean.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7SpitalulJudeteanRetur.class);
            startActivity(i);
        }
    });
    PiataDecebal= (Button) findViewById(R.id.piatadecebalRetur);
    PiataDecebal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7PiataDecebalRetur.class);
            startActivity(i);
        }
    });
    Vulturului= (Button) findViewById(R.id.vulturuluiRetur);
    Vulturului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7VulturuluiRetur.class);
            startActivity(i);
        }
    });
    Metrom= (Button) findViewById(R.id.metromRetur);
    Metrom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7MetromRetur.class);
            startActivity(i);
        }
    });
    Poienelor= (Button) findViewById(R.id.poienelorRetur);
    Poienelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7PoienelorRetur.class);
            startActivity(i);
        }
    });
    Roman= (Button) findViewById(R.id.romanRetur);
    Roman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia7Retur.this, Linia7RomanRetur.class);
            startActivity(i);
        }
    });
    }
}