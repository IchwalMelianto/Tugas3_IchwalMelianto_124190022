package com.example.intentrecycleviewer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeadsetCatalogMain extends AppCompatActivity {
    private RecyclerView rvCetak;
    private ArrayList<HeadsetCatalogModel> listItem = new ArrayList<>();
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        rvCetak = findViewById(R.id.rv);
        rvCetak.setHasFixedSize(true);
        listItem.addAll(CatalogData.getListDataH());

        showRecyclerList();
        back = findViewById(R.id.btn_back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(HeadsetCatalogMain.this,MainActivity.class);
                startActivity(back);
            }
        });
    }

    private void showRecyclerList() {
        rvCetak.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        HeadsetCatalogAdapter catAdapter = new HeadsetCatalogAdapter(this);
        catAdapter.setCatModels(listItem);
        rvCetak.setAdapter(catAdapter);
    }
}