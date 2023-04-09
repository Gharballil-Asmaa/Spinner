package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner Sp=findViewById(R.id.sp);

        ArrayList<com.example.spinner.data_item> spCategory= new ArrayList<data_item>();
        spCategory.add(new com.example.spinner.data_item("Homme", R.drawable.p2,"Vetements -Accessoires - chaussures"));
        spCategory.add(new com.example.spinner.data_item("Femme",R.drawable.p1,"Vetements -Accessoires - chaussures"));
        spCategory.add(new com.example.spinner.data_item("Enfants",R.drawable.p3,"Vetements -Accessoires - chaussures - jeux"));
        spinner_adapter a1 = new spinner_adapter(this, R.id.mainview,spCategory);

        Sp.setAdapter(a1);




    }
}