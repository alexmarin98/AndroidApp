package com.example.myapplication2.linia18;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplication2.R;

public class Linia18IARGhimbavRetur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia18_iarghimbav_retur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia18_retur_IARGhimbav.pdf").load();
    }
}