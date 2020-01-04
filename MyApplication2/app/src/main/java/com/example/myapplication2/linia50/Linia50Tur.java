package com.example.myapplication2.linia50;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia50Tur extends AppCompatActivity {
   Button Solomon;
   Button FacultativaII;
   Button LaMoara;
   Button PodulCretului;
   Button Invatatorilor;
   Button Junilor;
   Button Tocile;
   Button PiataUnirii;
   Button LiceulSaguna;
   Button Balcescu;
   Button Star;
   Button Castanilor;
   Button Sanitas;
   Button Primarie;
   Button LivadaPostei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia50_tur);
    Solomon= (Button) findViewById(R.id.solomonTur);
    Solomon.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50SolomonTur.class);
            startActivity(i);
        }
    });
    FacultativaII= (Button) findViewById(R.id.facultativaiiTur);
    FacultativaII.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50FacultativaIITur.class);
            startActivity(i);
        }
    });
    LaMoara= (Button) findViewById(R.id.lamoaraTur);
    LaMoara.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50LaMoaraTur.class);
            startActivity(i);
        }
    });
    PodulCretului= (Button) findViewById(R.id.podulcretuluiTur);
    PodulCretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50PodulCretuluiTur.class);
            startActivity(i);
        }
    });
    PodulCretului= (Button) findViewById(R.id.podulcretuluiTur);
    PodulCretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50PodulCretuluiTur.class);
            startActivity(i);
        }
    });
    Invatatorilor= (Button) findViewById(R.id.invatatorilorTur);
    Invatatorilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50InvatatorilorTur.class);
            startActivity(i);
        }
    });
    Junilor= (Button) findViewById(R.id.junilorTur);
    Junilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50JunilorTur.class);
            startActivity(i);
        }
    });
    Tocile= (Button) findViewById(R.id.tocileTur);
    Tocile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50TocileTur.class);
            startActivity(i);
        }
    });
    PiataUnirii= (Button) findViewById(R.id.piatauniriiTur);
    PiataUnirii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50PiataUniriiTur.class);
            startActivity(i);
        }
    });
    LiceulSaguna= (Button) findViewById(R.id.liceulsagunaTur);
    LiceulSaguna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50LiceulSagunaTur.class);
            startActivity(i);
        }
    });
    Balcescu= (Button) findViewById(R.id.balcescuTur);
    Balcescu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50BalcescuTur.class);
            startActivity(i);
        }
    });
    Star= (Button) findViewById(R.id.starTur);
    Star.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50StarTur.class);
            startActivity(i);
        }
    });
    Castanilor= (Button) findViewById(R.id.castanilorTur);
    Castanilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50CastanilorTur.class);
            startActivity(i);
        }
    });
    Sanitas= (Button) findViewById(R.id.sanitasTur);
    Sanitas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50SanitasTur.class);
            startActivity(i);
        }
    });
    Primarie= (Button) findViewById(R.id.primarieTur);
    Primarie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50PrimarieTur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia50Tur.this, Linia50LivadaPosteiTur.class);
            startActivity(i);
        }
    });
    }
}