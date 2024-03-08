package com.example.tugasaplikasi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class JacketActivity extends AppCompatActivity {

    ImageButton imagej1;

    ImageButton imagej2;

    ImageButton imagej3;

    ImageButton imagej4;

    ImageButton imagej5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jacket);

        ImageButton imagej1 = findViewById(R.id.imagej1);
        ImageButton imagej2 = findViewById(R.id.imagej2);
        ImageButton imagej3 = findViewById(R.id.imagej3);
        ImageButton imagej4 = findViewById(R.id.imagej4);
        ImageButton imagej5 = findViewById(R.id.imagej5);

        imagej1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jacket1 = new Intent(JacketActivity.this, DetailActivity.class);
                startActivity(jacket1);
            }
        });

        imagej2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jacket2 = new Intent(JacketActivity.this, DetailActivity.class);
                startActivity(jacket2);
            }
        });

        imagej3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jacket3 = new Intent(JacketActivity.this, DetailActivity.class);
                startActivity(jacket3);
            }
        });

        imagej4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jacket4 = new Intent(JacketActivity.this, DetailActivity.class);
                startActivity(jacket4);
            }
        });

        imagej5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jacket5 = new Intent(JacketActivity.this, DetailActivity.class);
                startActivity(jacket5);
            }
        });
    }
}