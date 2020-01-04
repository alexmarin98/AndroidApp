package com.example.myapplication2.linia60;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia60Tur extends AppCompatActivity {
   Button SilverMountain;
   Button PoianaMica;
   Button PoianaBrasov;
   Button Telecabina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia60_tur);
    SilverMountain= (Button) findViewById(R.id.silvermountainTur);
    SilverMountain.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia60Tur.this, Linia60SilverMountainTur.class);
            startActivity(i);
        }
    });
    PoianaMica= (Button) findViewById(R.id.poianamicaTur);
    PoianaMica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia60Tur.this, Linia60PoianaMicaTur.class);
            startActivity(i);
        }
    });
    PoianaBrasov= (Button) findViewById(R.id.poianabrasovTur);
    PoianaBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia60Tur.this, Linia60PoianaBrasovTur.class);
            startActivity(i);
        }
    });
    Telecabina= (Button) findViewById(R.id.telecabinaTur);
    Telecabina.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia60Tur.this, Linia60TelecabinaTur.class);
            startActivity(i);
        }
    });
    }
}