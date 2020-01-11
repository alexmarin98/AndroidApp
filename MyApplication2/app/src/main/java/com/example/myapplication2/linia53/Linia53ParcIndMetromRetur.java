package com.example.myapplication2.linia53;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplication2.R;

public class Linia53ParcIndMetromRetur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia53_parcindmetrom_retur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia53_PARC_IND_METROM_D_Panselelor_Facultate_Constructii_Parc_Ind._Metrom (1).pdf").load();
    }
}