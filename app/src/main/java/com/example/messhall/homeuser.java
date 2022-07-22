package com.example.messhall;

import static java.time.LocalDate.now;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class homeuser extends AppCompatActivity {

    ImageButton menuBtn,feedBtn;
    Button logout;
    TextView date1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeuser);



        feedBtn=(ImageButton)findViewById(R.id.feedBtn);
        menuBtn=(ImageButton) findViewById(R.id.mnuBtn);
        logout=(Button)findViewById(R.id.logout);
        date1=findViewById(R.id.date);
        date1.setText(java.time.LocalDate.now().toString());

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

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(homeuser.this,MainActivity.class);
                startActivity(intent);

            }
        });



        java.util.Date date = new java.util.Date();
        //Toast.makeText(this,date.toString(),Toast.LENGTH_LONG).show();
    }
}