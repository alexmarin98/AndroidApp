package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Linia4HidroARetur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia4_hidro_aretur);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_4_Livada_Postei_Gara_Brasov_Hidro_A.pdf").load();
    }
}
