package com.example.tugasaplikasi3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button btnSepatu;

    Button btnBaju;

    Button btnJacket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSepatu = findViewById(R.id.btnSepatu);
        Button btnBaju = findViewById(R.id.btnBaju);
        Button btnJacket = findViewById(R.id.btnJacket);

        btnSepatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sepatu = new Intent(MainActivity.this, SepatuActivity.class);
                startActivity(sepatu);
            }
        });
        btnBaju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baju = new Intent(MainActivity.this, BajuActivity.class);
                startActivity(baju);
            }
        });
        btnJacket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jacket = new Intent(MainActivity.this, JacketActivity.class);
                startActivity(jacket);
            }
        });
    }
}
