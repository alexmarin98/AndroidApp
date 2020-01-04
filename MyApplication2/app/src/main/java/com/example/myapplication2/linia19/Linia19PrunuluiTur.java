package com.example.myapplication2.linia19;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplication2.R;

public class Linia19PrunuluiTur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia19_prunului_tur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia19_tur_Prunului.pdf").load();
    }
}