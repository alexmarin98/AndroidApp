package com.example.myapplication2.linia28;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplication2.R;

public class Linia28IARGhimbavTur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia28_iarghimbav_tur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia28_tur_IARGhimbav.pdf").load();
    }
}