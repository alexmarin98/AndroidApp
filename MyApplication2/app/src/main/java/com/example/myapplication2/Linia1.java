package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Linia1 extends AppCompatActivity {

    Button LivadaPostei;
    DialogFrag ciao = new DialogFrag();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia1);

        LivadaPostei = (Button) findViewById(R.id.livadaPostei);
        LivadaPostei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();

                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");

                    Intent i = new Intent(Linia1.this, Linia1TurRetur.class);
                    startActivity(i);


            }

        });

    }
}
