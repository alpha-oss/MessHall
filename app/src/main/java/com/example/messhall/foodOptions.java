package com.example.messhall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class foodOptions extends AppCompatActivity {

    Button vegBtn,nonVegBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_options);

        vegBtn =findViewById(R.id.vegBtn);
        nonVegBtn=findViewById(R.id.nonVegBtn);


        vegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Enabled";
                Bundle bundle = new Bundle();
                bundle.putString("Enabled",str);
                Intent intent =new Intent(foodOptions.this,dinner.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        nonVegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Disabled";
                Bundle bundle = new Bundle();
                bundle.putString("Next",str);
                Intent intent =new Intent(foodOptions.this,dinner.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }
}