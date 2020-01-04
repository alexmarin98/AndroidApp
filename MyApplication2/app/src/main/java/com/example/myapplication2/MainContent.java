package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainContent extends AppCompatActivity {

    Button Linia1;
    Button Linia2;
    Button Linia4;
    Button Linia5;
    Button Linia5M;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_content);
        Linia1 = (Button) findViewById(R.id.l1);
        Linia2 = (Button) findViewById(R.id.l2);
        Linia4 = (Button) findViewById(R.id.l4);
        Linia5 = (Button) findViewById(R.id.l5);
        Linia5M = (Button) findViewById(R.id.l5m);

        Linia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(MainContent.this, Linia1TurRetur.class);
                startActivity(i);
            }
        });
        Linia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(MainContent.this,Linia2TurRetur.class);
                startActivity(i);
            }
        });
        Linia4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(MainContent.this,Linia4TurRetur.class);
                startActivity(i);
            }
        });
        Linia5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(MainContent.this,Linia5TurRetur.class);
                startActivity(i);
            }
        });
        Linia5M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(MainContent.this,Linia5MTurRetur.class);
                startActivity(i);
            }
        });
    }
}