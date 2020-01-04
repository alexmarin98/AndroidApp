package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Linia1TurRetur extends AppCompatActivity {

    Button Tur;
    Button Retur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia1_tur_retur);
        Tur = (Button) findViewById(R.id.tur);
        Retur = (Button) findViewById(R.id.retur);
        Tur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia1TurRetur.this, Linia1Tur.class);
                startActivity(i);
            }
        });
        Retur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia1TurRetur.this, Linia1Retur.class);
                startActivity(i);
            }
        });
    }
}