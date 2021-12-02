package com.geektech.thoughtprojeckt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acrivity);
        textView = findViewById(R.id.tv_secondActivity);
        String operation = getIntent().getStringExtra("allResult");
        textView.setText(operation);
    }
}