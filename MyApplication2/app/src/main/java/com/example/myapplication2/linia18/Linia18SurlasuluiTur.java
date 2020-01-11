package com.example.myapplication2.linia18;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplication2.R;

public class Linia18SurlasuluiTur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia18_surlasului_tur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia18/linia_SURLASULUI_I_Bariera_Bartolomeu_Fundaturii_cl(IAR_Ghimbav_1)_Surlasului.pdf").load();
    }
}