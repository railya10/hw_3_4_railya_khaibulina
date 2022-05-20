package com.example.hw_3_4_railya_khaibulina.secondActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hw_3_4_railya_khaibulina.R;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView= findViewById( R.id.second_text);


        textView.setText(getIntent().getStringExtra("text"));

    }
}