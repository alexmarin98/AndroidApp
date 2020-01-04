package com.example.myapplication2.linia20e;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia20ERetur extends AppCompatActivity {
   Button LivadaPostei;
   Button BellevueResidence;
   Button Warte;
   Button Facultativa;
   Button FacultativaII;
   Button PoianaMica;
   Button PoianaBrasov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia20e_retur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ERetur.this, Linia20ELivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    BellevueResidence= (Button) findViewById(R.id.bellevueresidenceRetur);
    BellevueResidence.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ERetur.this, Linia20EBellevueResidenceRetur.class);
            startActivity(i);
        }
    });
    Warte= (Button) findViewById(R.id.warteRetur);
    Warte.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ERetur.this, Linia20EWarteRetur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaRetur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ERetur.this, Linia20EFacultativaRetur.class);
            startActivity(i);
        }
    });
    FacultativaII= (Button) findViewById(R.id.facultativaiiRetur);
    FacultativaII.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ERetur.this, Linia20EFacultativaIIRetur.class);
            startActivity(i);
        }
    });
    PoianaMica= (Button) findViewById(R.id.poianamicaRetur);
    PoianaMica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ERetur.this, Linia20EPoianaMicaRetur.class);
            startActivity(i);
        }
    });
    PoianaBrasov= (Button) findViewById(R.id.poianabrasovRetur);
    PoianaBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ERetur.this, Linia20EPoianaBrasovRetur.class);
            startActivity(i);
        }
    });
    }
}