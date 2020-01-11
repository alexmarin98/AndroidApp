package com.example.myapplication2.linia18;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplication2.R;

public class Linia18GhDojaTur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia18_ghdoja_tur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia18/linia_GHEORGHE_DOJA_D_(IAR_Ghimbav_1)Fundaturii_cl_Bariera_Bartolomeu_Gh._Doja.pdf").load();
    }
}