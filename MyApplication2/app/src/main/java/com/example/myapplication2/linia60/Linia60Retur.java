package com.example.myapplication2.linia60;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia60Retur extends AppCompatActivity {
   Button Telecabina;
   Button PoianaBrasov;
   Button PoianaMica;
   Button SilverMountain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia60_retur);
    Telecabina= (Button) findViewById(R.id.telecabinaRetur);
    Telecabina.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia60Retur.this, Linia60TelecabinaRetur.class);
            startActivity(i);
        }
    });
    PoianaBrasov= (Button) findViewById(R.id.poianabrasovRetur);
    PoianaBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia60Retur.this, Linia60PoianaBrasovRetur.class);
            startActivity(i);
        }
    });
    PoianaMica= (Button) findViewById(R.id.poianamicaRetur);
    PoianaMica.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia60Retur.this, Linia60PoianaMicaRetur.class);
            startActivity(i);
        }
    });
    SilverMountain= (Button) findViewById(R.id.silvermountainRetur);
    SilverMountain.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia60Retur.this, Linia60SilverMountainRetur.class);
            startActivity(i);
        }
    });
    }
}