package com.example.myapplication2.linia5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication2.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Linia5MFacultativaTur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia5_mfacultativa_tur);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_FACULT_44_I_Stadionul_Municipal_Magurele_Facultativa.pdf").load();
    }
}