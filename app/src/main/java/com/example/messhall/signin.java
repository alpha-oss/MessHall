package com.example.messhall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signin extends AppCompatActivity {

    EditText email2 , pass;
    Button signinBtn;

    private FirebaseAuth mAuth;
// ...
// Initialize Firebase Auth


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        email2 = findViewById(R.id.email2);
        pass = findViewById(R.id.pass);
        signinBtn = findViewById(R.id.signinBtn);

        mAuth = FirebaseAuth.getInstance();



        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String edata = email2.getText().toString();
                String pdata = pass.getText().toString();

//                if(edata.equals("admin") && pass.equals("Admin@123"))
//                {
//                    Intent intent = new Intent(signin.this,admin_dashboard.class);
//                    startActivity(intent);
//                }

                mAuth.signInWithEmailAndPassword(edata,pdata)
                        .addOnCompleteListener(signin.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    //Log.d(TAG, "signInWithEmail:success");
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    if(edata.equals("admin@gmail.com") && pdata.equals("Admin@123"))
                                    {
                                        Intent intent = new Intent(signin.this,admin_dashboard.class);
                                        startActivity(intent);
                                    }
                                    else
                                    {
                                        Intent intent=new Intent(signin.this,homeuser.class);
                                        startActivity(intent);
                                    }

                                    //updateUI(user);
                                } else {
                                    // If sign in fails, display a message to the user.
                                   // Log.w(TAG, "signInWithEmail:failure", task.getException());
                                    Toast.makeText(signin.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                    //updateUI(null);
                                }
                            }
                        });


            }
        });

    }
}