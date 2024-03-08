package com.example.tugasaplikasi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BajuActivity extends AppCompatActivity {

    ImageButton imageb1;

    ImageButton imageb2;

    ImageButton imageb3;

    ImageButton imageb4;

    ImageButton imageb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baju);

        ImageButton imageb1 = findViewById(R.id.imageb1);
        ImageButton imageb2 = findViewById(R.id.imageb2);
        ImageButton imageb3 = findViewById(R.id.imageb3);
        ImageButton imageb4 = findViewById(R.id.imageb4);
        ImageButton imageb5 = findViewById(R.id.imageb5);

        imageb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent baju1 = new Intent(BajuActivity.this, DetailActivity.class);
                    startActivity(baju1);
                }
            });

        imageb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent baju2 = new Intent(BajuActivity.this, DetailActivity.class);
                    startActivity(baju2);
                }
            });

        imageb3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent baju3 = new Intent(BajuActivity.this, DetailActivity.class);
                    startActivity(baju3);
                }
            });

        imageb4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent baju4 = new Intent(BajuActivity.this, DetailActivity.class);
                    startActivity(baju4);
                }
            });

        imageb5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent baju5 = new Intent(BajuActivity.this, DetailActivity.class);
                    startActivity(baju5);
                }
        });
    }
}

