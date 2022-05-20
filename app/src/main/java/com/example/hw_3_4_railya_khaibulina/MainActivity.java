package com.example.hw_3_4_railya_khaibulina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw_3_4_railya_khaibulina.fragmentwithrecycler.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container1, new FragmentOne()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container2, new FragmentTwo()).commit();

    }


}