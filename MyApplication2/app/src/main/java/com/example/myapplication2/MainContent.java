package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainContent extends AppCompatActivity {

    Button Linia1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_content);
        Linia1 = (Button) findViewById(R.id.l1);

        Linia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                //DialogFrag ciao = new DialogFrag();
                //ciao.show(getSupportFragmentManager(), "pln");// show(v.getContext(),"MyDP");
                Intent i = new Intent(MainContent.this,Linia1TurRetur.class);
                startActivity(i);
            }
        });
    }
}