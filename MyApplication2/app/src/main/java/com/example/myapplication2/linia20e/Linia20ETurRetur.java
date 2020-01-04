package com.example.myapplication2.linia20e;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia20ETurRetur extends AppCompatActivity {
    Button Tur;
    Button Retur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia20e_tur_retur);
        Tur = (Button) findViewById(R.id.tur);
        Retur = (Button) findViewById(R.id.retur);
        Tur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia20ETurRetur.this,Linia20ETur.class);
                startActivity(i);
            }
        });
        Retur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia20ETurRetur.this,Linia20ERetur.class);
                startActivity(i);
            }
        });
    }
}