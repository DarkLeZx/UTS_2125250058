package com.if3b.uts_2125250058;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText etNama, etNomor;
private Spinner spJalurPend;
private CheckBox cbkonfirmasi;
private Button btnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = findViewById(R.id.et_Nama);
        etNomor = findViewById(R.id.et_Pendaftaran);
        spJalurPend = findViewById(R.id.sp_Jalur_Pend);
        cbkonfirmasi = findViewById(R.id.cb_konfirmasi);


        btnDaftar = findViewById(R.id.btn_Daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama, nomor, jalur ;
                boolean konfirmasi;


                nama = etNama.getText().toString();
                nomor = etNomor.getText().toString();
                jalur = spJalurPend.getSelectedItem().toString();
                konfirmasi = cbkonfirmasi.isChecked();

                if (nama.trim().isEmpty()) {
                    etNama.setError("Nama Belum Di Isi !!!");
                } else if (nomor.trim().isEmpty()) {
                    etNomor.setError("Nomor Pendaftaran Belum Di Isi !!!");
                } else if (jalur.trim().isEmpty() || jalur.equals("Jalur Pendaftaran")) {
                    Toast.makeText(MainActivity.this, "Mohon Pilih Jalur Pendaftaran Yang Tersedia !!!", Toast.LENGTH_SHORT).show();
                }
                else if (konfirmasi != true)
                {
                    Toast.makeText(MainActivity.this, "Mohon Centang Untuk Konfirmasi", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this,Konfirmasi_Daftar.class);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varNomor", nomor);
                    intent.putExtra("varJalur", jalur);

                    startActivity(intent);
                }


            }

    });
}}