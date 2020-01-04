package com.example.myapplication2.linia2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication2.R;

public class Linia2Retur extends AppCompatActivity {

    Button LivadaPostei;
    Button Dramatic;
    Button Castanilor;
    Button Onix;
    Button MirceaCelBatran;
    Button Faget;
    Button LiceulTractorul;
    Button Tractorul;
    Button Coresi;
    Button NicolaeLabis;
    Button Rulmentul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia2_retur);
        LivadaPostei = (Button) findViewById(R.id.livada);
        Dramatic = (Button) findViewById(R.id.dramatic);
        Castanilor = (Button) findViewById(R.id.castanilor);
        Onix = (Button) findViewById(R.id.onix);
        MirceaCelBatran = (Button) findViewById(R.id.mircea);
        Tractorul = (Button) findViewById(R.id.tractorul);
        LiceulTractorul = (Button) findViewById(R.id.liceu);
        Faget = (Button) findViewById(R.id.faget);
        Coresi = (Button) findViewById(R.id.coresi);
        NicolaeLabis = (Button) findViewById(R.id.labis);
        Rulmentul = (Button) findViewById(R.id.rulmentul);

        LivadaPostei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2LivadaPosteiTur.class);
                startActivity(i);
            }
        });
        Dramatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2DramaticRetur.class);
                startActivity(i);
            }
        });
        Castanilor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2CastanilorRetur.class);
                startActivity(i);
            }
        });
        Onix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2OnixRetur.class);
                startActivity(i);
            }
        });
        MirceaCelBatran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2MirceaCelBatranRetur.class);
                startActivity(i);
            }
        });
        Tractorul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2TractorulRetur.class);
                startActivity(i);
            }
        });
        LiceulTractorul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2LiceulTractorulRetur.class);
                startActivity(i);
            }
        });
        Faget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2FagetRetur.class);
                startActivity(i);
            }
        });

        Coresi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2CoresiRetur.class);
                startActivity(i);
            }
        });
        NicolaeLabis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2NicolarLabisRetur.class);
                startActivity(i);
            }
        });
        Rulmentul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia2Retur.this,Linia2Rulmentul.class);
                startActivity(i);
            }
        });
    }
}
