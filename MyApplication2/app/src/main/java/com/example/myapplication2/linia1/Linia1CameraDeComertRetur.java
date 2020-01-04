package com.example.myapplication2.linia1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication2.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Linia1CameraDeComertRetur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia1_camera_de_comert_retur);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_1_Triaj_Livada_Postei_Camera_de_Comert.pdf").load();
    }
}
