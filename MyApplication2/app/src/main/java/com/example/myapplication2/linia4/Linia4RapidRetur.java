package com.example.myapplication2.linia4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication2.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Linia4RapidRetur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia4_rapid_retur);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_4_Livada_Postei_Gara_Brasov_Rapid.pdf").load();
    }
}
