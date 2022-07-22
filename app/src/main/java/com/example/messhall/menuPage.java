package com.example.messhall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menuPage extends AppCompatActivity {

    ImageButton btnBreak,btnLunch,btnDinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        btnBreak=(ImageButton) findViewById(R.id.btnBreak);
        btnLunch=(ImageButton) findViewById(R.id.btnLunch);
        btnDinner=(ImageButton) findViewById((R.id.btnDinner));

        btnBreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(menuPage.this,breakfast.class);
                startActivity(intent);
            }
        });
        btnLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(menuPage.this,lunch.class);
                startActivity(intent);
            }
        });
        btnDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(menuPage.this,foodOptions.class);
                startActivity(intent);
            }
        });
    }
}