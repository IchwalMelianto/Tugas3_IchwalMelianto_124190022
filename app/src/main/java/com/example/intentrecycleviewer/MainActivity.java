package com.example.intentrecycleviewer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button bt_wdata,bt_call,bt_mcatalog,bt_kcatalog,bt_hcatalog;
    TextView nama,jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_mcatalog   = findViewById(R.id.btn_Mcatalog);
        bt_kcatalog   = findViewById(R.id.btn_Kcatalog);
        bt_hcatalog   = findViewById(R.id.btn_Hcatalog);
        bt_wdata  = findViewById(R.id.btn_wdata);
        bt_call   = findViewById(R.id.btn_call);
        nama   = findViewById(R.id.et_nama);
        jumlah = findViewById(R.id.et_jumlah);

        //MouseCatalogMain
        bt_mcatalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mcat = new Intent(MainActivity.this, MouseCatalogMain.class);
                startActivity(mcat);
            }
        });

        //KeyboardCatalogMain
        bt_kcatalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kcat = new Intent(MainActivity.this, KeyboardCatalogMain.class);
                startActivity(kcat);
            }
        });

        //HeadsetCatalogMain
        bt_hcatalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hcat = new Intent(MainActivity.this, HeadsetCatalogMain.class);
                startActivity(hcat);
            }
        });

        //WithData
        bt_wdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent wdata = new Intent(MainActivity.this,WData.class);
                    wdata.putExtra("et_nama",nama.getText().toString());
                    wdata.putExtra("et_jumlah",Integer.parseInt(jumlah.getText().toString()));
                    startActivity(wdata);
                }
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Harap isikan nama dan jumlah barang terlebih dahulu!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Telepon
        bt_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:081804214824"));
                startActivity(call);
            }
        });
    }
}