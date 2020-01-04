package com.example.myapplication2.linia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication2.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Linia2AuchanCoresiTur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia2_auchan_coresi);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_2_Rulmentul_Livada_Postei(Livada_Postei_1)_Auchan_Coresi.pdf").load();
    }
}
