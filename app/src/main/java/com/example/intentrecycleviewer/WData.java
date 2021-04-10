package com.example.intentrecycleviewer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WData extends AppCompatActivity {
    TextView tv_Hasil;
    Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wdata);

        tv_Hasil = findViewById(R.id.tv_konfirmasi);

        String nama = getIntent().getStringExtra("et_nama");
        int jumlah = getIntent().getIntExtra("et_jumlah",0);

        String hasil = "Terima Kasih\nAnda Telah Melakukan Order :\n"+nama+"\n\nDengan Jumlah : "+jumlah;
        tv_Hasil.setText(hasil);

        kembali = findViewById(R.id.btn_back1);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent kembali = new Intent(WData.this,MainActivity.class);
//                startActivity(kembali);
                finish();
            }
        });
    }
}
