package com.if3b.uts_2125250058;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

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
                String nama,nomor, jalur, konfirmasi;


                nama = etNama.getText().toString();
                nomor = etNomor.getText().toString();
                jalur = spJalurPend.getSelectedItem().toString();
                konfirmasi = cbkonfirmasi.isChecked()
            }
        });

    }
}