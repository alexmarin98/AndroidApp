package com.example.myapplication2.linia18;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplication2.R;

public class Linia18FacultativaIITur extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linia18_facultativaii_tur);
        PDFView pdfView = (PDFView)findViewById(R.id.pdfViewTur);
        pdfView.fromAsset("linia18/linia_FACULTATIVA2_18_I_Bariera_Bartolomeu_Fundaturii_cl(IAR_Ghimbav_1)_Facultativa_II.pdf").load();
    }
}