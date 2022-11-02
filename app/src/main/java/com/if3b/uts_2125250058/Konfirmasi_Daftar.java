package com.if3b.uts_2125250058;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Konfirmasi_Daftar extends AppCompatActivity {
    private TextView tvNama, tvNomor, tvJalurPend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_daftar);
        tvNama = findViewById(R.id.tv_Nama);
        tvNomor = findViewById(R.id.tv_Nomor);
        tvJalurPend = findViewById(R.id.tv_Jalur_Pend);

        Intent intent = getIntent();
        tvNama.setText(intent.getStringExtra("varNama"));
        tvNomor.setText(intent.getStringExtra("varNomor"));
        tvJalurPend.setText(intent.getStringExtra("varJalur"));
    }
}