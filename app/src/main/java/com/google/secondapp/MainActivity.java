package com.google.secondapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.secondapp.R;

public class MainActivity extends AppCompatActivity {
    Button clickMe;
    TextView txMyTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txMyTest = findViewById(R.id.myText);


        clickMe = findViewById(R.id.button);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txMyTest.setText("welcome to my app");
            }
        });
    }
}