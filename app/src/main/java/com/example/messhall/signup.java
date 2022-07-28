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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class signup extends AppCompatActivity {

    EditText email,password,name,usn,roomno,year,contactno,confpass;
    Button signupBtn;
//    .+)@([a-z][A-Z]+/.[a-z][A-Z]+)$
//    ^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$


    String regularExpr="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@$!])[A-Za-z0-9@$!]{8,}$";
    //String  regex = "\\\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        email = findViewById(R.id.email);
        password=findViewById(R.id.password);
        signupBtn= findViewById(R.id.signupBtn);
        name = findViewById(R.id.name);
        usn=findViewById(R.id.usn);
        roomno=findViewById(R.id.roomNo);
        year=findViewById(R.id.year);
        contactno=findViewById(R.id.contactNo);
        confpass=findViewById(R.id.password1);

        String pass1=password.getText().toString();





        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass1=password.getText().toString();
                String confpass1=confpass.getText().toString();


//                if (isValidPassword(password.getText().toString().trim())) {
//                    Toast.makeText(signup.this, "Valid", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(signup.this, "InValid", Toast.LENGTH_SHORT).show();
//                }
//            }

//                if(!(confpass1.equals(pass1)))
//                {
//                    Toast.makeText(signup.this,"Password is not same", Toast.LENGTH_SHORT).show();
//                }

//                if(contactno1.length()!=10)
//                {
//                    Toast.makeText(signup.this,"Contact number length is invalid", Toast.LENGTH_SHORT).show();
//                }

                                if (isValidPassword(password.getText().toString().trim())) {


//                                    Toast.makeText(signup.this, "Valid", Toast.LENGTH_SHORT).show();
                                    if((confpass1.equals(pass1))) {
//                                        Toast.makeText(signup.this, "Password is not same", Toast.LENGTH_SHORT).show();
                                        FirebaseAuth mAuth;
                                        mAuth = FirebaseAuth.getInstance();
                                        mAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())


                                                .addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                                        Toast.makeText(signup.this, "createUserWithEmail:onComplete:" + task.isSuccessful(), Toast.LENGTH_SHORT).show();
//                                progressBar.setVisibility(View.GONE);
//                                generateUser(email, password)

                                                        if (!task.isSuccessful()) {
                                                            Toast.makeText(signup.this, "Authentication failed." + task.getException(),
                                                                    Toast.LENGTH_SHORT).show();
                                                        } else {
//                                    startActivity(new Intent(this, MainActivity.class));
//                                    finish();

                                                            String email1 = email.getText().toString();
                                                            String pass1 = password.getText().toString();
                                                            String name1 = name.getText().toString();
                                                            String usn1 = usn.getText().toString();
                                                            String roomno1 = roomno.getText().toString();
                                                            String year1 = year.getText().toString();
                                                            String confpass1 = confpass.getText().toString();
                                                            String contactno1 = contactno.getText().toString();

                                                            FirebaseUser user = mAuth.getCurrentUser();
                                                            Map<String, Object> city = new HashMap<>();
                                                            city.put("name", name1);
                                                            city.put("email", email1);
                                                            city.put("usn", usn1);
                                                            city.put("year", year1);
                                                            city.put("roomNo", roomno1);
                                                            city.put("contactNo", contactno1);
                                                            city.put("password", pass1);

                                                            FirebaseFirestore db = FirebaseFirestore.getInstance();
                                                            db.collection("users")
                                                                    .document(user.getUid())
                                                                    .set(city)
                                                                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                                                                        @Override
                                                                        public void onSuccess(Void aVoid) {
                                                                            //Log.d(, "DocumentSnapshot successfully written!");
                                                                            //
                                                                            Intent intent = new Intent(signup.this, signin.class);
                                                                            startActivity(intent);
                                                                        }
                                                                    })
                                                                    .addOnFailureListener(new OnFailureListener() {
                                                                        @Override
                                                                        public void onFailure(@NonNull Exception e) {
                                                                            //  Log.w(TAG, "Error writing document", e);
                                                                        }
                                                                    });

                                                            //
                                                        }
                                                    }
                                                });


                                    }
                                    else
                                    {
                                        Toast.makeText(signup.this, "Password is not same", Toast.LENGTH_SHORT).show();
                                    }

                                }
                                else {
                                    Toast.makeText(signup.this, "Invalid Password or Email", Toast.LENGTH_SHORT).show();
                                }


            }
        });


    }

    public boolean isValidPassword(final String pass1) {

        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile(regularExpr);
        matcher = pattern.matcher(pass1);

        return matcher.matches();

    }
//    public boolean isValidEmail(final String email1)
//    {
//        Pattern pattern;
//        Matcher matcher;
//
//        pattern = Pattern.compile(regex);
//        matcher = pattern.matcher(email1);
//
//        return matcher.matches();
//
//    }


}
