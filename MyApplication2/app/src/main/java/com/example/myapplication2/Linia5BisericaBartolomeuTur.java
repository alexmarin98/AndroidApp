package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Linia5BisericaBartolomeuTur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia5_biserica_bartolomeu_tur);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_5_Stad._Municipal_Roman_Biserica_Bartolomeu.pdf").load();
    }
}
