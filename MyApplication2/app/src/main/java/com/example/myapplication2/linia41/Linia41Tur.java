package com.example.myapplication2.linia41;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia41Tur extends AppCompatActivity {
   Button Lujerului;
   Button Dulgherului;
   Button StupiniIzvorului;
   Button StupiniCentru;
   Button Plugarilor;
   Button Oitelor;
   Button Merilor;
   Button Racordnorm;
   Button PensiuneaStupina;
   Button StatieEpurare;
   Button CimitirulCentral;
   Button DimitrieAnghel;
   Button BarieraBartolomeu;
   Button ComplexBartolomeu;
   Button Autogara2;
   Button Morii;
   Button OperaBrasov;
   Button Rial;
   Button IuliuManiu;
   Button Primarie;
   Button LivadaPostei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia41_tur);
    Lujerului= (Button) findViewById(R.id.lujeruluiTur);
    Lujerului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41LujeruluiTur.class);
            startActivity(i);
        }
    });
    Dulgherului= (Button) findViewById(R.id.dulgheruluiTur);
    Dulgherului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41DulgheruluiTur.class);
            startActivity(i);
        }
    });
    StupiniIzvorului= (Button) findViewById(R.id.stupiniizvoruluiTur);
    StupiniIzvorului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41StupiniIzvoruluiTur.class);
            startActivity(i);
        }
    });
    StupiniCentru= (Button) findViewById(R.id.stupinicentruTur);
    StupiniCentru.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41StupiniCentruTur.class);
            startActivity(i);
        }
    });
    Plugarilor= (Button) findViewById(R.id.plugarilorTur);
    Plugarilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41PlugarilorTur.class);
            startActivity(i);
        }
    });
    Oitelor= (Button) findViewById(R.id.oitelorTur);
    Oitelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41OitelorTur.class);
            startActivity(i);
        }
    });
    Merilor= (Button) findViewById(R.id.merilorTur);
    Merilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41MerilorTur.class);
            startActivity(i);
        }
    });
    Racordnorm= (Button) findViewById(R.id.racordnormTur);
    Racordnorm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41RacordnormTur.class);
            startActivity(i);
        }
    });
    PensiuneaStupina= (Button) findViewById(R.id.pensiuneastupinaTur);
    PensiuneaStupina.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41PensiuneaStupinaTur.class);
            startActivity(i);
        }
    });
    StatieEpurare= (Button) findViewById(R.id.statieepurareTur);
    StatieEpurare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41StatieEpurareTur.class);
            startActivity(i);
        }
    });
    CimitirulCentral= (Button) findViewById(R.id.cimitirulcentralTur);
    CimitirulCentral.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41CimitirulCentralTur.class);
            startActivity(i);
        }
    });
    DimitrieAnghel= (Button) findViewById(R.id.dimitrieanghelTur);
    DimitrieAnghel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41DimitrieAnghelTur.class);
            startActivity(i);
        }
    });
    BarieraBartolomeu= (Button) findViewById(R.id.barierabartolomeuTur);
    BarieraBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41BarieraBartolomeuTur.class);
            startActivity(i);
        }
    });
    ComplexBartolomeu= (Button) findViewById(R.id.complexbartolomeuTur);
    ComplexBartolomeu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41ComplexBartolomeuTur.class);
            startActivity(i);
        }
    });
    Autogara2= (Button) findViewById(R.id.autogara2Tur);
    Autogara2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41Autogara2Tur.class);
            startActivity(i);
        }
    });
    Morii= (Button) findViewById(R.id.moriiTur);
    Morii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41MoriiTur.class);
            startActivity(i);
        }
    });
    OperaBrasov= (Button) findViewById(R.id.operabrasovTur);
    OperaBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41OperaBrasovTur.class);
            startActivity(i);
        }
    });
    Rial= (Button) findViewById(R.id.rialTur);
    Rial.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41RialTur.class);
            startActivity(i);
        }
    });
    IuliuManiu= (Button) findViewById(R.id.iuliumaniuTur);
    IuliuManiu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41IuliuManiuTur.class);
            startActivity(i);
        }
    });
    Primarie= (Button) findViewById(R.id.primarieTur);
    Primarie.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41PrimarieTur.class);
            startActivity(i);
        }
    });
    LivadaPostei= (Button) findViewById(R.id.livadaposteiTur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Tur.this, Linia41LivadaPosteiTur.class);
            startActivity(i);
        }
    });
    }
}