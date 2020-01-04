package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication2.linia1.Linia1TurRetur;
import com.example.myapplication2.linia16.Linia16TurRetur;
import com.example.myapplication2.linia17.Linia17TurRetur;
import com.example.myapplication2.linia18.Linia18TurRetur;
import com.example.myapplication2.linia2.Linia2TurRetur;
import com.example.myapplication2.linia20e.Linia20ETurRetur;
import com.example.myapplication2.linia21.Linia21TurRetur;
import com.example.myapplication2.linia36.Linia36TurRetur;
import com.example.myapplication2.linia4.Linia4TurRetur;
import com.example.myapplication2.linia5.Linia5MTurRetur;
import com.example.myapplication2.linia5.Linia5TurRetur;
import com.example.myapplication2.linia6.Linia6TurRetur;
import com.example.myapplication2.linia9.Linia9TurRetur;

public class MainContent extends AppCompatActivity {

    Button Linia1;
    Button Linia2;
    Button Linia4;
    Button Linia5;
    Button Linia5M;
    Button Linia36;
    Button Linia6;
    Button Linia9;
    Button Linia16;
    Button Linia17;
    Button Linia18;
    Button Linia20e;
    Button Linia21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_content);
        Linia1 = findViewById(R.id.l1);
        Linia2 = findViewById(R.id.l2);
        Linia4 = findViewById(R.id.l4);
        Linia5 = findViewById(R.id.l5);
        Linia5M = findViewById(R.id.l5m);
        Linia36 = findViewById(R.id.l36);
        Linia6 = findViewById(R.id.l6);
        Linia9 = findViewById(R.id.l9);
        Linia16 = findViewById(R.id.l16);
        Linia17 = findViewById(R.id.l17);
        Linia18 = findViewById(R.id.l18);
        Linia20e = findViewById(R.id.l20e);
        Linia21 = findViewById(R.id.l21);

        Linia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia1TurRetur.class);
                startActivity(i);
            }
        });
        Linia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia2TurRetur.class);
                startActivity(i);
            }
        });
        Linia4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia4TurRetur.class);
                startActivity(i);
            }
        });
        Linia5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia5TurRetur.class);
                startActivity(i);
            }
        });
        Linia5M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia5MTurRetur.class);
                startActivity(i);
            }
        });
        Linia36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia36TurRetur.class);
                startActivity(i);
            }
        });
        Linia6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia6TurRetur.class);
                startActivity(i);
            }
        });
        Linia9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia9TurRetur.class);
                startActivity(i);
            }
        });
        Linia16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia16TurRetur.class);
                startActivity(i);
            }
        });
        Linia17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia17TurRetur.class);
                startActivity(i);
            }
        });
        Linia18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia18TurRetur.class);
                startActivity(i);
            }
        });
        Linia20e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia20ETurRetur.class);
                startActivity(i);
            }
        });
        Linia21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia21TurRetur.class);
                startActivity(i);
            }
        });
    }
}