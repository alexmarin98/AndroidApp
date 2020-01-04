package com.example.myapplication2.linia5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication2.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Linia5MCaramidarieiRetur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia5_mcaramidariei_retur);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_CARAMIDARIEI_Magurele_Stadionul_Municipal_Caramidariei.pdf").load();
    }
}
