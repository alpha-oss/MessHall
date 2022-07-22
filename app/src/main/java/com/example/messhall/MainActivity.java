package com.example.messhall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    Button logBtn , regBtn;

    private FirebaseAuth mAuth;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            // Check if user is signed in (non-null) and update UI accordingly.
//            FirebaseUser currentUser = mAuth.getCurrentUser();
//            if(currentUser != null){
//                Intent intent = new Intent(MainActivity.this,homeuser.class);
//                startActivity(intent);
//            }



        logBtn = findViewById(R.id.logBtn);
        regBtn = findViewById(R.id.regBtn);

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
//                    Intent intent = new Intent(getBaseContext(),signin.class);
//                    startActivity(intent);
                    Intent intent = new Intent(getBaseContext(),signin.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,signup.class);
                startActivity(intent2);
            }
        });

    }
}