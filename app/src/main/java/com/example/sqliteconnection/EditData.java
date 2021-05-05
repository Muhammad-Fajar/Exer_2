package com.example.sqliteconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditData extends AppCompatActivity {

    private EditText editNm,editTlpn;
    private Button btnbatal,btnsimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);

        editNm = findViewById(R.id.editNama);
        editTlpn = findViewById(R.id.editTelpon);
        btnbatal = findViewById(R.id.btnBatal);
        btnsimpan = findViewById(R.id.btnSimpan);


    }
}