package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication2.linia1.Linia1TurRetur;
import com.example.myapplication2.linia10.Linia10TurRetur;
import com.example.myapplication2.linia14.Linia14TurRetur;
import com.example.myapplication2.linia15.Linia15TurRetur;
import com.example.myapplication2.linia16.Linia16TurRetur;
import com.example.myapplication2.linia17.Linia17TurRetur;
import com.example.myapplication2.linia17b.Linia17BTurRetur;
import com.example.myapplication2.linia18.Linia18TurRetur;
import com.example.myapplication2.linia19.Linia19TurRetur;
import com.example.myapplication2.linia2.Linia2TurRetur;
import com.example.myapplication2.linia20e.Linia20ETurRetur;
import com.example.myapplication2.linia21.Linia21TurRetur;
import com.example.myapplication2.linia22.Linia22TurRetur;
import com.example.myapplication2.linia23.Linia23TurRetur;
import com.example.myapplication2.linia23b.Linia23BTurRetur;
import com.example.myapplication2.linia24.Linia24TurRetur;
import com.example.myapplication2.linia25.Linia25TurRetur;
import com.example.myapplication2.linia28.Linia28TurRetur;
import com.example.myapplication2.linia29.Linia29TurRetur;
import com.example.myapplication2.linia3.Linia3TurRetur;
import com.example.myapplication2.linia31.Linia31TurRetur;
import com.example.myapplication2.linia32.Linia32TurRetur;
import com.example.myapplication2.linia33.Linia33TurRetur;
import com.example.myapplication2.linia34.Linia34TurRetur;
import com.example.myapplication2.linia34b.Linia34BTurRetur;
import com.example.myapplication2.linia35.Linia35TurRetur;
import com.example.myapplication2.linia36.Linia36TurRetur;
import com.example.myapplication2.linia37.Linia37TurRetur;
import com.example.myapplication2.linia4.Linia4TurRetur;
import com.example.myapplication2.linia40.Linia40TurRetur;
import com.example.myapplication2.linia41.Linia41TurRetur;
import com.example.myapplication2.linia5.Linia5MTurRetur;
import com.example.myapplication2.linia5.Linia5TurRetur;
import com.example.myapplication2.linia50.Linia50TurRetur;
import com.example.myapplication2.linia51.Linia51TurRetur;
import com.example.myapplication2.linia52.Linia52TurRetur;
import com.example.myapplication2.linia53.Linia53TurRetur;
import com.example.myapplication2.linia6.Linia6TurRetur;
import com.example.myapplication2.linia60.Linia60TurRetur;
import com.example.myapplication2.linia7.Linia7TurRetur;
import com.example.myapplication2.linia8.Linia8TurRetur;
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
    Button Linia22;
    Button Linia23;
    Button Linia23b;
    Button Linia24;
    Button Linia25;
    Button Linia28;
    Button Linia29;
    Button Linia31;
    Button Linia32;
    Button Linia34;
    Button Linia34b;
    Button Linia35;
    Button Linia40;
    Button Linia53;
    Button Linia14;
    Button Linia15;
    Button Linia17b;
    Button Linia19;
    Button Linia37;
    Button Linia41;
    Button Linia50;
    Button Linia51;
    Button Linia52;
    Button Linia60;
    Button Linia3;
    Button Linia7;
    Button Linia8;
    Button Linia10;
    Button Linia33;

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
        Linia22 = findViewById(R.id.l22);
        Linia23 = findViewById(R.id.l23);
        Linia23b = findViewById(R.id.l23b);
        Linia24 = findViewById(R.id.l24);
        Linia25 = findViewById(R.id.l25);
        Linia28 = findViewById(R.id.l28);
        Linia29 = findViewById(R.id.l29);
        Linia31 = findViewById(R.id.l31);
        Linia32 = findViewById(R.id.l32);
        Linia34 = findViewById(R.id.l34);
        Linia34b = findViewById(R.id.l34b);
        Linia35 = findViewById(R.id.l35);
        Linia40 = findViewById(R.id.l40);
        Linia53 = findViewById(R.id.l53);
        Linia14 = findViewById(R.id.l14);
        Linia15 = findViewById(R.id.l15);
        Linia17b = findViewById(R.id.l17b);
        Linia19 = findViewById(R.id.l19);
        Linia37 = findViewById(R.id.l37);
        Linia41 = findViewById(R.id.l41);
        Linia50 = findViewById(R.id.l50);
        Linia51 = findViewById(R.id.l51);
        Linia52 = findViewById(R.id.l52);
        Linia60 = findViewById(R.id.l60);
        Linia3 = findViewById(R.id.l3);
        Linia7 = findViewById(R.id.l7);
        Linia8 = findViewById(R.id.l8);
        Linia10 = findViewById(R.id.l10);
        Linia33 = findViewById(R.id.l33);

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
        Linia22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia22TurRetur.class);
                startActivity(i);
            }
        });
        Linia23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia23TurRetur.class);
                startActivity(i);
            }
        });
        Linia23b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia23BTurRetur.class);
                startActivity(i);
            }
        });
        Linia24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia24TurRetur.class);
                startActivity(i);
            }
        });
        Linia25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia25TurRetur.class);
                startActivity(i);
            }
        });
        Linia28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia28TurRetur.class);
                startActivity(i);
            }
        });
        Linia29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia29TurRetur.class);
                startActivity(i);
            }
        });
        Linia31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia31TurRetur.class);
                startActivity(i);
            }
        });
        Linia32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia32TurRetur.class);
                startActivity(i);
            }
        });
        Linia34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia34TurRetur.class);
                startActivity(i);
            }
        });
        Linia34b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia34BTurRetur.class);
                startActivity(i);
            }
        });
        Linia35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia35TurRetur.class);
                startActivity(i);
            }
        });
        Linia40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia40TurRetur.class);
                startActivity(i);
            }
        });
        Linia53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia53TurRetur.class);
                startActivity(i);
            }
        });
        Linia14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia14TurRetur.class);
                startActivity(i);
            }
        });
        Linia15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia15TurRetur.class);
                startActivity(i);
            }
        });
        Linia17b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia17BTurRetur.class);
                startActivity(i);
            }
        });
        Linia19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia19TurRetur.class);
                startActivity(i);
            }
        });
        Linia37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia37TurRetur.class);
                startActivity(i);
            }
        });
        Linia41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia41TurRetur.class);
                startActivity(i);
            }
        });
        Linia50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia50TurRetur.class);
                startActivity(i);
            }
        });
        Linia51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia51TurRetur.class);
                startActivity(i);
            }
        });
        Linia52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia52TurRetur.class);
                startActivity(i);
            }
        });
        Linia60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia60TurRetur.class);
                startActivity(i);
            }
        });
        Linia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia3TurRetur.class);
                startActivity(i);
            }
        });
        Linia7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia7TurRetur.class);
                startActivity(i);
            }
        });
        Linia8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia8TurRetur.class);
                startActivity(i);
            }
        });
        Linia10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia10TurRetur.class);
                startActivity(i);
            }
        });
        Linia33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainContent.this, Linia33TurRetur.class);
                startActivity(i);
            }
        });
    }
}