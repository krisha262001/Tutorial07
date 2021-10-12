package com.example.tutorial07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String User = getIntent().getStringExtra("uname");

        TextView t1 = (TextView)findViewById(R.id.txtWelcomeMessage);
        t1.setText("Welcome " + User);


    }
}