package com.example.myapplication2.linia17b;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplication2.R;

public class Linia17BHaltaTimisulDeJosTur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia17b_haltatimisuldejos_tur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia_17b_Gara_Brasov_Benzinaria_Petrom_Halta_Timisul_de_Jos.pdf").load();
    }
}