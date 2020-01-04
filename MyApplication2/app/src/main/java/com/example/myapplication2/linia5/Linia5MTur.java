package com.example.myapplication2.linia5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication2.R;

public class Linia5MTur extends AppCompatActivity {
    Button StadMunicipal;
    Button Service;
    Button Caramidariei;
    Button IoanC;
    Button FacMTI;
    Button Facultativa;
    Button Facultativa2;
    Button Avicola;
    Button Magurele;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia5_mtur);
        StadMunicipal = (Button) findViewById(R.id.stadion);
        Service = (Button) findViewById(R.id.service);
        Caramidariei = (Button) findViewById(R.id.caramidariei);
        IoanC = (Button) findViewById(R.id.ioan);
        FacMTI = (Button) findViewById(R.id.facultativaMti);
        Facultativa = (Button) findViewById(R.id.facultativa);
        Facultativa2 = (Button) findViewById(R.id.facultativa2);

        Avicola = (Button) findViewById(R.id.avicola);
        Magurele = (Button) findViewById(R.id.magurele);
        StadMunicipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MTur.this,Linia5MStadMunicipal.class);
                startActivity(i);
            }
        });
        Service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MTur.this,Linia5MServiceTur.class);
                startActivity(i);
            }
        });
        Caramidariei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MTur.this,Linia5MCaramidarieiTur.class);
                startActivity(i);
            }
        });
        IoanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MTur.this,Linia5MIoanClopotelTur.class);
                startActivity(i);
            }
        });
        FacMTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MTur.this,Linia5MFacultativaMti.class);
                startActivity(i);
            }
        });
        Facultativa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MTur.this,Linia5MFacultativaTur.class);
                startActivity(i);
            }
        });
        Facultativa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MTur.this,Linia5MFacultativa2Tur.class);
                startActivity(i);
            }
        });
        Avicola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MTur.this,Linia5MAvicolaTur.class);
                startActivity(i);
            }
        });
        Magurele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MTur.this,Linia5MMagurele.class);
                startActivity(i);
            }
        });
    }
}
