package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Linia5primarieRetur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia5primarie);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_5_Roman_Stad._Municipal_Primarie.pdf").load();
    }
}
