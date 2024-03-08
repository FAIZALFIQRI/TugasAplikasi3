package com.example.tugasaplikasi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SepatuActivity extends AppCompatActivity {

    ImageButton images1;

    ImageButton images2;

    ImageButton images3;

    ImageButton images4;

    ImageButton images5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepatu);

        ImageButton images1 = findViewById(R.id.images1);
        ImageButton images2 = findViewById(R.id.images2);
        ImageButton images3 = findViewById(R.id.images3);
        ImageButton images4 = findViewById(R.id.images4);
        ImageButton images5 = findViewById(R.id.images5);

        images1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sepatu1 = new Intent(SepatuActivity.this, DetailActivity.class);
                startActivity(sepatu1);
            }
        });

        images2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sepatu2 = new Intent(SepatuActivity.this, DetailActivity.class);
                startActivity(sepatu2);
            }
        });

        images3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sepatu3 = new Intent(SepatuActivity.this, DetailActivity.class);
                startActivity(sepatu3);
            }
        });

        images4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sepatu4 = new Intent(SepatuActivity.this, DetailActivity.class);
                startActivity(sepatu4);
            }
        });

        images5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sepatu5 = new Intent(SepatuActivity.this, DetailActivity.class);
                startActivity(sepatu5);
            }
        });
    }
}