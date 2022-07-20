package com.example.messhall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    EditText uname , pass;
    Button signinBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        uname = findViewById(R.id.uname);
        pass = findViewById(R.id.pass);
        signinBtn = findViewById(R.id.signinBtn);

        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String udata = uname.getText().toString();
                String pdata = pass.getText().toString();

                if(udata=="admin" && pdata=="admin"){
                    Intent intent = new Intent(signin.this,admin_dashboard.class);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(signin.this,"invalid credentials",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}