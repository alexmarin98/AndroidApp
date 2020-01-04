package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Linia4DaciaTur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia4_dacia_tur);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_4_Gara_Brasov_Livada_Postei_Dacia.pdf").load();
    }
}
