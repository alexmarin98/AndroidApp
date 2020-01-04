package com.example.myapplication2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication2.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Linia1VlahutaTur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia1_vlahuta_tur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_1_Livada_Postei_Triaj_Vlahuta.pdf").load();
    }
}
