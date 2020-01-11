package com.example.myapplication2.linia33;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplication2.R;

public class Linia33VulturuluiRetur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia33_vulturului_retur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia33/linia_VULTURUL_I_Valea_Cetatii_Roman_Vulturului.pdf").load();
    }
}