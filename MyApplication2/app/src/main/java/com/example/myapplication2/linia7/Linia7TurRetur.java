package com.example.myapplication2.linia7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication2.R;

public class Linia7TurRetur extends AppCompatActivity {
    Button Tur;
    Button Retur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia7_tur_retur);
        Tur = (Button) findViewById(R.id.tur);
        Retur = (Button) findViewById(R.id.retur);
        Tur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia7TurRetur.this,Linia7Tur.class);
                startActivity(i);
            }
        });
        Retur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Linia7TurRetur.this,Linia7Retur.class);
                startActivity(i);
            }
        });
    }
}