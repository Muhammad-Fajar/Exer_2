package com.example.sqliteconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.sqliteconnection.database.DBController;

public class MenampilanData extends AppCompatActivity {

    DBController controller = new DBController(this);

    TextView tNama,tTelpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menampilan_data);

        tNama = findViewById(R.id.textNama);
        tTelpon = findViewById(R.id.textTelpon);



    }
}