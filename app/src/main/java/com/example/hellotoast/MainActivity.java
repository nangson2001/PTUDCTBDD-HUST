package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;
    Button btnToast, btnCount;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        process();
    }

    public void process() {
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Toast!!", Toast.LENGTH_SHORT).show();
            }
        });
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                txtNumber.setText(Integer.toString(count));
            }
        });
    }

    public void mapping() {
        txtNumber = findViewById(R.id.textView);
        btnCount = findViewById(R.id.button_count);
        btnToast = findViewById(R.id.button_toast);
    }
}