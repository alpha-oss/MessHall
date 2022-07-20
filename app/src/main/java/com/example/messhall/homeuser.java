package com.example.messhall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class homeuser extends AppCompatActivity {

    ImageButton menuBtn,feedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeuser);

        feedBtn=(ImageButton)findViewById(R.id.feedBtn);
        menuBtn=(ImageButton) findViewById(R.id.mnuBtn);

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(homeuser.this,menuPage.class);
                startActivity(intent);
            }
        });

        feedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homeuser.this,feedback.class);
                startActivity(intent);

            }
        });
    }
}