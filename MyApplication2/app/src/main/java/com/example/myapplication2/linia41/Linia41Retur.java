package com.example.myapplication2.linia41;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia41Retur extends AppCompatActivity {
   Button LivadaPostei;
   Button Dramatic;
   Button IuliuManiu;
   Button SpitalMarzescu;
   Button OperaBrasov;
   Button Morii;
   Button Autogara2;
   Button StadionulTineretului;
   Button Cosmesti;
   Button DimitrieAnghel;
   Button CimitirulCentral;
   Button StatieEpurare;
   Button PensiuneaStupina;
   Button Racordnorm;
   Button Merilor;
   Button Oitelor;
   Button Plugarilor;
   Button StupiniCentru;
   Button StupiniIzvorului;
   Button Dulgherului;
   Button Lujerului;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia41_retur);
    LivadaPostei= (Button) findViewById(R.id.livadaposteiRetur);
    LivadaPostei.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41LivadaPosteiRetur.class);
            startActivity(i);
        }
    });
    Dramatic= (Button) findViewById(R.id.dramaticRetur);
    Dramatic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41DramaticRetur.class);
            startActivity(i);
        }
    });
    IuliuManiu= (Button) findViewById(R.id.iuliumaniuRetur);
    IuliuManiu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41IuliuManiuRetur.class);
            startActivity(i);
        }
    });
    SpitalMarzescu= (Button) findViewById(R.id.spitalmarzescuRetur);
    SpitalMarzescu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41SpitalMarzescuRetur.class);
            startActivity(i);
        }
    });
    OperaBrasov= (Button) findViewById(R.id.operabrasovRetur);
    OperaBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41OperaBrasovRetur.class);
            startActivity(i);
        }
    });
    Morii= (Button) findViewById(R.id.moriiRetur);
    Morii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41MoriiRetur.class);
            startActivity(i);
        }
    });
    Autogara2= (Button) findViewById(R.id.autogara2Retur);
    Autogara2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41Autogara2Retur.class);
            startActivity(i);
        }
    });
    StadionulTineretului= (Button) findViewById(R.id.stadionultineretuluiRetur);
    StadionulTineretului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41StadionulTineretuluiRetur.class);
            startActivity(i);
        }
    });
    Cosmesti= (Button) findViewById(R.id.cosmestiRetur);
    Cosmesti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41CosmestiRetur.class);
            startActivity(i);
        }
    });
    DimitrieAnghel= (Button) findViewById(R.id.dimitrieanghelRetur);
    DimitrieAnghel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41DimitrieAnghelRetur.class);
            startActivity(i);
        }
    });
    CimitirulCentral= (Button) findViewById(R.id.cimitirulcentralRetur);
    CimitirulCentral.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41CimitirulCentralRetur.class);
            startActivity(i);
        }
    });
    StatieEpurare= (Button) findViewById(R.id.statieepurareRetur);
    StatieEpurare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41StatieEpurareRetur.class);
            startActivity(i);
        }
    });
    PensiuneaStupina= (Button) findViewById(R.id.pensiuneastupinaRetur);
    PensiuneaStupina.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41PensiuneaStupinaRetur.class);
            startActivity(i);
        }
    });
    Racordnorm= (Button) findViewById(R.id.racordnormRetur);
    Racordnorm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41RacordnormRetur.class);
            startActivity(i);
        }
    });
    Merilor= (Button) findViewById(R.id.merilorRetur);
    Merilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41MerilorRetur.class);
            startActivity(i);
        }
    });
    Oitelor= (Button) findViewById(R.id.oitelorRetur);
    Oitelor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41OitelorRetur.class);
            startActivity(i);
        }
    });
    Plugarilor= (Button) findViewById(R.id.plugarilorRetur);
    Plugarilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41PlugarilorRetur.class);
            startActivity(i);
        }
    });
    StupiniCentru= (Button) findViewById(R.id.stupinicentruRetur);
    StupiniCentru.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41StupiniCentruRetur.class);
            startActivity(i);
        }
    });
    StupiniIzvorului= (Button) findViewById(R.id.stupiniizvoruluiRetur);
    StupiniIzvorului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41StupiniIzvoruluiRetur.class);
            startActivity(i);
        }
    });
    Dulgherului= (Button) findViewById(R.id.dulgheruluiRetur);
    Dulgherului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41DulgheruluiRetur.class);
            startActivity(i);
        }
    });
    Lujerului= (Button) findViewById(R.id.lujeruluiRetur);
    Lujerului.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia41Retur.this, Linia41LujeruluiRetur.class);
            startActivity(i);
        }
    });
    }
}