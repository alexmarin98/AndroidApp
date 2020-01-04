package com.example.myapplication2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication2.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Linia1Autogara3Retur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia1_autogara3_retur);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_1_Triaj_Livada_Postei_Autogara_3.pdf").load();
    }
}
