package com.example.intentrecycleviewer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MouseCatalogMain extends AppCompatActivity {
    private RecyclerView rvCetak;
    private ArrayList<MouseCatalogModel> listItem = new ArrayList<>();
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        rvCetak = findViewById(R.id.rv);
        rvCetak.setHasFixedSize(true);
        listItem.addAll(CatalogData.getListDataM());

        showRecyclerList();
        back = findViewById(R.id.btn_back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(MouseCatalogMain.this,MainActivity.class);
                startActivity(back);
            }
        });
    }

    private void showRecyclerList() {
        rvCetak.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        MouseCatalogAdapter catAdapter = new MouseCatalogAdapter(this);
        catAdapter.setCatModels(listItem);
        rvCetak.setAdapter(catAdapter);
    }
}
