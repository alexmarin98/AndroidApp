package com.example.myapplication2.linia51;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia51Retur extends AppCompatActivity {
   Button Tocile;
   Button PiataUnirii;
   Button LiceulSaguna;
   Button Balcescu;
   Button Star;
   Button Castanilor;
   Button Onix;
   Button MirceaCelBatran;
   Button Faget;
   Button GaraBrasov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia51_retur);
    Tocile= (Button) findViewById(R.id.tocileRetur);
    Tocile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Retur.this, Linia51TocileRetur.class);
            startActivity(i);
        }
    });
    PiataUnirii= (Button) findViewById(R.id.piatauniriiRetur);
    PiataUnirii.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Retur.this, Linia51PiataUniriiRetur.class);
            startActivity(i);
        }
    });
    LiceulSaguna= (Button) findViewById(R.id.liceulsagunaRetur);
    LiceulSaguna.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Retur.this, Linia51LiceulSagunaRetur.class);
            startActivity(i);
        }
    });
    Balcescu= (Button) findViewById(R.id.balcescuRetur);
    Balcescu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Retur.this, Linia51BalcescuRetur.class);
            startActivity(i);
        }
    });
    Star= (Button) findViewById(R.id.starRetur);
    Star.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Retur.this, Linia51StarRetur.class);
            startActivity(i);
        }
    });
    Castanilor= (Button) findViewById(R.id.castanilorRetur);
    Castanilor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Retur.this, Linia51CastanilorRetur.class);
            startActivity(i);
        }
    });
    Onix= (Button) findViewById(R.id.onixRetur);
    Onix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Retur.this, Linia51OnixRetur.class);
            startActivity(i);
        }
    });
    MirceaCelBatran= (Button) findViewById(R.id.mirceacelbatranRetur);
    MirceaCelBatran.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Retur.this, Linia51MirceaCelBatranRetur.class);
            startActivity(i);
        }
    });
    Faget= (Button) findViewById(R.id.fagetRetur);
    Faget.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Retur.this, Linia51FagetRetur.class);
            startActivity(i);
        }
    });
    GaraBrasov= (Button) findViewById(R.id.garabrasovRetur);
    GaraBrasov.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Linia51Retur.this, Linia51GaraBrasovRetur.class);
            startActivity(i);
        }
    });
    }
}