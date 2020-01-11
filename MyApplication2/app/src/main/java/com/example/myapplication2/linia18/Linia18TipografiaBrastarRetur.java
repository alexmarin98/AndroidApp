package com.example.myapplication2.linia18;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplication2.R;

public class Linia18TipografiaBrastarRetur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia18_tipografiabrastar_retur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia18/linia_TIPOGRAFIA_BRAS_D_(IAR_Ghimbav_1)Fundaturii_cl_Bariera_Bartolomeu_Tipografia_Brastar.pdf").load();
    }
}