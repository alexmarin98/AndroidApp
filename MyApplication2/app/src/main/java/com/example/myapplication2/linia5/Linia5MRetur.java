package com.example.myapplication2.linia5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication2.R;

public class Linia5MRetur extends AppCompatActivity {
    Button StadMunicipal;
    Button Caramidariei;
    Button Brintex;
    Button Depozite;
    Button Facultativa2;
    Button Facultativa;
    Button Magurele;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia5_mretur);
        StadMunicipal = (Button) findViewById(R.id.stadion);
        Caramidariei = (Button) findViewById(R.id.caramidariei);
        Brintex = (Button) findViewById(R.id.brintex);
        Facultativa2= (Button) findViewById(R.id.facultativa2);
        Facultativa = (Button) findViewById(R.id.facultativa);
        Depozite = (Button) findViewById(R.id.depozite);
        Magurele = (Button) findViewById(R.id.magurele);
        StadMunicipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MRetur.this,Linia5MStadMunicipal.class);
                startActivity(i);
            }
        });
        Facultativa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MRetur.this,Linia5MFacultativa2Retur.class);
                startActivity(i);
            }
        });

        Caramidariei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MRetur.this,Linia5MCaramidarieiRetur.class);
                startActivity(i);
            }
        });

        Brintex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MRetur.this,Linia5MBrintexRetur.class);
                startActivity(i);
            }
        });
        Facultativa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MRetur.this,Linia5MFacultativaRetur.class);
                startActivity(i);
            }
        });
        Depozite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MRetur.this,Linia5MDepoziteRetur.class);
                startActivity(i);
            }
        });
        Magurele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia5MRetur.this,Linia5MMagurele.class);
                startActivity(i);
            }
        });
    }
}
