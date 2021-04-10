package com.example.intentrecycleviewer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KeyboardCatalogMain extends AppCompatActivity {
    private RecyclerView rvCetak;
    private ArrayList<KeyboardCatalogModel> listItem = new ArrayList<>();
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        rvCetak = findViewById(R.id.rv);
        rvCetak.setHasFixedSize(true);
        listItem.addAll(CatalogData.getListDataK());

        showRecyclerList();
        back = findViewById(R.id.btn_back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent back = new Intent(KeyboardCatalogMain.this,MainActivity.class);
//                startActivity(back);
                finish();
            }
        });
    }

    private void showRecyclerList() {
        rvCetak.setLayoutManager(new GridLayoutManager(this, 2));
        KeyboardCatalogAdapter catAdapter = new KeyboardCatalogAdapter(this);
        catAdapter.setCatModels(listItem);
        rvCetak.setAdapter(catAdapter);
    }
}