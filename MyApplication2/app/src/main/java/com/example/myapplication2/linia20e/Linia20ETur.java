package com.example.myapplication2.linia20e;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia20ETur extends AppCompatActivity {
   Button PoianaBrasov;
   Button PoianaMica;
   Button FacultativaII;
   Button Facultativa;
   Button Warte;
   Button BellevueResidence;
   Button LivadaPostei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia20e_tur);
    PoianaBrasov= (Button) findViewById(R.id.poianabrasovTur);
    PoianaBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ETur.this, Linia20EPoianaBrasovTur.class);
            startActivity(i);
        }
    });
    PoianaMica= (Button) findViewById(R.id.poianamicaTur);
    PoianaMica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ETur.this, Linia20EPoianaMicaTur.class);
            startActivity(i);
        }
    });
    FacultativaII= (Button) findViewById(R.id.facultativaiiTur);
    FacultativaII.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ETur.this, Linia20EFacultativaIITur.class);
            startActivity(i);
        }
    });
    Facultativa= (Button) findViewById(R.id.facultativaTur);
    Facultativa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ETur.this, Linia20EFacultativaTur.class);
            startActivity(i);
        }
    });
    Warte= (Button) findViewById(R.id.warteTur);
    Warte.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ETur.this, Linia20EWarteTur.class);
            startActivity(i);
        }
    });
    BellevueResidence= (Button) findViewById(R.id.bellevueresidenceTur);
    BellevueResidence.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ETur.this, Linia20EBellevueResidenceTur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia20ETur.this, Linia20ELivadaPosteiTur.class);
            startActivity(i);
        }
    });
    }
}